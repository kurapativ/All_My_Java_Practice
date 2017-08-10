/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b,c, counter=0;
        System.out.println("enter a, b, c values");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if ((((a-b)>=5)&&((c-a)>=5))||(((b-a)>=5)&&((a-c)>=5)))
        {
             System.out.println();
             System.out.printf("%d",a);
            
        }
        else if ((((b-a)>=5&&(c-b)>=5))||(((b-c)>=5&&(a-b)>=5)))
        {
             System.out.println();
             System.out.printf("%d",b);
             
        }
        else if ((((c-a)>=5&&(b-c)>=5))||(((a-c)>=5&&(c-a)>=5)))
        {
             System.out.println();
             System.out.printf("%d",c);
             
        }
             
       
         else{
             System.out.println();
            System.out.printf("none of %d,%d,%d satisfy the condition",a,b,c);
            System.out.println();  
         }
             
            
           }
    }
    

