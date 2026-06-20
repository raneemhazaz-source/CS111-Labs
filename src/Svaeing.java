/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Svaeing extends Bank{
    private double rate;

    public Svaeing(double rate, String accNumber, double balnce, String name, String email) {
        super(accNumber, balnce, name, email);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return super.toString()+"Svaeing{" + "rate=" + rate + '}';
    }

    @Override
    public double calcalte() {
        return super.getBalnce()*rate; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getType() {
        return "Svaeing"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
}
