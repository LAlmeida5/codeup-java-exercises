package grades;

import java.util.ArrayList;
    //key = github username value = student

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public double getGradeAverage() {
        double bucket = 0;
        for(double grade : grades){
            bucket += grade;
        }
        return bucket / grades.size();
    }
}


