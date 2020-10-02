import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Conversation");
        while(true){
            System.out.println("User:");
            String userInput = scanner.nextLine();
            System.out.println("Bob:");
            System.out.println(response(userInput));
            if (response(userInput).equals("Fine. Be that way!")) break;
        }
        scanner.close();
    }
    public static String response(String input){
        if(input.isEmpty()) return "Fine. Be that way!";
        else if(input.trim().endsWith("?")) return "Sure.";
        else if(input.trim().endsWith("!")) return "Whao, chill out!";
        else return "Whatever.";
    }
}
