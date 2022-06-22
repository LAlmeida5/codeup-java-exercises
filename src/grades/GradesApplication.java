package grades;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        students.put("BobtheBuilder22", bob);
        students.put("Sleepy-Joe19", joe);
        students.put("DirtyD1", derek);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!\n\nHere are the students GitHub usernames: \n");
        for (Map.Entry<String, Student>i:students.entrySet()) {
            System.out.printf("| " + i.getKey() + " | ");
        }
        boolean decision = true;

        while(decision){
            System.out.println("\n");
            System.out.println("Which student would you like to see more information on? ");
            String userInput = scanner.next();
            if (students.containsKey(userInput)) {
                System.out.printf("Name: " + students.get(userInput).getName() + "\nGitHub Username: " + userInput +
                        "\nCurrent GPA: " + students.get(userInput).getGradeAverage());
            }else{
                System.out.println("Sorry, there does not appear to be a student with that usernmame. Please check spelling and " +
                        "try again.");
                System.out.println("\nWould you like to continue? (Y/N)");
                String userDecision = scanner.next();
                if (userDecision.equalsIgnoreCase("n")){
                     System.out.println("Now exiting....");
                     decision = false;
                }
            }
        }
    }
}
