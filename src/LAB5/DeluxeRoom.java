
package LAB5;


public class DeluxeRoom extends Room{

    private boolean extraServices;

    public DeluxeRoom(boolean extraServices, int roomId, String guestName, double pricePerNight, Date checkInDate, Date checkOutDate) {
        super(roomId, guestName, pricePerNight, checkInDate, checkOutDate);
        this.extraServices = extraServices;
    }

    @Override
    public String toString() {
        return String.format("%s\n extraServices:%b\n", super.toString(),extraServices);
    }

    @Override
    public double calcuateCost() {
        int days = getReservationDays();
        double totel= days * getPricePerNight();
        if (days >5) {
          totel = totel - totel *0.15;  
        }else{
           totel = totel - totel *0.05; 
        }
        return totel;
    }
    
    
}
