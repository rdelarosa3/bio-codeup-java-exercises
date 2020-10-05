package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public String getString(){
        this.scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public boolean yesNo(){
        this.scanner = new Scanner(System.in);
        System.out.println("Continue? [Y/n]");
        String userResponse = scanner.nextLine();
        if (userResponse.toLowerCase().startsWith("y")) return true;
        else if(userResponse.toLowerCase().startsWith("n")) return false;
        return yesNo();
    }

    public int getInt(int min, int max){
        this.scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userNumber = getInt();
        if (userNumber >= min && userNumber <= max) return userNumber;
        System.out.println("Number out of range");
        return getInt(min, max);
    }

    public double getDouble(double min, double max){
        this.scanner = new Scanner(System.in);
        System.out.printf("Enter a float number between %s and %s: ", min, max);
        double userNumber = getDouble();
        if (userNumber >= min && userNumber <= max) return userNumber;
        System.out.println("Number out of range");
        return getDouble(min, max);
    }
    public double getDouble(){
        this.scanner = new Scanner(System.in);
        boolean hasNextDouble = scanner.hasNextDouble();
        if (hasNextDouble) return scanner.nextDouble();
        System.out.println("Enter a correct float value: ");
        return getDouble();
    }
    public int getInt(){
        this.scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) return scanner.nextInt();
        System.out.println("Enter a correct value: ");
        return getInt();
    }

}
