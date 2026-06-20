
package Department;


public class Department {
  private int Did;
private String Dname;
private Employee [] ArrayEmp;
private static int empCount;

    public Department(int Did, String Dname) {
        this.Did = Did;
        this.Dname = Dname;
        ArrayEmp = new Employee [3];
       
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int Did) {
        this.Did = Did;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public Employee[] getArrayEmp() {
        return ArrayEmp;
    }

    public void setArrayEmp(Employee[] ArrayEmp) {
        this.ArrayEmp = ArrayEmp;
    }

    public static int getEmpCount() {
        return empCount;
    }

    public static void setEmpCount(int empCount) {
        Department.empCount = empCount;
    }
    public void addEmp( Employee Emp){
        if ( empCount<3) {
         ArrayEmp[empCount] = Emp; 
           empCount++;  
        }else{
            System.out.println("invaid");
        }
       
    }
public void display(){
    System.out.println("id  :"+Did);
    System.out.println("name  :"+Dname);
    System.out.println("---Employee---");
    for (Employee e: ArrayEmp) {
        
        if(e!= null)
       e.display();
    }
}
}
