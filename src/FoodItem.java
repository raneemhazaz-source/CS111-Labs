/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public abstract  class FoodItem implements Discountable{
    protected String name;
    protected double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public FoodItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract  double calcefp();

    @Override
    public String toString() {
        return "FoodItem{" + "name=" + name + ", price=" + price + '}';
    }
        
   
         
}
