
package Engine;


public class Car {
    private String brand;
    private  Engine engine;

    public Car(String brand, String etype,int ehorsePower) {
        this.brand = brand;
        this.engine= new Engine(etype,ehorsePower);
    }
    public void printCarInfo(){
        System.out.println("brand :"+brand);
        engine.showEngineinfo();
    }
    public int calculateAnnuualFuelCost(int pricePerUnit){
      int cost = pricePerUnit *engine.getHorsePower() ;
      return cost;
    }

    public Engine getEngine() {
        return engine;
    }

    
    
}
