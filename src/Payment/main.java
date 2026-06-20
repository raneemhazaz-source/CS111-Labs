
package Payment;


public class main {
    public static void main(String[] args) {
        Payment p = new Payment("123",500.0);
        Card c = new Card("456",100.0 , 5.0);
        Premium m = new Premium("010",600.0 ,10.0 ,3.0);
        
        Payment [] Payments= new Payment[3];
         Payments[0]= p;
          Payments[1]= c;
           Payments[2]= m;
        for (Payment Pt : Payments) {
            System.out.println(Pt.getPaymentID());
            System.out.println(Pt.calculayeFee());
            System.out.println(Pt.getClass().getSimpleName());
            if (Pt instanceof Premium ) {
              Premium pm = (Premium) Pt;
                System.out.println(pm.getCashbackRate());
                System.out.println("");
            }
            Payment pp = new Payment("123",800.0);
            System.out.println(p.equals(pp));
            System.out.println(p.equals(c));
            
            for (Payment P : Payments) {
                processPayment(P);
                System.out.println("");
            }
        }
    }
 public static void processPayment(Payment p){
     System.out.println("Payment type :"+p.getPaymentType());
     System.out.println("calculayeFee :"+p.calculayeFee());
     System.out.println("amount :"+p.getAmount());
 }
}
