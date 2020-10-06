package util;
import colors.ConsoleColors;

public class InputTest{
    public static void main(String[] args) {

        System.out.println(ConsoleColors.w("Test getInt() input must be type Int"));
        System.out.println("Enter a string to fail test or integer to pass:");
        Input.getInt();
        System.out.println(ConsoleColors.w("Test getInt(3, 20) input must be type Int between range to Pass test"));
        Input.getInt(3,20);
        System.out.println(ConsoleColors.w("Test getDouble() input must be type Double"));
        System.out.println("Enter a String to fail test or double to pass");
        Input.getDouble();
        System.out.println(ConsoleColors.w("Test getDouble(3.5, 10.3) input must be type Double between range to Pass test"));
        Input.getDouble(3.5,10.3);
        System.out.println(ConsoleColors.w("Test yesNo() input must start with n or y to Pass test"));
        Input.yesNo();
        System.out.println(ConsoleColors.w("Test getString() must create a string from input"));
        String userInput = Input.getString();
        System.out.println("Your Input was: " + ConsoleColors.a(ConsoleColors.BLUE_UNDERLINED,userInput));
    }
}
