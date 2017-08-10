/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author Tatha
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums=new int[]{4, 5, 4, 1, 5};
        for(int i=0; i<nums.length;i++)
        {
            System.out.printf("%d\t",nums[i]);
        }
        System.out.println();
        int pos_4=0;
  int pos_5=0;
  int ppo_5=-1;
  for(int i= pos_4;i<nums.length;i++)
  {
    if(nums[i]==4)
    {
    if(nums[i+1]!=5)
    {
    for(int j=pos_5;j<nums.length;j++)
    {
      if(nums[j]==5)
      {
        if(j!=ppo_5)
        {
        
       pos_5=j+1;
        
        int temp=nums[j];
        nums[j]=nums[i+1];
        nums[i+1]=temp;
        break;
      }
      }
      
    }
    ppo_5=i+1;
    }
    ppo_5=i+1;
    }
  }
        for(int i=0; i<nums.length;i++)
        {
            System.out.printf("%d\t",nums[i]);
        }    
    }
    
}
