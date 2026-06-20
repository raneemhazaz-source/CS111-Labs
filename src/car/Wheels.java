
package car;


public class Wheels {
  private double size;
private String date;
private final int Totalwheels=4;

    public Wheels(double size, String date) {
        this.size = size;
        this.date = date;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalwheels() {
        return Totalwheels;
    }
public void display(){
    System.out.println("size :"+size);
    System.out.println("date  :"+date);
}
}
