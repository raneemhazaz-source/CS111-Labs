
package MedicalService;


public class MedicalService {
 private String  serviceCoud;
 private double baseCost;

    public MedicalService(String serviceCoud, double baseCost) {
        this.serviceCoud = serviceCoud;
        this.baseCost = baseCost;
    }

    public String getServiceCoud() {
        return serviceCoud;
    }

    public void setServiceCoud(String serviceCoud) {
        this.serviceCoud = serviceCoud;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
 public void ProvidService(){
     System.out.println("Service provid successfully");
 }
 public double calculateCost(){
     return baseCost;
 }
 public String getServiceType(){
     return "General Medical Service";
 }
 @Override
 public boolean equals(Object o){
     MedicalService m = (( MedicalService) o);
    return this.serviceCoud.equals(m.serviceCoud);
 }

    @Override
    public String toString() {
        return String.format("serviceCoud :%S\n baseCost: %.2f\n", serviceCoud,baseCost);
    }
 
}
