import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        /* 1. LOOP BASICS */
        System.out.println(ANSI_GREEN + "1. LOOP BASICS EXERCISE" + ANSI_RESET);

        /* 1a WHILE */
        System.out.println(ANSI_YELLOW+"1a While"+ANSI_RESET);
        int i = 5;
        while (i <= 15){
            System.out.print(i + " ");
            i++;
        }
        /* 1b DO WHILE */
        System.out.println("");
        System.out.println(ANSI_YELLOW+"1b Do While"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+" 1b FIRST:"+ANSI_RESET);
        i = 0;
        do {
           i += 2;
           System.out.println(i);
        }while (i<100);
        System.out.println(ANSI_PURPLE+" 1b SECOND:"+ANSI_RESET);
        do {
            System.out.println(i);
            i-=5;
        }while (i>=-10);
        System.out.println(ANSI_PURPLE+" 1b THIRD:"+ANSI_RESET);
        long j = 2L;
        do {
            System.out.println(j);
            j *= j;
        }while (j < 1000000);

        /* 1c FOR LOOP */
        System.out.println(ANSI_YELLOW+"1c For Loop"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"  1c FIRST:"+ANSI_RESET);
        for (long k = 2L; k < 1000000; k*=k) {
            System.out.println(k);
        }
        System.out.println(ANSI_PURPLE+" 1c SECOND:"+ANSI_RESET);
        for (int k = 5; k <= 15 ; k++) {
            System.out.println(k);
        }
        System.out.println(ANSI_PURPLE+" 1c THIRD:"+ANSI_RESET);
        for (int k = 0; k < 100 ; k+=2) {
            System.out.println(k);
        }
        System.out.println(ANSI_PURPLE+" 1c FOURTH:"+ANSI_RESET);
        for (int k = 100; k >=-10 ; k-=5) {
            System.out.println(k);
        }

        /* 2. FIZZBUZZ */
        System.out.println(ANSI_GREEN+ "2. FIZZBUZZ EXERCISE"+ANSI_RESET);
        for (int k = 0; k <= 100 ; k++) {
            if ((k % 15 == 0)){
                System.out.println(ANSI_BLACK+"FizzBuzz"+ANSI_RESET);
            }else if(k % 5 == 0){
                System.out.println(ANSI_WHITE+"Buzz"+ANSI_RESET);
            }else if(k % 3 == 0){
                System.out.println(ANSI_CYAN+"Fizz"+ANSI_RESET);
            }else{
                System.out.println(k);
            }
        }

        /* 3. Display Power of Tables */
        System.out.println(ANSI_GREEN+"3. DISPLAY TABLE OF POWERS"+ANSI_RESET);
        Scanner tableScanner = new Scanner(System.in);
        int userInput = 0;
        while (userInput <= 0) {
            System.out.println(ANSI_BLUE + "  What number would you like to go up to?" + ANSI_RESET);
            boolean hasNextInt = tableScanner.hasNextInt();
            if (hasNextInt) {
                userInput = tableScanner.nextInt();
                if(userInput >=0){
                    // continue asking user to continue until yes or no reply
                    do{
                        System.out.println(ANSI_BLUE+"Continue? [Y/n]"+ANSI_RESET);
                        Scanner sc = new Scanner(System.in);
                        String userResponse = sc.nextLine();
                        // if reply is yes print table of powers
                        if(userResponse.toLowerCase().startsWith("y")) {
                            System.out.println(ANSI_YELLOW + "number | squared | cubed");
                            System.out.println("------ | ------- | -----" + ANSI_RESET);
                            for (int k = 0; k <= userInput; k++) {
                                int k2 = k * k;
                                int k3 = k * k * k;
                                String str1 = String.format("%-7s", k);
                                String str2 = String.format("%-8s", k2);
                                String str3 = String.format("%-5s", k3);
                                String strLine = str1 +
                                        ANSI_YELLOW + "| " + ANSI_RESET + str2 +
                                        ANSI_YELLOW + "| " + ANSI_RESET + str3;
                                System.out.println(strLine);
                            }
                            break;
                        }
                        else if(userResponse.toLowerCase().startsWith("n")){
                            break;
                        }
                    }while(true);
                }
            } else {
                System.out.println(ANSI_RED + "Invalid Input" + ANSI_RESET);
            }
            tableScanner.nextLine();
        }


        /* 4 CONVERT GRADES */
        System.out.println(ANSI_GREEN+"4. CONVERT GRADES"+ANSI_RESET);
        Scanner gradeScanner = new Scanner(System.in);
        int grade = -1;
        while (grade < 0 || grade >100 ) {
            System.out.println(ANSI_BLUE + "  Enter Grade 0-100:" + ANSI_RESET);
            boolean hasNextInt = gradeScanner.hasNextInt();
            if (hasNextInt) {
                grade = gradeScanner.nextInt();
                if(grade >= 0 && grade <=100){
                    do {
                        System.out.println(ANSI_BLUE+"Continue? [Y/n]"+ANSI_RESET);
                        Scanner sc = new Scanner(System.in);
                        String userResponse = sc.nextLine();
                        if (userResponse.toLowerCase().startsWith("y")) {
                            if (grade > 98 && grade < 101) {
                                System.out.println("A+");
                            } else if (grade >87 && grade < 99) {
                                System.out.println("A");
                            } else if (grade >78 && grade < 88) {
                                System.out.println("B");
                            } else if (grade >66 && grade < 79) {
                                System.out.println("C");
                            } else if (grade >59 && grade < 67) {
                                System.out.println("D");
                            } else {
                                System.out.println("F");
                            }
                            break;
                        }
                        else if(userResponse.toLowerCase().startsWith("n")){
                            break;
                        }
                    }while(true);
                }
            } else {
                System.out.println(ANSI_RED + "Invalid Input" + ANSI_RESET);
            }
            gradeScanner.nextLine();
        }


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
