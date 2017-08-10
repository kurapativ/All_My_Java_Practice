/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tatha
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] val = {"Susheel Prasad","Deepak","Sriram","Praveen","Sriram","Praveen","Susheel Prasad","Susheel Prasae","Susheel Prasae"};
        Map<String,Integer> m = new HashMap<String,Integer>();
        int max = 0;
        for(int i=0;i<val.length;i++){
            if(m.keySet().contains(val[i])){
                int count = m.get(val[i]);
                count++;
                m.put(val[i], count);
                if(max<count){
                    max = count;
                }
            }else{
                m.put(val[i], 1);
            }
        }
        ArrayList<String> v = new ArrayList<String>();
        for(String s : m.keySet()){
            if(m.get(s)==max){
                v.add(s);
            }
        }
        
        Collections.sort(v);
        System.out.println(v.get(v.size()-1));
        
        
        
    }
    
}
