/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifthprogram;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class FifthProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i,sum=0,pos_cnt=0,neg_cnt=0;
        float avg,tcnt;
        System.out.println("Enter an integer, the input ends if it is 0:");
        i=input.nextInt();
        if(i!=0)
        {
        while(i!=0){
            if(i>0){
                pos_cnt++;
            }
            else
            {
                neg_cnt++;
            }
            sum=sum+i;
             i=input.nextInt();
        }
         System.out.println();
        System.out.printf("The no. of positive number %d",pos_cnt);
        System.out.println();
        System.out.printf("The no. of negitive number %d",neg_cnt);
         System.out.println();
        System.out.printf("The total is %d",sum);
        tcnt=pos_cnt+neg_cnt;
        avg=sum/tcnt;
        System.out.println();
        System.out.printf("The average is %f",avg);
        }
        else{
            System.out.println("No numbers are entered");
        }
       
    }
    
}
