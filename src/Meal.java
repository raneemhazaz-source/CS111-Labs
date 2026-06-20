/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Meal extends FoodItem{
    private int calories;

    public Meal(int calories, String name, double price) {
        super(name, price);
        this.calories = calories;
    }

    public Meal() {
    }

   

    @Override
    public double calcefp() {
        double totel=0;
        if (calories >900) {
          return totel+=20;  
        }
return totel;
    }

    @Override
    public double applyDis() {
        if (calories >=700) {
          return 0.12;  
        }
        return 0.08;
}

    @Override
    public String toString() {
        return super.toString()+ "Meal{" + "calories=" + calories + '}';
    }

   
}
