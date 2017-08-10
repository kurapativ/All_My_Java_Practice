/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtnset2_prgm02;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class QtnSet2_Prgm02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int sum=0,avg=0,cval,pval=0,size=1;
     Scanner input=new Scanner(System.in);
    
     while(avg<100){
          System.out.println("Enter next integer");
       cval=input.nextInt();
       if(cval>=pval){
      
       sum=sum+cval;
       avg=sum/size;
       size++;
       
        System.out.printf("Current Average: %d \n",avg);
       }
       else{
           System.out.println("Your number is too small. "
                   + "Please enter a number larger than the current average!");
       }
       pval=cval;
        
     }
     System.out.println("Good Job! You have entered 4 integers, "
             + "making the average equal to or more than 100!\n" +
"Bye Bye!");
    }
    
}
