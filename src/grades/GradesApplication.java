package grades;
import java.util.HashMap;
import java.util.Map;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        students.putIfAbsent("rdelarosa3",new Student("Robert"));
        students.putIfAbsent("rdelarosa39",new Student("Juan"));
        students.putIfAbsent("rdelarosa7",new Student("Pedro"));
        students.putIfAbsent("rdelarosa79",new Student("Maria"));

//      create random grades foreach student
        for (Student s : students.values()){
            for (int i = 0; i <= 20; i++) {
                int rand = (int) Math.floor(Math.random() * 100);
                s.addGrade(rand);
            }
        }

        System.out.println("Welcome");
        menuOptions(students);
        System.out.println("Would you like to see another student");
        if(Input.yesNo()){
            menuOptions(students);
        }else{
            System.out.println("Goodbye, and have a wonderful day");
        }
    }

    public static void menuOptions(Map<String,Student> students){
        System.out.println("Here are the Gihub usernames of our students: \n");
        for (String k : students.keySet()){
            System.out.printf("|%s| ",k);
        }
        System.out.print(" | All |");
        System.out.println(" | CSV |");
        System.out.println("\n\nWhat Student would you like to see more information on?");
        String username = Input.getString();
        if(username.equalsIgnoreCase("all")){
            System.out.printf("Class Avg. Grade for %d students: %.1f%n", students.size(),classAvg(students));
        }
        else if(username.equalsIgnoreCase("csv")){
            csvMap(students);
        }
        else if(students.containsKey(username)) {
            System.out.printf("Name: %s - Github Username: %s%nCurrent Average: %.1f%n", students.get(username).getName(), username, students.get(username).getGradeAverage());
            System.out.printf("%d Attached grades: %n",students.get(username).getGrades().size());
            students.get(username).getAllGrades();
        }
        else{
            System.out.printf("Sorry, no student found with the GitHub username of %s.%n",username);
            menuOptions(students);
        }
    }

    public static double classAvg(Map<String,Student> students){
        double sum = 0;
        for(Student s : students.values()){
            sum+= s.getGradeAverage();
        }
        return sum/students.size();
    }

    public static void csvMap(Map<String, Student> students){
        StringBuilder out = new StringBuilder();
        out.append("name,github_username,average\n");
        for (String key : students.keySet()) {
            out.append(key).append(",");
            out.append(students.get(key).getName()).append(",");
            out.append(students.get(key).getGradeAverage()).append("\n");
        }
        System.out.println(out);
    }
}
