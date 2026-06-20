
package Department;


public class DepartmentTest {
    public static void main(String[] args) {
         Employee e1 = new Employee(111,20,"Ali");
         Employee e2 = new Employee(222,19,"Ahmed");
         Employee e3 = new Employee(333,21,"Khaled");
        Department D = new Department(555,"Raneem");
        D.addEmp(e1);
        D.addEmp(e2);
        D.addEmp(e3);
        
       D.display();
        System.out.println("e3 name  "+D.getArrayEmp()[2].getName());
        System.out.println("e1 age "+D.getArrayEmp()[0].getAge());
        
        
    }
}
