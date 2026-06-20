
package LAB5;


public class Main {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        Date in1= new Date(1,4,2026);
         Date out1= new Date(9,4,2026);
         StandarRoom str= new StandarRoom(501,"Raneem",500,in1,out1);
         
         Date in2= new Date(5,4,2026);
         Date out2= new Date(10,4,2026);
         DeluxeRoom dur= new  DeluxeRoom(true,100,"Reem",400,in2,out2);
         
          Date in3= new Date(3,4,2026);
         Date out3= new Date(5,4,2026);
         StandarRoom shortStay= new StandarRoom(301,"lanyan",150,in3,out3);
         
         h.addRoom(str);
         h.addRoom(dur);
         h.addRoom(shortStay);
         h.printAllReservations();
         System.out.println("");
         h.removeLongStayReservations(7);
         h.printAllReservations();
         System.out.println("");
         System.out.println(h.calculatetotelCost());
         System.out.println("");
         h.clearReservations();
         System.out.println("");
         System.out.println(h.isHotelEmpty());
    }
  
}
