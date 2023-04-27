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
        student1.recordAttendance("2023-04-24","P");
        student1.recordAttendance("2023-04-25","A");
        student1.recordAttendance("2023-04-26","P");
        student1.recordAttendance("2023-04-27","P");
        student1.recordAttendance("2023-04-28","A");
        students.put("JaneG87", student1);
        Student student2 = new Student("John");
        student2.addGrade(80);
        student2.addGrade(80);
        student2.addGrade(80);
        student2.recordAttendance("2023-04-24","P");
        student2.recordAttendance("2023-04-25","P");
        student2.recordAttendance("2023-04-26","A");
        student2.recordAttendance("2023-04-27","P");
        student2.recordAttendance("2023-04-28","P");
        students.put("JohnG87", student2);
        Student student3 = new Student("Joe");
        student3.addGrade(70);
        student3.addGrade(70);
        student3.addGrade(70);
        student3.recordAttendance("2023-04-24","P");
        student3.recordAttendance("2023-04-25","A");
        student3.recordAttendance("2023-04-26","A");
        student3.recordAttendance("2023-04-27","A");
        student3.recordAttendance("2023-04-28","P");
        students.put("JoeG87", student3);
        Student student4 = new Student("Jill");
        student4.addGrade(60);
        student4.addGrade(60);
        student4.addGrade(60);
        student4.recordAttendance("2023-04-24","A");
        student4.recordAttendance("2023-04-25","P");
        student4.recordAttendance("2023-04-26","P");
        student4.recordAttendance("2023-04-27","P");
        student4.recordAttendance("2023-04-28","A");
        students.put("JillG87", student4);
        boolean isContinued = true;
        System.out.println("Welcome!");
        System.out.println();
        do {
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println();
            System.out.print("| ");
            for (String username : students.keySet()) {
                System.out.print(username + " | ");
            }
            System.out.println();
            System.out.print("| All | ");
            System.out.print("Class Average | ");
            System.out.print(" CSV Report | ");
            System.out.println("\n");
            System.out.println("What student would you like to see more information on?");
            String userInput = scanner.nextLine();
            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("Username: " + userInput);
                System.out.println("Name: " + student.getName());
                student.printGrades();
                System.out.println("Grade Average: " + student.getGradeAverage());
                System.out.println("Attendance (Weekly M-F): " + student.getAttendance("2023-04-24") + ", " + student.getAttendance("2023-04-25") + ", " + student.getAttendance("2023-04-26") + ", " + student.getAttendance("2023-04-27") + ", " + student.getAttendance("2023-04-28"));
                System.out.println("Attendance Percentage: " + student.getAttendancePercentage());
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
                        if (otherContinued.equalsIgnoreCase("yes") || otherContinued.equalsIgnoreCase("y")) {
                            isOtherContinued = false;
                        } else if (otherContinued.equalsIgnoreCase("no") || otherContinued.equalsIgnoreCase("n")) {
                            isOtherContinued = false;
                            isContinued = false;
                        }
                    } while (isOtherContinued);
                }
            } else if (userInput.equalsIgnoreCase("all")) {
                for (String username : students.keySet()) {
                    Student student = students.get(username);
                    System.out.println("Username: " + username);
                    System.out.println("Name: " + student.getName());
                    student.printGrades();
                    System.out.println("Grade Average: " + student.getGradeAverage());
                    System.out.println("Attendance (Weekly M-F): " + student.getAttendance("2023-04-24") + ", " + student.getAttendance("2023-04-25") + ", " + student.getAttendance("2023-04-26") + ", " + student.getAttendance("2023-04-27") + ", " + student.getAttendance("2023-04-28"));
                    System.out.println("Attendance Percentage: " + student.getAttendancePercentage());
                    System.out.println();
                }
                System.out.println("New Search?: ");
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")) {
                    isContinued = true;
                } else if (userAnswer.equalsIgnoreCase("no") || userAnswer.equalsIgnoreCase("n")) {
                    isContinued = false;
                }
            } else if (userInput.equalsIgnoreCase("class average")) {
                double classAverage = Student.getClassAverage(students);
                System.out.println("Class average: " + classAverage);
                System.out.println("New Search?: ");
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")) {
                    isContinued = true;
                } else if (userAnswer.equalsIgnoreCase("no") || userAnswer.equalsIgnoreCase("n")) {
                    isContinued = false;
                }
            } else if (userInput.equalsIgnoreCase("csv report")) {
                for (String username : students.keySet()) {
                    Student student = students.get(username);
                    System.out.print(student.getName());
                    System.out.print(",");
                    System.out.print(username);
                    System.out.print(",");
                    System.out.print(student.getGradeAverage());
                    System.out.println();
                }
                System.out.println("New Search?: ");
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")) {
                    isContinued = true;
                } else if (userAnswer.equalsIgnoreCase("no") || userAnswer.equalsIgnoreCase("n")) {
                    isContinued = false;
                }
            } else {
                System.out.println("No student found with username: " + userInput);
                System.out.println("New Search?: ");
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")) {
                    isContinued = true;
                } else if (userAnswer.equalsIgnoreCase("no") || userAnswer.equalsIgnoreCase("n")) {
                    isContinued = false;
                }

            }
        } while (isContinued);
    }
}
