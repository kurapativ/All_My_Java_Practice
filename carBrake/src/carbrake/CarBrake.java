/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carbrake;

import java.util.Scanner;

/**
 *
 * @author Tatha
 */
public class CarBrake {

   /**
     * @param args the command line arguments
     */
    public static boolean isInteger(String s) {
    
        try
        {
            int i= Integer.parseInt(s);
            return true;
        }
        catch(Exception e)
                {
                    return false;
                }
}
    public static void main(String[] args) {
        // TODO code application logic here
        int s=0;
        String b="b";
        Scanner input= new Scanner(System.in);
        boolean brake1=false;
        boolean acc=false;
        while(true)
        { 
            System.out.println("Ready to start Driving !!! press -b-  to Brake and any integer to Accelarate");
            String x= input.next();
            if(!isInteger(x)){
                
            
            if(x.equals(b)&& acc==false)
            {
               System.out.println("End Driving....");
               break;
            }
            else if(x.equals(b)&& acc==true)
            {
                acc=false;
                 
                 
                   int rs =((50*s)/100);
                   s=s-rs;
                   System.out.printf("Speed loweres by 50 percent %d miles/hourb \n",s);
                
                
            }
            else{
                ;
            }
        }
            else
            {
                acc=true;
                int a=Integer.parseInt(x);
                    s=s+a;
                 if(s>=90)
                {
                   int rs;
                   rs=((25*s)/100);
                   s=s-rs;
                   if(s>=75){
                       s=75;
                   System.out.printf("Speed loweres by 25 percent %d miles/hour \n",s);
                   }
                   else{
                     System.out.printf("Speed loweres by 25 percent %d miles/hour \n",s);  
                   }
                }
                System.out.printf("You are speeding at %s miles/hour \n", s);
                }
            }
                    
        }
        
    }
