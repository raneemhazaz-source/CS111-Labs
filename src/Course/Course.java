
package Course;


public class Course {
 private final String courseCode; 
 private String courseName; 
 private String instrucor; 
 private String courseRef; 
 private  static int totalCourses; 
 private  double fee;


    public Course(String courseCode, String courseName, String instrucor,  double fee) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instrucor = instrucor;
         setFee(fee);
         this.courseRef =geerrateRefrncCode();
      totalCourses++;
    }

    public Course(Course course) {
       this.courseCode=course.courseCode;
       this.courseName=course.courseName;
       this.instrucor= course.instrucor;
       this.fee= course.fee;
       this.courseRef= course.courseRef;
        totalCourses++;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName.toUpperCase();
    }

    public String getInstrucor() {
        return instrucor;
    }

    public void setInstrucor(String instrucor) {
        this.instrucor = instrucor;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if (fee>0 ) {
             this.fee = fee;
        }else{
            System.out.println("invailed fee!");
        }
       
    }

    public String geerrateRefrncCode(){
    String courseRef=courseName.substring(0, 1)+ instrucor.substring(0, 1)+courseCode.substring(courseCode.length()-2);
  return  courseRef;
      
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public static void setTotalCourses(int totalCourses) {
        Course.totalCourses = totalCourses;
    }
 public void displayInfo(){
     System.out.println("courseCode     :"+courseCode);
     System.out.println("courseName     :"+courseName);
     System.out.println("instrucor      :"+instrucor);
      System.out.println("fee           :"+fee);
      System.out.println("courseRef     :"+courseRef);
      
 }

    public String getCourseCode() {
        return courseCode;
    }

    
 
}
