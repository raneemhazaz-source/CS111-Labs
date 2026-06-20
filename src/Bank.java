
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Bank {
 private String accNumber;
 private double balnce;
 private Owner owner;

    public Bank(String accNumber, double balnce, String name, String email) {
        this.accNumber = accNumber;
        this.balnce = balnce;
        this.owner = new Owner ( name, email );
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalnce() {
        return balnce;
    }

    public void setBalnce(double balnce) {
        this.balnce = balnce;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bank ) {
           Bank b = ((Bank)obj);
           return this.accNumber.equals(b.accNumber);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bank{" + "accNumber=" + accNumber + ", balnce=" + balnce + ", owner=" + owner + '}';
    }

   public String getType(){
       return "BANK";
   }
public void depsit(double aumout){
     balnce+=aumout;
 }
  public void withdraw(double aumout){
      if ( aumout <= balnce) {
         balnce -=aumout; 
         return;
      }
      System.out.println("invaled");
 }
 public double calcalte(){
     return 0;
 }
}
