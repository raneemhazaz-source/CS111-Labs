
package MedicalService;


public class Main {
    public static void main(String[] args) {
     MedicalService m = new MedicalService("123",200.0);
     Suragery s= new Suragery (150.0 ,"456",5000.0);
     HeratSuragery sh = new HeratSuragery(4000.0 ,6000.0 ,"555",350.0);
     
     MedicalService[] service = new MedicalService[3];
     service [0] = m;
     service [1] = s;
     service [2] = sh;
     
        for (MedicalService med : service) {
            System.out.println(med.getServiceType());
            System.out.println(med.calculateCost());
            System.out.println(med.getClass().getSimpleName());
            
            if (med instanceof  HeratSuragery ) {
                System.out.println(((HeratSuragery) med).getEquipmentFee());
            }
        }
       MedicalService m2 = new MedicalService("123",500.0); 
        System.out.println("the result is :"+m2.equals(m));
        
        MedicalService m3 = new MedicalService("113",700.0); 
        System.out.println("the result is :"+m3.equals(m));
        
        processService( s);
         processService( sh);
          processService( m);
    }
  public static void processService( MedicalService s){
      System.out.println(s.getServiceType());
      System.out.println(s.calculateCost());
      System.out.println(s.getBaseCost());
      
  } 
}
