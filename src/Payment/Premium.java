
package Payment;


public class Premium extends Card {
private double cashbackRate;
    public Premium(String PaymentID, double amount, double serviceFeeRate,double cashbackRate) {
        super(PaymentID, amount, serviceFeeRate);
        this.cashbackRate= cashbackRate;
    }

    public double getCashbackRate() {
        return cashbackRate;
    }

    public void setCashbackRate(double cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    @Override
    public String toString() {
        return String.format("%s :\n %.2f", super.toString(),cashbackRate); 
    }

    @Override
    public double calculayeFee() {
        return (super.calculayeFee())-((getAmount() *cashbackRate)); 
    }

    @Override
    public String getPaymentType() {
        return " Premium Credit Card Payment"; 
    }
    
}
