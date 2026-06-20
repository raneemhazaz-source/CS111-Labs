
package hotel;


public class Hotel {
   private int rooms;
   private int standar;
   private int suite;
   private double price;

    public Hotel() {
    }

    public Hotel(int rooms, double price) {
        this.rooms = rooms;
        this.price = price;
        this.standar=0;
        this.suite=0;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStandar() {
        return standar;
    }

    public int getSuite() {
        return suite;
    }
   
   public int howManyBooked(){
   return standar +  suite;
   }
   public boolean bookRoom(int n , String type){
       if (n<=0) {
       return false;
       }
   int avi = rooms-howManyBooked();
       if (n>avi) {
          return false; 
       }
       if (type.equals(" standar")) {
           n+= standar;
           return true;
       }else if(type.equals(" suite")) {
            n+= suite;
           return true;
           
       }
       return false;
   }
   public void printInfo(){
       System.out.println("----------HOTELINFO---------");
       System.out.println("the hotel has "+rooms+"rooms.");
       System.out.println("only"+ howManyBooked()+"rooms has booked");
       System.out.printf("%d standar rooms with price =%.2fSR per night\n",standar,price);
   System.out.printf("%d suite rooms with price =%.2fSR per night\n",suite,price);
   
   }
}
