import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//<-------------------------Loop basic----------------------------------------------------------->
        //While Loop
//        Integer i = 5;
//        while (i <= 15){
//            System.out.format("%d ", i);
//            i += 1;

        //Do While
//        long num = 2;
//        int limit = 1000000;
//        do {
//            System.out.println(num);
//            num *= num;
//        }while (num <= limit);
        //For Loop
//        for (long i = num; i < limit; i*=i){
//            System.out.println(i);
//        }
//<------------------------- FizzBuzz ----------------------------------------------------------->
//        for (int i = 0; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else {
//                if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }
//        }
//<------------------------- Display a table of powers ----------------------------------------------------------->
        Scanner scanner = new Scanner(System.in);
//        boolean isContinued = false;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int userInput = scanner.nextInt();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.format("%-2d     | %-2d      | %-2d     %n", i, square, cubed);
//            }
//            System.out.println("Continue?");
//            boolean continueUser = scanner.nextBoolean();
//            if (continueUser = true) {
//                isContinued = true;
//            } else {
//                isContinued = false;
//            }
//        } while (isContinued == true);
//<------------------------- Convert given number grades into letter grades ----------------------------------------------------------->
        boolean isContinued = false;
        do {
            System.out.println("Enter a numerical grade from 0 - 100:");
            int userInput = scanner.nextInt();
            if ((userInput >= 97)){
                System.out.format("Your letter grade for \"%d\" is: A+%n", userInput);
            } else if ((userInput < 97) && (userInput >= 88)) {
                System.out.format("Your letter grade for \"%d\" is: A%n", userInput);
            } else if ((userInput < 88) && (userInput >= 85)) {
                System.out.format("Your letter grade for \"%d\" is: B+%n", userInput);
            } else if ((userInput < 85) && (userInput >= 80)) {
                System.out.format("Your letter grade for \"%d\" is: B%n", userInput);
            } else if ((userInput < 80) && (userInput >= 77)) {
                System.out.format("Your letter grade for \"%d\" is: C+%n", userInput);
            } else if ((userInput < 77) && (userInput >= 67)) {
                System.out.format("Your letter grade for \"%d\" is: C%n", userInput);
            } else if ((userInput < 67) && (userInput >= 64)) {
                System.out.format("Your letter grade for \"%d\" is: D+%n", userInput);
            } else if ((userInput < 64) && (userInput >= 60)) {
                System.out.format("Your letter grade for \"%d\" is: D%n", userInput);
            } else {
                System.out.format("Your letter grade for \"%d\" is: F%n", userInput);
            }
            scanner.nextLine();
            System.out.println("Continue? True = yes, False = no");
            boolean continueUser = scanner.nextBoolean();
            if (continueUser == true) {
                isContinued = true;
            } else {
                isContinued = false;
            }
        } while (isContinued == true);
    }


}


