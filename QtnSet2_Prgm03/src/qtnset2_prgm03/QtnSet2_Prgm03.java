/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtnset2_prgm03;

/**
 *
 * @author Tatha
 */
public class QtnSet2_Prgm03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float rval=300000,pval=100000,y;
        int m=0;
        while(pval<rval){
            y=(12*pval)/100;
            pval=pval+y;
            m++;
        }
        System.out.printf("No. of months requried to reach target "
                + "users of 300,000 from 100,000 is : %d months \n",m);
    }
    
}
