
package Author;


public class Book {
  private String title;
private  Author author ;
private double price;
private  static int Bookcounter;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        Bookcounter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getBookcounter() {
        return Bookcounter;
    }

    public static void setBookcounter(int Bookcounter) {
        Book.Bookcounter = Bookcounter;
    }
public  void display(){
    System.out.println("title :"+title);
    System.out.println("Author Info");
    author.Author_Info();
     System.out.println("price  :"+price);
}
}
