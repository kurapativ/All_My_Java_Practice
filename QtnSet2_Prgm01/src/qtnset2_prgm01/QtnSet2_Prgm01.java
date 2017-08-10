/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtnset2_prgm01;

/**
 *
 * @author Tatha
 */import java.util.Scanner;
public class QtnSet2_Prgm01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[3]; 
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any three numbers");
        
        //Loop 01: Entering numbers
        for(int i=0;i<=a.length-1;i++){
            a[i]=input.nextInt();
        }
        
        //Loop 02: Testing numbers

        for(int i=0;i<=a.length-1;i++){
            if(a[i]==2&&a[i+1]==3)
            {
                a[i+1]=0;
            }
        }
        
        //Loop 03: Printing numbers
        for(int i=0;i<=a.length-1;i++){
            System.out.printf("%d \t",a[i]);
        }
        
    }
    
}
