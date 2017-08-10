/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buysell;

/**
 *
 * @author Tatha
 */
public class BuySell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] stocks= new int[]{100,101,105,107,106,88,200};
        int midval=0;
        int maxprofit1=0;
        int finalmaxprofit=0;
        for(int i=0;i<=stocks.length-4;i++)
        {
            for(int j=i+1;j<=stocks.length-3;j++)
            {
                midval=stocks[j]-stocks[i];
                
                if(midval>maxprofit1)
                {
                    maxprofit1=midval;
                }
            }
          
        }
     
           for(int k=3;k<=stocks.length-2;k++)
            {
                for(int l=0;l<=stocks.length-1;l++)
                {
                    midval=maxprofit1+(stocks[l]-stocks[k]);
                    if(midval>finalmaxprofit)
                    {
                        finalmaxprofit=midval;
                    } 
                       
                }
            }
        System.out.printf("Maximum profit is %d .",finalmaxprofit);
    }
    
}
