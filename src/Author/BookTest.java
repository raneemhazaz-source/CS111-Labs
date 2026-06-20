
package Author;


public class BookTest {
    public static void main(String[] args) {
        Book B1 = new Book ("lief",new Author("RANEEM","HAZAZI") ,250.0);
        Book B2 = new Book ("lief",new Author("KHK","AT") ,1200.0);
        System.out.println("total number"+Book.getBookcounter());
        System.out.println("");
        B1.display();
        System.out.println("");
        B2.display();
        double B2price = B2.getPrice();
        B2price= B2price-(B2price*0.20);
        System.out.println("after");
        System.out.println( B2price);
    }
  
}
