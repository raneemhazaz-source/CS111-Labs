
package Hospital;


public class Hospital {
  private String hospitalName;
private Ward[]  ward;

    public Hospital(String hospitalName, Ward[] ward) {
        this.hospitalName = hospitalName;
        this.ward = ward;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Ward[] getWard() {
        return ward;
    }

    public void setWard(Ward[] ward) {
        this.ward = ward;
    }
    public int calculateTotalAvailabBeds(){
        int total = 0;
        for (int i = 0; i < ward.length; i++) {
         total += ward[i].getCapacity()-ward[i].getOccupieBeds();
        }
        return total;
    }
public void displayInfo(){
    System.out.println("----------hospitalInfo--------");
    System.out.println("hospitalName      :"+hospitalName);
    for (int i = 0; i < ward.length; i++) {
       ward[i] .display();
        System.out.println("");
    }
}
public Ward findWard(int wardNumber ){
    for (int i = 0; i < ward.length; i++) {
        if (ward[i].getWardNumber()==wardNumber) {
          return ward[i];  
        }
 
    }
  return null;
}
}
