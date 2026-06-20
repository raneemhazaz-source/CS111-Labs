/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Eloctronics extends Product{
    private int years;

    public Eloctronics(int years, String name, String id, double price) throws IllegalArgumentException {
        super(name, id, price);
       setYears( years);
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
         if (years<0 ) {
          throw new java.lang.IllegalArgumentException("INVALID YEARS!");
        }
        this.years = years;
    }

    @Override
    public String toString() {
        return super.toString()+"Eloctronics{" + "years=" + years + '}';
    }
    
}
