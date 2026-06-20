
package Course;

import java.util.Scanner;
public class CourseTest {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Course c1 = new Course("Cs101","in","raneem",12000);
       Course c2 = new Course("Cs201","rn","qaneem",15000);
       Course c3 = new Course("it101","mn","saneem",16000);
       
        Course [] c = new Course [3];
        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
        for (int i = 0; i < c.length; i++) {
            System.out.println("Course"+(i+1));
            c[i].displayInfo();
            System.out.println("----------");
        }
        System.out.println("the total number of  Course :"+ Course .getTotalCourses());
        System.out.println("");
        System.out.println("enter the new fee:");
        String Newfeestr = input.next();
        double Newfee= Double.parseDouble(Newfeestr);
        c[1].setFee(Newfee);
        System.out.println("courseName     :"+c[1].getCourseName());
         System.out.println("fee           :"+c[1].getFee());
        System.out.println("search course:");
        String search= input.next();
        searchCourse(c, search);
    }
    public static void searchCourse(Course [] c, String courseCode){
        for (int i = 0; i < c.length; i++) {
            
        
        if (c[i].getCourseCode().equalsIgnoreCase(courseCode)) {
        System.out.println("found");
        c[i].displayInfo();
            return;
        }else{
        System.out.println("not found");
        }
        }
    } 
}
