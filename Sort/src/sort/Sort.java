/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Tatha
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sort[]=new int[]{8,3,2,6,1,9};
        int temp=0;
        for(int i=0;i<sort.length;i++)
        {
            System.out.print("\t"+sort[i]);
        }
        System.out.println();
        
        for(int i=0;i<sort.length;i++)
        {
             for(int j=i+1;j<sort.length-1;j++)
             {
                 if((sort[i]%2==0)&&(sort[j]%2==0))
                 {
                if(sort[i]>sort[j])
                {
                    temp=sort[j];
                    sort[j]=sort[i];
                    sort[i]=temp;
                }
                 }
                 
             }
        }
        for(int i=0;i<sort.length;i++)
        {
             for(int j=i+1;j<sort.length-1;j++)
             {
                 if((sort[i]%2==1)&&(sort[j]%2==1))
                 {
                if(sort[i]>sort[j])
                {
                    temp=sort[j];
                    sort[j]=sort[i];
                    sort[i]=temp;
                }
                 }
                 
             }
        }
        
        
       
                 
        for(int i=0;i<sort.length;i++)
        {
            System.out.print("\t"+sort[i]);
        }
    }
    
}
