/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Psvaeing extends Svaeing{
   private double prate;

    public Psvaeing(double prate, double rate, String accNumber, double balnce, String name, String email) {
        super(rate, accNumber, balnce, name, email);
        this.prate = prate;
    }

    public double getPrate() {
        return prate;
    }

    public void setPrate(double prate) {
        this.prate = prate;
    }

    @Override
    public String toString() {
        return super.toString()+"Psvaeing{" + "prate=" + prate + '}';
    }

    @Override
    public String getType() {
        return"Psvaeing"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double calcalte() {
        return super.calcalte()+super.getBalnce()*prate; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
}
