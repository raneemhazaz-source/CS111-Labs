
package LAB5;


public class Room {
  private int roomId;
private String guestName;
private double pricePerNight;
private Date checkInDate;
private Date checkOutDate;

    public Room(int roomId, String guestName, double pricePerNight, Date checkInDate, Date checkOutDate) {
        this.roomId = roomId;
        this.guestName = guestName;
        this.pricePerNight = pricePerNight;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
public double calcuateCost(){
    return 0 ;
}
public int getReservationDays(){
    return checkInDate.differenceInDays(checkOutDate);
}
public boolean isLongStay(int maxDays){
    if (getReservationDays()>maxDays) {
        return true;
    }
    return false;
}
 @Override
    public String toString() {
        return String.format("  roomId:%d\n" +
" guestName:%S\n" +
 "pricePerNight:%.2f\n" +
" checkInDate:%s\n" +
"checkOutDate:%s\n", roomId,guestName,pricePerNight,checkInDate,checkOutDate);
    }
}
