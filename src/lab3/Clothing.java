
package lab3;


public class Clothing extends Product{
  private String size;

    public Clothing(String name, String id, double price,String size) {
        super(name, id, price);
        this.size= size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
  @Override
  public String toString(){
   return String.format("%s\n size : %s\n", super.toString(),size);
  }
  @Override
   public double calculatePrice(){
     return super.calculatePrice()+50;
   }
}
