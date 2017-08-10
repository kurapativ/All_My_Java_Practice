/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthprogram;

/**
 *
 * @author Tatha
 */import java.util.Scanner;
public class FourthProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float xchange,usd,yuan,amount;
        System.out.println("enter exchnage rate from dollars to RMB:");
        xchange=input.nextFloat();
        System.out.println("enter 0 to convert dollars to RMB and 1 vice-versa:");
        int i;
        i=input.nextInt();
        if(i==0){
            System.out.println("Enter the dollar amount");
            usd=input.nextFloat();
            amount=usd*xchange;
            System.out.printf("$ %f is %s yuan",usd,amount);
        }
        if (i==1){
            System.out.println("Enter the yuan amount");
            yuan=input.nextFloat();
            amount=yuan/xchange;
            System.out.printf("$ %f is %s yuan",yuan,amount);
        }
        
    }
    
}
