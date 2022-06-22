package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student bob = new Student("Bob");
        bob.addGrade(85);
        bob.addGrade(90);
        bob.addGrade(96);
        bob.addGrade(89);

        Student joe = new Student("Sleepy Joe");
        joe.addGrade(73);
        joe.addGrade(99);
        joe.addGrade(87);
        joe.addGrade(98);

        Student derek = new Student("Derek");
        derek.addGrade(100);
        derek.addGrade(98);
        derek.addGrade(97);
        derek.addGrade(100);

        students.put("Bob the Builder", bob);
        students.put("Sleepy Joe", joe);
        students.put("Dirty D", derek);

        for (Map.Entry<String, Student>i:students.entrySet()) {
            System.out.println(i.getKey());
        }
    }
}
