
package hotel;

import java.util.Scanner;
public class HotelTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         Hotel h= new Hotel();
        System.out.print("enter number of rooms and standard room price:");
        int totalrooms=input.nextInt();
        double roomsPrice = input.nextDouble();
      h.setRooms(totalrooms);
      h.setPrice(roomsPrice);
        System.out.print("");
        System.out.print("how many standard rooms would like to book?");
        int stanNum = input.nextInt();
        boolean isBook = h.bookRoom(stanNum , "standard");
        if (isBook) {
            System.out.println(stanNum+"standard rooms have been booke");   
        }else{
            System.out.println("invailed");
        }
          System.out.print("how many suite rooms would like to book?");
          int suiteNum= input.nextInt();
          h.bookRoom(suiteNum, "suite");
          if (isBook) {
            System.out.println(suiteNum+"suite rooms have been booke");
        }else{
             System.out.println("invailed");
             
          }
          h.printInfo();
    }
 
}
