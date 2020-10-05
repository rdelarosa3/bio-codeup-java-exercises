package util;
import colors.ConsoleColors;

public class InputTest{
    public static void main(String[] args) {
        Input test = new Input();
        ConsoleColors.w("Test getInt() input must be type Int");
        System.out.println("Enter a string to fail test or integer to pass:");
        test.getInt();
        ConsoleColors.w("Test getInt(3, 20) input must be type Int between range to Pass test");
        test.getInt(3,20);
        ConsoleColors.w("Test getDouble() input must be type Double");
        System.out.println("Enter a String to fail test or double to pass");
        test.getDouble();
        ConsoleColors.w("Test getDouble(3.5, 10.3) input must be type Double between range to Pass test");
        test.getDouble(3.5,10.3);
        ConsoleColors.w("Test yesNo() input must start with n or y to Pass test");
        test.yesNo();
        ConsoleColors.w("Test getString() must create a string from input");
        String userInput = test.getString();
        System.out.println("Your Input was \"" + userInput + "\"");
    }
}
