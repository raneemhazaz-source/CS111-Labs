
package LAB5;


public class Date {
   private int day;
   private int month;
   private int year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int differenceInDays(Date current){
        int totel1= year*365+month*30+ day;
     int totel2= current.year*365+ current.month*30+current.day;
     return  totel2 - totel1;
    }
    
    @Override
    public String toString() {
        return String.format("day:%d\n month:%d\n year:%d\n", day,month,year);
    }
   
}
