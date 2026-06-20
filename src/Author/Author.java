
package Author;


public class Author {
   private String Fname;
   private String Lname;

    public Author(String Fname, String Lname) {
        this.Fname = Fname;
        this.Lname = Lname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

   
   public void Author_Info(){
       System.out.println("frits name "+ Fname);
        System.out.println("last name "+ Lname);
       
   }
}
