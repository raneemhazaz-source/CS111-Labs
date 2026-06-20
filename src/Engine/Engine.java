
package Engine;


public class Engine {
   private String type;
   private int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public Engine() {
        this("",0);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
   public void showEngineinfo(){
       System.out.println("type :"+type); 
       System.out.println("horsePower :"+horsePower);
   }
   public boolean checkPower(int threshold){
       if (horsePower >=threshold ) {
        return true;   
       }else{
        return false;   
       }
  
   }
}
