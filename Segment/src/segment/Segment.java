/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment;

/**
 *
 * @author Tatha
 */
public class Segment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int a[]=new int[]{3,1,2,5,3,8,6,-1};
       int seg=0,temp=0;
       int segsize=3;
       int segment=1;
                 
        for(int i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
               if(segment==3)
            {
                System.out.print("|");
                segment=0;
            }
            segment++;
        }
        
       if(a.length%3==0)
       {
           seg=a.length/segsize;
       }
       else{
           seg=(a.length/segsize)+1;
       }
        System.out.printf("\n %d is the segment size \n",seg);
        
        
        for(int p=0; p<seg;p++)
        {
            for(int i=p*segsize;(i<=(p+1)*segsize-2) && (i<=a.length-2); i++)
            {
                for(int j=i+1;(j<=(p+1)*segsize-1) && (j<=a.length-1);j++)
                {
                    if(a[i]>a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
                }
            }
        }
        
              System.out.println();
              
              segment=1;
        for(int i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
            if(segment==3)
            {
                System.out.print("|");
                segment=0;
            }
            segment++;
        }
         System.out.print("\n");
         
         
         
          
       
    }
    
}
