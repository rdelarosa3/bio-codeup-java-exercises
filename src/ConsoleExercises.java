import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n",pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String userInput = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.printf("%s %s %s\n",userInput,userInput2, userInput3);

        scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput4 = scanner.nextLine();
        System.out.println("userInput4 = " + userInput4);

        scanner = new Scanner(System.in);
        System.out.print("Enter a Length: ");
        double classLength = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter a Width: ");
        double classWidth = Double.parseDouble(scanner.nextLine());
        System.out.println("Area: " + classLength * classWidth );
        System.out.println("Perimeter: " + (2*classLength + 2*classWidth));

        scanner = new Scanner(System.in);
        double length = 0;
        double width = 0;
        while(length == 0){
            System.out.println("Enter a Length: ");
            boolean hasNextDouble = scanner.hasNextDouble();
            if(hasNextDouble){
                length = scanner.nextDouble();
                System.out.println("Your Length is "+length);
            }else{
                System.out.println("Invalid Input for Length");
            }
            scanner.nextLine();
        }
        
        while(width == 0){
            System.out.print("Enter a Width: ");
            boolean hasNextDouble = scanner.hasNextDouble();
            if(hasNextDouble){
                width = scanner.nextDouble();
            }else{
                System.out.println("Invalid Input for Width");
            }
            scanner.nextLine();
        }

        if (length > 0 && width > 0) {
            System.out.println("Area: " + length * width );
            System.out.println("Perimeter: " + (2*length + 2*width));
        }
        scanner.close();
        
    }
}
                                                      