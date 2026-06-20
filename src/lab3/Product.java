
package lab3;


public class Product {
   private String name;
   private String id;
   private double price;

    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   @Override
   public String toString(){
    return String.format("name :%s\n id : %s\n price : %.2f", name,id,price);
   }
   public double calculatePrice(){
     return price;  
   }
   
  
}
