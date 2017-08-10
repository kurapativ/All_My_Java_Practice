/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goog_test;

/**
 *
 * @author Tatha
 */
import java.util.ArrayList;
import java.util.Scanner;
public class GooG_Test {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String date;
        int price;
        String p="y";
        ArrayList<GooG> al = new ArrayList<GooG>();
        do{
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the GooG Stock date:");
        date=input.next();
        System.out.println("Enter GooG stock price");
        price=input.nextInt();
       GooG g=new GooG(price,date);
       al=g.InsertStockPrice();
       System.out.println("to add enter y to stop addign n");
       p=input.next();
        }while(p.equalsIgnoreCase("y"));
        GooG g=new GooG();
      al=g.HighStockPrice(al);
      for(GooG i :al){
      System.out.print(i.getPrice());
            System.out.println();

        System.out.print(i.getDate());
    
      }
    }
    
}
