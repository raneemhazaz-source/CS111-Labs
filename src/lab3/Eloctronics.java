
package lab3;

public class Eloctronics extends Product {
  private int warrantyYears;

    public Eloctronics(String name, String id, double price,int warrantyYears) {
   super(name,  id,  price);
   this.warrantyYears= warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }
  @Override
  public String toString(){
      return String.format("%s\n warrantyYears : %d\n ",super.toString(),warrantyYears);
  }
  @Override
  public double calculatePrice(){
   return  super.calculatePrice() +(warrantyYears *100);
   }
}
