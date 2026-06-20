/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Main {
    public static void main(String[] args) {
        Rest r = new Rest();
        Meal m1 = new Meal(950,"Buger",90);
         Meal m2 = new Meal(600,"pasta",70);
         Dessert d = new Dessert(65,"sweet",40);
         r.addItem(d);
         r.addItem(m1);
          r.addItem(m2);
          r.display();
          System.out.println("totel :"+r.totelrvn());
          m1.setPrice(80);
          System.out.println("totel :"+r.totelrvn()); 
          r.removeItem(m1);
            r.display();     
    }
}
