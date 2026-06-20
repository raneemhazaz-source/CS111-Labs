
package elevator;


public class Elevator {
  private int foolrNumber; 
  private String buildingName;
  private int maxCapacity;
  private boolean moving ;

    public Elevator(int foolrNumber, String buildingName, int maxCapacity, boolean moving) {
        this.foolrNumber = foolrNumber;
        this.buildingName = buildingName;
      setMaxCapacity(maxCapacity);
        this.moving =moving  ;
    }

    public Elevator(int foolrNumber, String buildingName) {
        this(foolrNumber,buildingName,10,false);
        
    }

    public Elevator(int foolrNumber, String buildingName, int maxCapacity) {
         this(foolrNumber,buildingName,10,false);
    }

    public int getFoolrNumber() {
        return foolrNumber;
    }

    public void setFoolrNumber(int foolrNumber) {
        this.foolrNumber = foolrNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
       if(maxCapacity>0){
        this.maxCapacity = maxCapacity;
       }
       else {
           System.out.println("invaled!");  
    }
    }
  public void starMoving(){
      if (moving==true) {
          System.out.println("Elevator is already moving!");  
      }
      else{
         moving=true; 
      }
  }
  
  public void stopMoving(){
  moving=false; 
  } 
  
  public void moveToFloor(int targetFloor){
      if (!moving) {
          System.out.println("Elevator is not moving!"); 
      }else if(targetFloor==foolrNumber){
           System.out.println("Already on the seletced floor");
      }else{
         foolrNumber = targetFloor;
      }
  
  
  }
  
  public void displayInfo(){
      System.out.println(" foolrNumber is :"+ foolrNumber);
      System.out.println(" buildingName is :"+ buildingName);
      System.out.println(" maxCapacity is :"+ maxCapacity);
      System.out.println(" moving is :"+ moving);
  }
}
