import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("LOOP BASICS EXERCISE");
        int i = 5;
        while (i <= 15){
            i++;
            System.out.println("i = " + i);
        }
        System.out.println("final while i = " + i);

        i = 0;
        do {
           i += 2;
            System.out.println(i);
        }while (i<100);
        do {
            i-=5;
            System.out.println(i);
        }while (i>-10);
        long j = 2L;
        do {
            System.out.println(j);
            j *= j;
        }while (j < 1000000);

        for (long k = 2L; k < 1000000; k*=k) {
            System.out.println(k);
        }
        for (int k = 5; k <= 15 ; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < 100 ; k+=2) {
            System.out.println(k);
        }
        for (int k = 100; k >=-10 ; k-=5) {
            System.out.println(k);
        }
        System.out.println("FIZZBUZZ EXERCISE");

        for (int k = 0; k <= 100 ; k++) {
            if ((k % 3 == 0) && (k % 5 == 0)){
                System.out.println("FizzBuzz");
            }else if(k % 5 == 0){
                System.out.println("Buzz");
            }else if(k % 3 == 0){
                System.out.println("Fizz");
            }
        }
        System.out.println("DISPLAY TABLE OF POWERS");
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while(userInput == 0){
            System.out.println("What number would you like to go up to?");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                userInput = scanner.nextInt();
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");

                for (int k = 0; k <= userInput ; k++) {
                    int k2 = k*k;
                    int k3 = k*k*k;
                    int lengthK = String.valueOf(k).length();
                    int lengthK2 = String.valueOf(k2).length();
                    int lengthK3 = String.valueOf(k3).length();
                    int numSpaces = 7 - lengthK;
                    int sqSpaces =  8 - lengthK2;
                    int cuSpaces = 5 - lengthK3;
                    StringBuilder newLine = new StringBuilder("" + k);
                    do {
                        newLine.append(" ");
                        numSpaces--;
                    } while(numSpaces>0);
                    newLine.append("| ").append(k2);
                    do {
                        newLine.append(" ");
                        sqSpaces--;
                    } while(sqSpaces>0);
                    newLine.append("| ").append(k3);
                    do {
                        newLine.append(" ");
                        cuSpaces--;
                    } while(cuSpaces>0);
                    System.out.println(newLine);
                }
            }else{
                System.out.println("Invalid Input");
            }
            scanner.nextLine();
        }
        System.out.println("CONVERT GRADES");
        scanner = new Scanner(System.in);
        int grade = -1;
        while(grade < 0){
            System.out.println("Enter Grade 0-100");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                grade = scanner.nextInt();
                if(grade>98 && grade<101){
                    System.out.println("A+");
                }
                else if(grade>=88 && grade<99){
                    System.out.println("A");
                }
                else if(grade>=79 && grade<88){
                    System.out.println("B");
                }
                else if(grade>=67 && grade<79) {
                    System.out.println("C");
                }
                else if(grade>=60 && grade<67){
                    System.out.println("D");
                }else{
                    System.out.println("F");
                }
            }else{
                System.out.println("Invalid Input");
            }
            scanner.nextLine();
        }

    }

}
