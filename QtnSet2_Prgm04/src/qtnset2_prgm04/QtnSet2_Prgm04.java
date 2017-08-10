/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtnset2_prgm04;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class QtnSet2_Prgm04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c=0;
        int a[]= new int[5];
        int b[]= new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 different integers for array A \n");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=in.nextInt();
            System.out.println();
        }
        
        System.out.println("Enter 5 different integers for array B \n");
        for(int i=0;i<=b.length-1;i++)
        {
            b[i]=in.nextInt();
            System.out.println();
        }
        
        //comparing
        
        for(int i=0; i<=a.length-1;i++){
            
            for(int j=0; j<=b.length-1;j++){
                if(b[j]==a[i]){
                    c++;
                }
            }
        }
        
        System.out.printf("No. of integers common in arrays A, B are: %d \n",c);
    }
    
}
