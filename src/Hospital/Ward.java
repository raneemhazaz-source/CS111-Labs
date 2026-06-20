
package Hospital;


public class Ward {
 private  int wardNumber;
 private int capacity;
 private int occupieBeds;

    public Ward(int wardNumber, int capacity, int occupieBeds) {
        setWardNumber(wardNumber);
        setCapacity(capacity);
        setOccupieBeds(occupieBeds);
        
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(int wardNumber) {
        if (wardNumber <=0) {
            System.out.println("invalid wardNumber!");
        }else{
        this.wardNumber = wardNumber;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
      if (capacity<=0) {
            System.out.println("invalid wardNumber!");
        }else{
        this.capacity = capacity;
      }
    }

    public int getOccupieBeds() {
        return occupieBeds;
    }

    public void setOccupieBeds(int occupieBeds) {
       if ( occupieBeds<0||occupieBeds> capacity) {
            System.out.println("invalid wardNumber!");
        }else{
        this.occupieBeds = occupieBeds;
       }
    }
 public void display(){
     System.out.println("wardNumber    :"+wardNumber); 
     System.out.println("capacity      :"+capacity);
     System.out.println("occupieBeds    :"+occupieBeds);
     System.out.println("Availab        :"+(capacity -occupieBeds ));
 }
}
