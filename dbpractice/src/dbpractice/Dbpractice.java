/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tatha
 */
public class Dbpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final String url="jdbc:mysql://mis-sql.uhcl.edu/kurapativ5434";
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null,rs1=null;
        
        try
        {
            conn=DriverManager.getConnection(url,"kurapativ5434","1447544");
            stat=conn.createStatement();
            rs=stat.executeQuery("select * from user");
            while(rs.next())
            {
                System.out.println(rs.getString("name"));
            }
            int i=10019,j=10021,p=10005;
            
            int r=stat.executeUpdate("insert into friendrelation values ('"+i+"','"+j+"')");
            String k="hellooo jiiiiii";
            int t=stat.executeUpdate("update relationstatus set msg='"+k+"' where senderid="+p);
            int z=stat.executeUpdate("rollback");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
}
