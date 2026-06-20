
package Hospital;

import java.util.Scanner;
public class HospitalTest {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        Ward[] ward = new Ward[3];
        ward[0] = new Ward(1,30,20);
        ward[1] = new Ward(2,40,30);
        ward[2] = new Ward(3,50,50);
        
        Hospital h = new Hospital("KAMC",ward);
        h.displayInfo();
        System.out.print("enter new occupieBeds :");
       int newoccupieBeds = input.nextInt();
       ward[1].setOccupieBeds(newoccupieBeds);
        System.out.println("");
        System.out.print("enter newcapacity  :");
       int newcapacity  = input.nextInt();
       ward[1].setCapacity(newcapacity);
        System.out.println("");
        h.displayInfo();
        System.out.println("total available beds:"+h.calculateTotalAvailabBeds());
        System.out.println("");
        System.out.println("enter ward number to search:");
        int search= input.nextInt();
        Ward foundward= h.findWard(search);
        if ( foundward!= null) {
            System.out.println("found");  
        }else{
            System.out.println("not found");
        }
        
    }
  
}
