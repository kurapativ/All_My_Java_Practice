/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtnset2_prgm07;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class QtnSet2_Prgm07 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] sales=new int[3][3];
        int s=0;
        int[] c={0,0,0};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter sales data for Houston for months "
                + "Jan Feb and Mar");
        for(int i=0;i<sales.length;i++){
        sales[s][i]=input.nextInt();
        }
       
        s=1;
        System.out.println("Enter sales data for Dallas for months "
                + "Jan Feb and Mar");
        for(int i=0;i<sales.length;i++){
        sales[s][i]=input.nextInt();
        }
        
        s=2;
        System.out.println("Enter sales data for Austin for months "
                + "Jan Feb and Mar");
        for(int i=0;i<sales.length;i++){
        sales[s][i]=input.nextInt();
        }
        
        for(int i=0;i<sales.length;i++){
            for(int j=0;j<sales.length;j++){
                System.out.printf("%d\t",sales[i][j]);
            }
            System.out.println();
        }
        int j = 0;
        while(j<sales.length){
            int city=0;
        for(int i=1;i<sales.length;i++){
            if(sales[i-1][j]>sales[i][j]){
                city=i-1;
            }
           
        }
        c[city]++;
        j++;
        }
        int max=0,pos=0;
        String CityName="";
        for(int i=0;i<c.length-1;i++){
            if(c[i]>c[i+1]){
                max=c[i];
                pos=i;
            }
        }
        
        if(pos==0){
            System.out.printf("Houston has %d months that it has "
                    + "the largest sales. It is the name of the branch "
                    + "that has the most months with the largest sales. ",max);
        }
        else if(pos==1){
            System.out.printf("Dallas has %d months that it has "
                    + "the largest sales. It is the name of the branch "
                    + "that has the most months with the largest sales. ",max);
        }
        else{
            System.out.printf("Austin has %d months that it has "
                    + "the largest sales. It is the name of the branch "
                    + "that has the most months with the largest sales. ",max);
        }
        
        
    }
    
}
