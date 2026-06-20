/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Dessert extends FoodItem{
    private int sugar;

    public Dessert(int sugar , String name, double price) {
        super(name, price);
       this.sugar=sugar;
    }

    public Dessert( ) {
        
    }

    @Override
    public double calcefp() {
          double totel =0;
        if (sugar >50) {
            return totel+=15;
        }else if(sugar <20){
    return totel-=10;
        }
    return totel;
}

    @Override
    public double applyDis() {
       if (sugar >50) {
           return 0.25;
       }
    return 0.15;
    }

    @Override
    public String toString() {
        return super.toString()+"Dessert{" + "sugar=" + sugar + '}';
    }
    
}
