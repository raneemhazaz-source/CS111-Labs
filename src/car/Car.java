
package car;


public class Car {
 private String name;
 private double price;
 private Wheels wheels;
 private static int Totalcars;

    public Car(String name, double price, Wheels wheels) {
        this.name = name;
        this.price = price;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public static int getTotalcars() {
        return Totalcars;
    }

    public static void setTotalcars(int Totalcars) {
        Car.Totalcars = Totalcars;
    }
 public void display(){
     System.out.println("name is :"+name);
     System.out.println("price is :"+price);
     wheels.display();
 }
}
