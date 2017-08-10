/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdprogram;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class ThirdProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int i;
        System.out.println("Enter a number to check divisibility with 5, 6");
        i=input.nextInt();
        if((i%5==0)&&(i%6==0)){
            System.out.println();
            System.out.printf("%d is divisible by both 5 and 6",i);
        }
        else if ((i%5==0)||(i%6==0)){
             System.out.println();
            System.out.printf("%d is divisible by  5 or 6 but not both",i);
        }
        else
        {
             System.out.println();
             System.out.printf("%d is not divisible by either 5 or 6",i);
            
            
        }
                     System.out.println();

    }
    
}
