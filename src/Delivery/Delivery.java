
package Delivery;


public class Delivery {
   private String trackingNumber;
   private double weight;
   private double baseFee;

    public Delivery(String trackingNumber, double weight, double baseFee) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.baseFee = baseFee;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }
   public void shipPackage(){
       System.out.println("Package shipped successfully");
   }
   public double calculateCost(){
       return baseFee;
   }
   public String DeliveryType(){
       return "Standerd Delivery ";
   }
   @Override
   public boolean equals(Object o){
       Delivery d = (Delivery)o;
       return this.trackingNumber.equals(d.trackingNumber);
   }

    @Override
    public String toString() {
        return String.format("trackingNumber : %s\n baseFee :%.2f\n", trackingNumber,baseFee);
    }
}
