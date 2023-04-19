import java.util.Scanner;
import java.io.*;

public class ConsoleExercises {
    public static void main(String[] args) {
        //Int Exercise
        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + pi + ".");
//        System.out.format("The value of pi is approximately %s.%n", pi);
        //Scanner class Exericse
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an Integer: ");
//        Integer userInput = scanner.nextInt();
//        System.out.println("You entered: \"" + userInput + "\"");
//        System.out.println("Enter 3 words seperated by a space each: ");
//        String first = scanner.next();
//        String second = scanner.next();
//        String third = scanner.next();
//        System.out.format("The first word you entered: \"%s\", the second word you entered: \"%s\", the third word you entered: \"%s.\"%n", first, second, third);
//        System.out.println("Enter a sentence: ");
//        scanner.nextLine();//break sequence
//        String sentence = scanner.nextLine();
//        System.out.format("Your Sentence: \"%s\"", sentence);
        //Calculate Perimeter and area of Codeup's classrooms
        System.out.print("Enter length and width of the Codeup classroom: ");
        Integer length = scanner.nextInt();
        Integer width = scanner.nextInt();
        Integer area = length * width;
        Integer perimeter = ((2 * length) * (2 * width));
        System.out.format("The area of your classroom is: \"%d\"%nThe perimeter of the classroom is: \"%d\"", area, perimeter);
    }
}



