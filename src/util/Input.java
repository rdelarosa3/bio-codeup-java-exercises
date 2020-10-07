package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public static String getString(){
        scanner = new Scanner(System.in);
        System.out.println("Type a string");
        return scanner.nextLine();
    }
    public static boolean yesNo(){
        scanner = new Scanner(System.in);
        System.out.println("Continue? [Y/n]");
        String userResponse = scanner.nextLine();
        if (userResponse.trim().toLowerCase().startsWith("y")){
            return true;
        }
        else if(userResponse.trim().toLowerCase().startsWith("n")){
            return false;
        }
        System.out.println(ANSI_RED+"Enter a correct value: "+ANSI_RESET);
        return yesNo();
    }

    public static int getInt(){
        scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            return scanner.nextInt();
        }else{
            System.out.println(ANSI_RED+"Enter a correct value: "+ANSI_RESET);
            scanner =  new Scanner(System.in);
            return getInt();
        }
    }

    public static int getInt(int min, int max){
        scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userNumber = getInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        }else{
            System.out.println(ANSI_RED+"Number out of range"+ANSI_RESET);
            return getInt(min, max);
        }
    }
    public static double getDouble(){
        scanner = new Scanner(System.in);
        boolean hasNextDouble = scanner.hasNextDouble();
        if (hasNextDouble) {
            return scanner.nextDouble();
        }else{
            System.out.println(ANSI_RED+"Enter a correct value: "+ANSI_RESET);
            scanner = new Scanner(System.in);
            return getDouble();
        }
    }

    public static double getDouble(double min, double max){
        scanner = new Scanner(System.in);
        System.out.printf("Enter a float number between %s and %s: ", min, max);
        double userNumber = getDouble();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        }else{
            System.out.println(ANSI_RED+"Number out of range"+ANSI_RESET);
            return getDouble(min, max);
        }
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
