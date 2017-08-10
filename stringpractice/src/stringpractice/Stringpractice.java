/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpractice;

import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Tatha
 */
public class Stringpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        StringBuilder sel =new StringBuilder("hello");
        
        String sel1 = "reaetbc";
        String[] str = sel1.split("c");
        String aftersplita="";
        for(String s:str)
        {
            aftersplita=aftersplita+s;
        }
        String[] finalstr= aftersplita.split("t");
        
        for(String s:finalstr)
            System.out.println(s);
    
     boolean a=false;
     
     String x="x";
   String y="y";
     if(x.compareTo(y)<0)
     {
         a=true;
     }
     System.out.println(a);
    }
    
}
