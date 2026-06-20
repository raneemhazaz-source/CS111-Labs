
package LAB5;

import java.util.ArrayList;
public class Hotel {
  private  ArrayList<Room> rooms;  

    public Hotel() {
        rooms = new ArrayList<>();
    }
  public void addRoom(Room r ){
      rooms.add(r);
  }
  public void addRoomAtPosition(Room r , int index){
      if (index <0 ||index >rooms.size()) {
          System.out.println("Error: Ivalid index"+ index); 
      }else{
          rooms.add(index, r);
      }
  }
  public void removeLongStayReservations(int maxDays){
      for (int i = rooms.size()-1; i >= 0; i--) {
          if (rooms.get(i).isLongStay(maxDays)) {
           rooms.remove(i);
          }
      }
  }
  public void clearReservations(){
      rooms.clear();
  }
  public boolean isHotelEmpty(){
      return rooms.isEmpty();
  }
  public double calculatetotelCost(){
      double totel= 0;
      for (Room room : rooms) {
          totel += room.calcuateCost();
      }
      return totel;
  }
  public void printAllReservations(){
      for (Room room : rooms) {
          System.out.println(room); 
      }
  }
}
