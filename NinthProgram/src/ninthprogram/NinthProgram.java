/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninthprogram;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
import java.util.ArrayList;
public class NinthProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> slist = new ArrayList<Integer>();

        Scanner input =new Scanner(System.in);
        System.out.println("Enter series of numbers");
        int num,i,j,k=0,l,m;
        int cnt=0;
        num=input.nextInt();
        while(num!=0){
            if(num>=1&&num<=100){
            list.add(num);
            num=input.nextInt();
            }
        }
        for(i=0;i<list.size();i++){
           l=list.get(i);
            for (j=0;j<list.size();j++){
                if(list.get(j)==l){
                    cnt++;
                    k=j;
                } 
            }
            
        list.remove(k);
           
           System.out.printf("%d occurs %d times",l,cnt);
           System.out.println();
            cnt=0;
               }
        }
        }
   
    

