
package car;


public class CarTest {
    public static void main(String[] args) {
        System.out.println("total cars"+Car.getTotalcars());
        Car c = new Car ("BMW",1500000000,new Wheels(5,"25\5\2025"));
        c.getWheels().setSize(80);
        c.getWheels().setDate("2030");
        c.display();
    }
}
