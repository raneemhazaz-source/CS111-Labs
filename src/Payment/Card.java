
package Payment;

public class Card extends Payment{
   protected double serviceFeeRate;

    public Card(String PaymentID, double amount ,double serviceFeeRate) {
      super(PaymentID,amount);
        this.serviceFeeRate = serviceFeeRate;
    }

    public double getServiceFeeRate() {
        return serviceFeeRate;
    }

    public void setServiceFeeRate(double serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }

    @Override
    public String getPaymentType() {
        return "Credit Card Payment"; 
    }

    @Override
    public double calculayeFee() {
        return getAmount() * serviceFeeRate; 
    }

    @Override
    public String toString() {
        return String.format("%s :\n %.2f :\n", super.toString(),serviceFeeRate);
    }

    

    
   
}
