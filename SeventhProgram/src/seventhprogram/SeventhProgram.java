/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhprogram;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class SeventhProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        float p,r,res=0,fr;
        int n,i;
        System.out.println("Enter princple amt:");
        p=input.nextFloat();
        System.out.println("Enter intrest rate");
        r=input.nextFloat();
        System.out.println("Enter no.of months intrest to be calculated:");
        n=input.nextInt();
        fr=1+(r/1200);
        for(i=1;i<=n;i++){
            res=fr*(res)+p*fr;
        }
        
        System.out.printf("final amt :%f",res);
    }
    
}
