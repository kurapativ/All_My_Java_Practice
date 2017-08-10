/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondprogram;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class SecondProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int i,j,k;
        String today="";
        String elapsed="";
        System.out.println("Enter today's day number:");
        i=input.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        k=input.nextInt();
        if(i==0)
        {
            today="sunday";
            
        }
        else if(i==1)
        {
            today="monday";
        }
        else if(i==2)
        {
            today="tuesday";
        }
        else if(i==3)
        {
            today="wednesday";
        }
        else if(i==4)
        {
            today="thursday";
        }
        else if(i==5)
        {
            today="friday";
        }
        else if(i==6)
        {
            today="saturday";
        }
        k=k+i;
                
        j=k%7;
        
        System.out.println();
        if(j==0)
        {
            elapsed="sunday";
        }
        else if(j==1)
        {
            elapsed="monday";

        }
        else if(j==2)
        {
            elapsed="tuesday";

        }
        else if(j==3)
        {
            elapsed="wednesday";

        }
        else if(j==4)
        {
            elapsed ="thursday";

        }
        else if(j==5)
        {
            elapsed="friday";

        }
        else if(j==6)
        {
            elapsed="saturday";

        }
        System.out.println();
        System.out.printf("Today is %s the future day is %s",today,elapsed);
    }
    
}
