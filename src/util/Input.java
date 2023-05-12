package util;
import java.util.Scanner;
public class Input {
    private final Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }
    public Input(){
        scanner = new Scanner(System.in);
    }
    public String setString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public String getString(){
        System.out.println("Please input String: ");
        return scanner.nextLine();
    }
    public boolean yesNo(){
        String userInput = setString("Please enter yes or no...");
        if (userInput.equalsIgnoreCase("yes")|| userInput.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }
    public int getInt(int min, int max){
        System.out.println("Please enter a number between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if(userInput < min || userInput > max){
            return getInt(min, max);
        }
        return userInput;
    }
    public int getInt(){
        System.out.println("Please enter a number: ");
        String stringVal = getString();
        try{
            return Integer.valueOf(stringVal);
        }catch (NumberFormatException e) {
            System.out.println("You had an invalid input, try again");
            return getInt();
        }
    }
    public double getDouble(double min, double max){
        System.out.println("Please enter a number between " + min + "and " + max);
        int userInput = scanner.nextInt();
        if(userInput < min || userInput > max){
            return getDouble(min, max);
        }
        return userInput;
    }
    public double getDouble(){
        System.out.println("Please enter a number: ");
        String stringVal = getString();
        try{
            return Double.valueOf(stringVal);
        }catch (NumberFormatException e) {
            System.out.println("You had an invalid input, try again");
            return getDouble();
        }
    }
}
