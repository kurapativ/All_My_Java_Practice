/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goog_test;

import java.util.ArrayList;

/**
 *
 * @author Tatha
 */
public class GooG {
    private int price;
    private String date; 
   ArrayList<GooG> al = new ArrayList<GooG>();
      ArrayList<GooG> fsl = new ArrayList<GooG>();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<GooG> getAl() {
        return al;
    }

    public void setAl(ArrayList<GooG> al) {
        this.al = al;
    }
      

public GooG(){
    
}
 public GooG(int p,String d){
     price=p;
     date=d;
 }
 public ArrayList<GooG> InsertStockPrice(){
     al.add(new GooG (price,date));
     return al;
 }
 public ArrayList<GooG> HighStockPrice(ArrayList<GooG> al){
     int  high=0;
     String date="";
     for(GooG i : al){
         if(high<i.getPrice()){
             high=i.getPrice();
             date=i.getDate();
         }
     }
     fsl.add(new GooG(high,date));
     return fsl;
 }
}
    
    

