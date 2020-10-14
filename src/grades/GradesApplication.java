package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.putIfAbsent("rdelarosa3",new Student("Robert"));
        students.putIfAbsent("rdelarosa39",new Student("Juan"));
        students.putIfAbsent("rdelarosa7",new Student("Pedro"));
        students.putIfAbsent("rdelarosa79",new Student("Maria"));

        for (Student s : students.values()){
            for (int i = 0; i <= 20; i++) {
                int rand = (int) Math.floor(Math.random() * 100);
                s.addGrade(rand);
            }
        }

        //        for (String k : students.keySet()){
//            System.out.printf("github user: %s%nGrade: %.2f%n",k,students.get(k).getGradeAverage());
//        }
//
//        for (Student s : students.values()){
//            System.out.printf("%s's grades are: %n", s.getName());
//            s.getGrades();
//        }

        System.out.println("Welcome");
        menuOptions(students);
        System.out.println("Would you like to see another student");
        if(Input.yesNo()){
            menuOptions(students);
        }else{
            System.out.println("Goodbye, and have a wonderful day");
        }
    }

    public static void menuOptions(HashMap<String,Student> students){
        System.out.println("Here are the Gihub usernames of our students: \n");
        for (String k : students.keySet()){
            System.out.printf("|%s| ",k);
        }
        System.out.println("\n\nWhat Student would you like to see more information on?");
        String username = Input.getString();
        if(students.containsKey(username)) {
            System.out.printf("Name: %s - Github Username: %s%nCurrent Average: %.1f%n", students.get(username).getName(), username, students.get(username).getGradeAverage());
//            for (Student s : students.values()) {
//                System.out.printf("Name: %s - Github Username: %s%n Current Average: %.1f%n", s.getName(), username, s.getGradeAverage());
//            }
        }else{
            System.out.printf("Sorry, no student found with the GitHub username of %s.%n",username);
            menuOptions(students);
        }

    }



}
