
package lab3;


public class ProductTest {
    public static void main(String[] args) {
        Eloctronics e = new Eloctronics("iphone","iphone17",5000,5);
        Clothing c = new Clothing("bag","135",500,"S");
        System.out.println(e);
        System.out.println(c);
        System.out.println("--------Price--------");
        System.out.println("Eloctronics is :"+e.calculatePrice());
        System.out.println("Clothing is :"+c.calculatePrice());
        
        Product [] p = new Product[2];
        p[0]= e;
        p[1] = c;
        System.out.println("Class Names:");
        for (Product pt : p) {
            System.out.println(pt.getClass().getSimpleName());
        }
    }
    
}
