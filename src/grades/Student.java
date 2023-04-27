package grades;
import java.util.HashMap;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }
    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        if (grades.size() == 0){
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (double) sum/grades.size();
    }
    public void printGrades() {
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
    public static double getClassAverage(HashMap<String, Student> students) {
        double sum = 0;
        int count = 0;
        for (Student student : students.values()) {
            sum += student.getGradeAverage();
            count++;
        }
        double classAverage = sum / count;
        return classAverage;
    }
    public void recordAttendance(String date, String status) {
        attendance.put(date, status);
    }

    public String getAttendance(String date) {
        return attendance.get(date);
    }
    public double getAttendancePercentage() {
        int totalDays = attendance.size();
        int absences = 0;
        for (String status : attendance.values()) {
            if (status.equals("A")) {
                absences++;
            }
        }
        return ((double)(totalDays - absences) / totalDays) * 100;
    }


}
