package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);
        return name;
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no: (Y/N)");
        String resp = scanner.nextLine();
        boolean decision = false;
        if (resp.equalsIgnoreCase("y")){
            decision = true;
        }
        System.out.println(decision);
        return decision;
    }

    public int getInt(){
        System.out.println("Enter a number between 1 and 30: ");
        int userInput = scanner.nextInt();
        if (userInput < 1 || userInput > 30){
            return getInt();
        }
        System.out.println("You're within the range. Your number is: "+ userInput);
        return userInput;
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        }
        System.out.println("Congrats! You hit within the range. Your number is: " + userInput);
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter a number between 1.0 and 30.0: ");
        double userInput = scanner.nextDouble();
        if (userInput < 1.0 || userInput > 30.0){
            return getDouble();
        }
        System.out.println("You're within the range. Your number is: "+ userInput);
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        }
        System.out.println("Congrats! You hit within the range. Your number is: " + userInput);
        return userInput;

    }

    public static void main(String[] args) {
        Input changes = new Input();
        changes.yesNo();
        changes.getInt();
        changes.getInt(10, 25);
        changes.getDouble();
        changes.getDouble(1, 15);
    }
}
