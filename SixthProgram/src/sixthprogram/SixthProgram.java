/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixthprogram;

/**
 *
 * @author Tatha
 */
public class SixthProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k;
        System.out.println("Pattern A");
        
        for(i=1;i<=6;i++){
            for(j=1;j<=i;j++)
            {
                System.out.printf("%d \t",j);
            }
            System.out.println();
                }
        
        System.out.println("Pattern B");
        
        for(i=0;i<=6;i++){
            for(j=1;j<=6-i;j++)
            {
                System.out.printf("%d \t",j);
            }
            System.out.println();
                }
        
        System.out.println("Pattern C");
         for(i=1;i<=6;i++){
            
            for(k=1;k<=6-i;k++)
                {
                    System.out.printf("\t");
                }
            for(j=1;j<=i;j++)
            {
                System.out.printf("%d \t",j);
               
            }
            System.out.println();
            
                }
            
           System.out.println("Pattern D");
        for(i=0;i<=6;i++){
            
            for(k=1;k<=i;k++)
                {
                    System.out.printf("\t");
                }
            for(j=1;j<=6-i;j++)
            {
                System.out.printf("%d \t",j);
               
            }
            System.out.println();
            
                }
    }
}

   
    


