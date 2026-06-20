
package Payment;


public class Payment {
    private String PaymentID;
    protected double amount;

    public Payment(String PaymentID, double amount) {
        this.PaymentID = PaymentID;
        this.amount = amount;
    }

    public String getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void pay(double amount){
        System.out.println("Pay processed");
    }
    public double calculayeFee(){
        return 0 ;
    }
    public String getPaymentType(){
        return "General Payment";
    }
    @Override
    public boolean equals(Object o ){
      Payment p = (Payment) o ;
        if (this.PaymentID.equals(p.PaymentID)) {
          return true;  
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s :\n %.2f :\n",PaymentID,amount );
    }
    
}
