/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tatha
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        String[] val = {"Susheel","Deepak","Sriram","Praveen","Sriram","Praveen","Susheel"};
//        Map<String,Integer> m = new HashMap<String,Integer>();
//        int max = 0;
//        for(int i=0;i<val.length;i++){
//            if(m.keySet().contains(val[i])){
//                int count = m.get(val[i]);
//                count++;
//                m.put(val[i], count);
//                if(max<count){
//                    max = count;
//                }
//            }else{
//                m.put(val[i], 1);
//            }
//        }
//        ArrayList<String> v = new ArrayList<String>();
//        for(String s : m.keySet()){
//            if(m.get(s)==max){
//                v.add(s);
//            }
//        }
//        
//        Collections.sort(v);
//        System.out.println(v.get(v.size()-1));
        
        String s = "AAATGCCT";
        String rev = new StringBuilder(s).reverse().toString();
        String res = "";
        for(int i=0;i<rev.length();i++){
            char c = rev.charAt(i);
            switch(c){
                case 'A':
                    res = res+"T";
                    break;
                case 'T':
                    res = res+"A";
                    break;
                case 'C':
                    res = res+"G";
                    break;
                case 'G':
                    res = res+"C";
                    break;
            }
        }
        
        System.out.println(res);
    }
    
}
