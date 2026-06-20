
package Delivery;


public class Main {
    public static void main(String[] args) {
     Delivery d = new Delivery ("123",450.0,99.0)  ;
     ExpressDelivery e = new ExpressDelivery(10.0,"123",200.0,150.0);
     InternationDelivery n = new InternationDelivery(5.00,10.0,"456",60.0,20.0);
     
     Delivery [] dv  = new  Delivery[3];
     dv[0]= d ;
      dv[1]= e ;
       dv[2]= n ;
        for (Delivery dee : dv) {
            System.out.println(dee.DeliveryType());
            System.out.println(dee.calculateCost());
            System.out.println(dee.getClass().getSimpleName());
            if ( dee instanceof InternationDelivery  ) {
                System.out.println(((InternationDelivery) dee).getCustomsFee());
                
            }
            
        }
         Delivery d2 = new Delivery ("123",350.0,49.0)  ;
         System.out.println("the resuit is :"+d2.equals(d));
    
  procrssDelivery( d2);
}
    public static void procrssDelivery(Delivery dd){
    System.out.println(dd.DeliveryType());
    System.out.println(dd.calculateCost());
    System.out.println(dd.getBaseFee());
}
}
