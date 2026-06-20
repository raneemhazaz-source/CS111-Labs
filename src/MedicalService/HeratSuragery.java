
package MedicalService;


public class HeratSuragery extends  Suragery{
   private double equipmentFee;

    public HeratSuragery(double equipmentFee, double surageryFee, String serviceCoud, double baseCost) {
        super(surageryFee, serviceCoud, baseCost);
        this.equipmentFee = equipmentFee;
    }

    public double getEquipmentFee() {
        return equipmentFee;
    }

    public void setEquipmentFee(double equipmentFee) {
        this.equipmentFee = equipmentFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() +equipmentFee; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getServiceType() {
        return "Herat Suragery"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return String.format("%s:\n equipmentFee: %.2f\n", super.toString(),equipmentFee); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
}
