import grades.Student;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Jane");
        student1.addGrade(90);
        student1.addGrade(90);
        student1.addGrade(90);
        students.put("JaneG87", student1);
        Student student2 = new Student("John");
        student2.addGrade(80);
        student2.addGrade(80);
        student2.addGrade(80);
        students.put("JohnG87", student2);
        Student student3 = new Student("Joe");
        student3.addGrade(70);
        student3.addGrade(70);
        student3.addGrade(70);
        students.put("JoeG87", student3);
        Student student4 = new Student("Jill");
        student4.addGrade(60);
        student4.addGrade(60);
        student4.addGrade(60);
        students.put("JillG87", student4);
        boolean isContinued = true;
            System.out.println("Welcome!");
            System.out.println();
        do {
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println();
            for (String username : students.keySet()) {
                System.out.print("| " + username + " | ");
            }
            System.out.println("\n");
            System.out.println("What student would you like to see more information on?");
            String userInput = scanner.nextLine();
            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("Username: " + userInput);
                System.out.println("Name: " + student.getName());
                System.out.println("Grades: " + student.getGradeAverage());
                System.out.println();
                System.out.println("New Search?: ");
                String userResponse = scanner.nextLine();
                if (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")) {
                    isContinued = true;
                } else if (userResponse.equalsIgnoreCase("no") || userResponse.equalsIgnoreCase("n")) {
                    isContinued = false;
                } else {
                    boolean isOtherContinued = true;
                    do {
                        System.out.println("Not a valid response...");
                        System.out.println("New Search?: ");
                        String otherContinued = scanner.nextLine();
                        if (otherContinued.equalsIgnoreCase("yes") || otherContinued.equalsIgnoreCase("y")){
                            isOtherContinued = false;
                        } else if (otherContinued.equalsIgnoreCase("no") || otherContinued.equalsIgnoreCase("n")) {
                            isOtherContinued = false;
                            isContinued = false;
                        }
                    } while (isOtherContinued);
                }
            } else {
                System.out.println("No student found with username: " + userInput);
                System.out.println("New Search?: ");
            }
        } while (isContinued);
    }
}
