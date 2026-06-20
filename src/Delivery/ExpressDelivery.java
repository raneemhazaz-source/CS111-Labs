
package Delivery;


public class ExpressDelivery extends Delivery{
    private double surgeryFee;
    private double  expressRate;

    public ExpressDelivery(double expressRate, String trackingNumber, double weight, double baseFee) {
        super(trackingNumber, weight, baseFee);
        this.expressRate = expressRate;
    }
     public ExpressDelivery(double surgeryFee){
     this( 0.0, "",  0.0,  0.0);
     this.surgeryFee=surgeryFee;
     }

    public double getExpressRate() {
        return expressRate;
    }

    public void setExpressRate(double expressRate) {
        this.expressRate = expressRate;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+ (super.getWeight()* expressRate); 
    }

    @Override
    public String DeliveryType() {
        return " Express Delivery";
    }

    @Override
    public String toString() {
        return String.format("%s:\n expressRate:%.2f\n",super.toString(),expressRate); 
    }

    
    
}
