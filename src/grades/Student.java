package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
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
}
