package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student student1 = new Student("Robert");
        student1.addGrade(88);
        student1.addGrade(90);
        student1.addGrade(99);
        student1.addGrade(70);
        System.out.printf("%s current grade is %.2f",student1.getName(), student1.getGradeAverage());
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
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

    public void getGrades() {
        for (Integer grade : grades){
            System.out.println(grade);
        }
    }
}
