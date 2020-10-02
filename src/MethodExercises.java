import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        boolean wantsFactorial = true;
        do{
            int userInput = getInteger(1, 10);
            System.out.println("Your Number is: " + userInput);
            System.out.println("The Factorial for it is: " + getFactorial(userInput));
            printFactorials(userInput);
            System.out.println("Get another?");
            wantsFactorial = askContinue();
        }while(wantsFactorial);

        System.out.print(ANSI_YELLOW + "How many sides do you want on the dice?: " + ANSI_RESET);
        int sides = getIntInput();
        boolean keepRolling = true;
        do{
            int diceOne = rollDice(sides);
            int diceTwo = rollDice(sides);
            System.out.printf("Dice One: %d\nDice Two: %d\n",diceOne,diceTwo);
            System.out.println(ANSI_YELLOW + "Roll Again?" + ANSI_RESET);
            keepRolling = askContinue();
        }while (keepRolling);

        System.out.println(ANSI_RED+"TERMINATING PROGRAM....."+ANSI_RESET);
        
    }

    public static int getInteger(int min, int max) {
        System.out.printf(ANSI_YELLOW + "Enter a number between %s and %s: " + ANSI_RESET, min, max);
        int number = 0;
        int userNumber = getIntInput();
        if (userNumber >= min && userNumber <= max) {
            number = userNumber;
        } else {
            System.out.println(ANSI_RED + "Number out of range" + ANSI_RESET);
            return getInteger(min, max);
        }
        return number;
    }

    public static int getFactorial(int num) {
        if (num < 1) return 1;
        else return getFactorial(num - 1) * num;
    }

    public static void printFactorials(int num) {
        int total = 1;
        String printLine = String.format("%d! = ",num);
        if (num < 1) printLine += "1";
        else {
            for (int i = 1; i <= num; i++) {
                if(i == num ) printLine += i;
                else printLine += (i + " x ");
                total *= i;
            }
        }
        printLine += (" = " + total);
        System.out.println(printLine);
    }

    public static int getIntInput(){
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) return scanner.nextInt();
        System.out.println(ANSI_RED + "Enter a correct value: " + ANSI_RESET);
        return getIntInput();
    }

    public static int rollDice(int max){
        return (int)(Math.random() * max - 1 + 1) + 1;
    }

    public static boolean askContinue(){
        System.out.println(ANSI_BLUE + "Continue? [Y/n]" + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        String userResponse = sc.nextLine();
        if (userResponse.toLowerCase().startsWith("y")) return true;
        else if(userResponse.toLowerCase().startsWith("n")) return false;
        return askContinue();
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int multiplaction(int x, int y) {
        return x * y;
    }

    public static int subtracton(int x, int y) {
        return y - x;
    }

    public static int division(int x, int y) {
        if (x == 0) {
            System.out.println(ANSI_RED + "Not divisible by 0" + ANSI_RESET);
            System.out.print(ANSI_YELLOW + "Enter a Value that is not equal to zero: " + ANSI_RESET);
            x = getIntInput();
            return division(x,y);
        }
        return y / x;
    }

    public static int modulus(int x, int y) {
        if (x == 0) {
            System.out.println(ANSI_RED + "Not divisible by 0" + ANSI_RESET);
            System.out.print(ANSI_YELLOW + "Enter a Value that is not equal to zero: " + ANSI_RESET);
            x = getIntInput();
            return modulus(x,y);
        }
        return y % x;
    }
    
    /* ANSI COLORS TO USE IN TERMINAL PRINTOUT */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

}
