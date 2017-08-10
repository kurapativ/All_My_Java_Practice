/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtnset2_prgm08;

/**
 *
 * @author Tatha
 */
import java.util.Scanner;
public class QtnSet2_Prgm08 {

    /**
     * @param args the command line arguments
     */ 
    
    static int sum=0;
   static int points(String p){
        int i;
        switch((p.toLowerCase())){
            case "2":
            case "3":
            case "4":
            case "5":      
            case "6":       
            case "7":
            case "8":
            case "9":{
               i =Integer.parseInt(p);
               sum=sum+i;
            }break;
            case "j":
            case "k":
            case "q":{
                i=10;
                sum=sum+i;
            }break;
            case "a":{
                if(sum==0){
                    i=1;
                    sum=sum+i;
                }
                else if(sum+11<21){
                    i=11;
                    sum=sum+i;
                }
                else{
                    i=1;
                    sum=sum+i;
                }
            }break;
            default:{
                System.out.println("wrong entree please try a valid one");
            }
        }
     return sum;   
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String turn;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Round one you get to choose two cards");
        System.out.println("Enter first card");
        turn=input.next();
        sum=points(turn);
        System.out.println("Enter second card");
        turn=input.next();
        sum=points(turn);
        
        while(sum<=21){
            
            if(sum<17){
                System.out.println("Choose a card");
                turn=input.next();
                sum=points(turn);
            }
            else if(sum>=17&&sum<21){
              System.out.printf("%d is your sum and waiting "
                      + "for the player’s sum", sum); 
              break;
            }
            else{
                if(sum==21)
                System.out.printf("%d is your sum and dealer won", sum);
            }
            
        }
        if(sum>21){
            System.out.printf("%d is your sum and dealer lost", sum);
        }
    }
    
}
