/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
import java.util.ArrayList;
public class Rest {
  private ArrayList <FoodItem>items;  

    public Rest(ArrayList<FoodItem> items) {
        this.items = items;
    }

    public Rest() {
         items = new ArrayList<>();

    }

    public ArrayList<FoodItem> getItems() {
        return items;
    }
  public void addItem(FoodItem f){
      items.add(f);
  }
  public void removeItem(FoodItem f){
      items.remove(f);
  }
  public void display(){
      for (FoodItem item : items) {
          System.out.println(item); 
      }
      
  }
  public double totelrvn(){
      double totel =0;
      for (FoodItem item : items) {
        return totel += item.calcefp();
      }
      return totel;
  }
}
