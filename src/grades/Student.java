package grades;

import java.util.ArrayList;
    //key = github username value = student

public class Student {

    private String name;
    private int grade;
    public int sum;
    public int counter;
    public int average;

    public String getName() {
        return this.name;
    }
    public void addGrade(int grade){
        grades.add(this.grade);
    }

    public double getGradeAverage(){
        average = sum/counter;
        return average;
    }

    ArrayList<Integer> grades = new ArrayList<Integer>(10);

}
