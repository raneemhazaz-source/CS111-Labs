
package Delivery;


public class InternationDelivery extends ExpressDelivery{
    private double customsFee;

    public InternationDelivery(double customsFee, double expressRate, String trackingNumber, double weight, double baseFee) {
        super(expressRate, trackingNumber, weight, baseFee);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String toString() {
        return String.format("%s:\n customsFee:%.2f\n", super.toString(),customsFee); 
    }

    @Override
    public String DeliveryType() {
        return "InternationDelivery"; 
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+customsFee; 
    
}
}