import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition: " + addition(3, 1));
        System.out.println("Subtraction: " + subtraction(2, 1));
        System.out.println("Multiplication: " + multiplication(2, 1));
        System.out.println("Division: " + division(2, 1));//error if trying to divide by zero(0)
        System.out.println("Modulus: " + modulus(3, 2));
        System.out.println("Multiplication without operand: " + multiplicationWithoutOperand(2, 1));
        System.out.println("Number Validation: " + getInteger(1, 10));
        System.out.println("Factorial: " + factorial());
        diceRolling();
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int multiplicationWithoutOperand(int num1, int num2) {
        int sum = 0;
        for (int i = 1; i <= num2; i++) {
            sum += num1;
        }
        return sum;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.format("Enter a number between %d and %d: %n", min, max);
            while (!scanner.hasNextInt()) {
                System.out.println("This is not a valid number. Please try again.");
                System.out.format("Enter a number between %d and %d: %n", min, max);
                scanner.next();
            }
            userInput = scanner.nextInt();
            if (userInput > max || userInput < min) {
                System.out.format("The value entered is not within the range if %d and %d. %nPlease try again...%n", min, max);
            }
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public static long factorial() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        long sum = 1;
        long maxLong = 20;
        do {
            System.out.format("Enter a number between 1 and %d: %n", maxLong);
            while (!scanner.hasNextInt()) {
                System.out.println("This is not a valid number. Please try again.");
                scanner.next();
                System.out.format("Enter a number between 1 and %d: %n", maxLong);
            }
            userInput = scanner.nextInt();
            if (userInput > maxLong || userInput < 1) {
                System.out.format("The value entered is not within the range if 1 and %d. \nPlease try again...%n", maxLong);
            }
            for (int i = 1; i <= userInput; i++) {
                sum *= i;
            }
        } while (userInput < 1 || userInput > maxLong);
        return sum;
    }

    public static void diceRolling() {
        Scanner scanner = new Scanner(System.in);
        String roll;
            System.out.println("Enter the number of sides for each die");
            int diceSides = scanner.nextInt();
        do {
            int die1 = randomNumberGenerator(diceSides);
            int die2 = randomNumberGenerator(diceSides);
            System.out.println("Roll Dice?: (Y/N)");
            roll = scanner.next();
            if (roll.equalsIgnoreCase("Y")) {
                System.out.format("Die 1: %d%n Die 2: %d%n", die1, die2);
            } else if (roll.equalsIgnoreCase("N")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Not a valid response, Goodbye!");
            }
        } while (roll.equalsIgnoreCase("Y"));
    }
    public static int randomNumberGenerator(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }



}
