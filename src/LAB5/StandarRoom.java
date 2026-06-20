
package LAB5;


public class StandarRoom extends Room{

    public StandarRoom(int roomId, String guestName, double pricePerNight, Date checkInDate, Date checkOutDate) {
        super(roomId, guestName, pricePerNight, checkInDate, checkOutDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcuateCost() {
        int days = getReservationDays();
        double totel= days * getPricePerNight();
        if (days >5) {
          totel = totel - totel *0.10;  
        }
        return totel;
    }
    
}
