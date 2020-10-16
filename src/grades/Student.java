package grades;

import java.util.*;
public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private Map<Date,String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }


    // return the grades array
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
       grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(Integer i : grades){
            total += i;
        }
       return (double) total/grades.size();
    }
    // return all grades for the student
    public void getAllGrades() {
        for (Integer grade : grades){
            System.out.println(grade);
        }
    }
    // add date to attendance
    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }
//      to call add date
//    String sourceDate = "2012-02-29";
//    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//    Date myDate = format.parse(sourceDate);
//    myDate = DateUtil.addDays(myDate, 1);
}
