
package elevator;


public class ElevatorTest {
    public static void main(String[] args) {
       Elevator e1 = new  Elevator(5,"aramco",15,true);
        System.out.println("---------e1info---------");
       e1.displayInfo();
        System.out.println("---------------");
       e1.starMoving();
        e1.displayInfo();
        System.out.println("building name is :"+ e1.getBuildingName());
        System.out.println("");
        Elevator e2 = new  Elevator(5,"aramco");
        System.out.println("---------e2info---------");
        e2.displayInfo();
        System.out.println("");
         Elevator e3 = new  Elevator(5,"aramco");
         System.out.println("---------e3info---------");
         e3.setMaxCapacity(30);
         e3.starMoving();
         e3.moveToFloor(5);
         e3.stopMoving();
         e3.displayInfo();
         System.out.println("---------------------------------------------------");
          Elevator e4 = new  Elevator(5,"PNU");
          System.out.println("---------e4info---------");
          e4.setMaxCapacity(45);
          e4.starMoving();
          e4.moveToFloor(10);
          e4.stopMoving();
          e4.displayInfo();
    }
 
}
