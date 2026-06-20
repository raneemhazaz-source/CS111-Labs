
package MedicalService;


public class Suragery extends MedicalService{
    private double surageryFee;
  

    public Suragery(double surageryFee,String serviceCoud, double baseCost) {
        super( serviceCoud, baseCost);
        this.surageryFee = surageryFee;
    }

   
    

    public double getSurageryFee() {
        return surageryFee;
    }

    public void setSurageryFee(double surageryFee) {
        this.surageryFee = surageryFee;
    }

   

    @Override
    public String toString() {
        return String.format("%s:\n surageryFee:%.2f\n", super.toString(),surageryFee); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getServiceType() {
        return "  Suragery"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+surageryFee; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

   
    
    
}
