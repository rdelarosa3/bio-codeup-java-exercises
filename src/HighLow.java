import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame(){
        System.out.println(ANSI_GREEN+ "WELCOME TO GUESS THE NUMBER" + ANSI_RESET);
        int randomNumber = randomNum();
        int numFails = 0;
        boolean keepGuessing = true;
        do{
            System.out.print(ANSI_BLUE + "Enter a number from 1-100: " + ANSI_RESET);
            int userNumber = getIntInput();
            if (isWinner(userNumber,randomNumber)){
                System.out.println(ANSI_GREEN+"Congratulations!"+ANSI_RESET);
                keepGuessing = false;
            }else{
                numFails += 1;
                if(numFails == 3){
                    System.out.println(ANSI_RED+"Take a break you might hurt yourself."+ANSI_RESET);
                    keepGuessing = false;
                }else{
                    System.out.print(ANSI_YELLOW+"Take another Guess? "+ANSI_RESET);
                    keepGuessing = askContinue();
                }
            }
        }while(keepGuessing);
        System.out.print(ANSI_YELLOW+ "Play Again?"+ANSI_RESET);
        if (askContinue()){
            playGame();
        }else{
            System.out.println(ANSI_GREEN+ "See You Next Time" +ANSI_RESET);
        }
    }

    public static int randomNum(){
        return (int)(Math.random() * 100 - 1 + 1) + 1;
    }

    public static boolean isWinner(int userNum, int randNum){
        if(userNum == randNum){
            System.out.println(ANSI_GREEN+"Are you a mind reader?"+ANSI_RESET);

            return true;
        }else{
            System.out.println(ANSI_RED+"Ooops! Wrong number."+ANSI_RESET);
            return false;
        }
    }

    public static int getIntInput(){
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) return scanner.nextInt();
        System.out.println(ANSI_RED + "Enter a correct value: " + ANSI_RESET);
        return getIntInput();
    }
    public static boolean askContinue(){
        System.out.print(ANSI_BLUE + " Continue? [Y/n]: " + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        String userResponse = sc.nextLine();
        if (userResponse.toLowerCase().startsWith("y")) return true;
        else if(userResponse.toLowerCase().startsWith("n")) return false;
        return askContinue();
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
