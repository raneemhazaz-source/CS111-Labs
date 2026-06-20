
package Engine;


public class CarTest {
    public static void main(String[] args) {
        Car c = new Car ("porsche","2025",1500);
       
        System.out.println("the reuitsis "+c.getEngine().checkPower(1900));
       c.printCarInfo();
        System.out.println("");
       
        System.out.println("the total"+ c.calculateAnnuualFuelCost(2));
        
        c.getEngine().setHorsePower(1800);
        System.out.println("---after change---");
        c.printCarInfo();
    }
  
}
