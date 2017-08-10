/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

/**
 *
 * @author Tatha
 */
public class PRACTICE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       ArrayList<String> data=new ArrayList<String>();
       final String url="jdbc:mysql://mis-sql.uhcl.edu/kurapativ5434";
       Connection conn=null;
       Statement stat= null;
       ResultSet rs= null;
       try
       {
           conn=DriverManager.getConnection(url,"kurapativ5434","1447544");
           stat=conn.createStatement();
           rs=stat.executeQuery("select * from msg");
           while(rs.next())
           {
               System.out.println(rs.getString("content"));
           }
       }
       catch(SQLException e)
       {
           e.printStackTrace();
       }
       
       
    }
    
}
