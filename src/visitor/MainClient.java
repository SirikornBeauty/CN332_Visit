
package visitor;

import java.util.Scanner;

public class MainClient
{
    public static void main(String args[])
    {
        
       System.out.println("-----------------------------");
       System.out.println("Drinks Menu");  
       System.out.println("(1) Milktea");  
       System.out.println("(2) Milk");  
       
       Scanner sc= new Scanner(System.in);  
       System.out.print("Order your Drinks: ");  
       String drink = sc.next();
       
       System.out.println("-----------------------------");
       
       Scanner sc1= new Scanner(System.in);  
       System.out.print("Add bubble? (1-->Yes/0-->No): ");  
       String bubble = sc1.next();
       
       System.out.println("-----------------------------");
       
       Customer v = new Customer();
       
       if(drink.equals("1")) {
           Milktea mt = DrinkFactory.getMilktea();
           mt.accept(v);
           if(bubble.equals("1")){
               Bubble b = DrinkFactory.getBubble();
               b.accept(v);
           }
           int totalPrice = (int) v.getTotalDrinks();
           System.out.println("Cash : " + totalPrice + " Bath.");
       }
       else if(drink.equals("2")) {
           Milk m = DrinkFactory.getMilk();
           m.accept(v);
           if(bubble.equals("1")){
               Bubble b = DrinkFactory.getBubble();
               b.accept(v);
           }
           int totalPrice = (int) v.getTotalDrinks();
           System.out.println("Cash : " + totalPrice + " Bath.");
       }
 
  
       
    }


}
