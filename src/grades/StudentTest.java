package grades;
public class StudentTest {
    public static void main(String[] args) {
        Student name1 = new Student("John");
        Student name2 = new Student("Jane");
        name1.addGrade(90);
        name1.addGrade(80);
        name1.addGrade(89);
        System.out.println("Name: " + name1.getName());
        name1.printGrades();
        System.out.println("Average Grade: " + name1.getGradeAverage());
        name2.addGrade(100);
        name2.addGrade(50);
        name2.addGrade(80);
        System.out.println("Name: " + name2.getName());
        name2.printGrades();
        System.out.println("Average Grade: " + name2.getGradeAverage());
    }
}
