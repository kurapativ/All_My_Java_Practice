/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtnset2_prgm05;

/**
 *
 * @author Tatha
 */
public class QtnSet2_Prgm05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=9,m,i=0,j=0,k=0,l=0,p=0;
        m=(n+1)/2;
        for(i=0;i<n;i++){
            if(k==n)
            {
                for(l=-0;l<i-m+1;l++){
                    System.out.print(" ");
                }
                for(p=(((n-i-1)*2)+1);p>0;p--){
                   System.out.print("*");                    
                }   
            }
            else{
                for(j=m-i-1;j>0;j--){
                   System.out.print(" ");
                }
                for(k=0;k<((2*i)+1);k++){
                   System.out.print("*");                    
                }
            }
                              System.out.print("\n");                    
        }
    }
}
