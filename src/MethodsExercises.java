import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static long multiplication(long num1, long num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static int modulus(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static int recursion(int x, int y) {
        if (x < y)
            return recursion(y, x);
        else if (y != 0)
            return (x + recursion(x, y - 1));
        else
            return 0;
    }

    public static void getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        boolean decision = true;

        while (decision) {
            System.out.println("Enter a number with the range of " + min + " <---> " + max + ":");
            int value = scan.nextInt();
            if (value >= min && value <= max) {
                System.out.println("Congrats! You hit within the range. Your number is: " + value);
            }else if (value < min || value > max) {
                System.out.println("Your number is: " + value + " and is not within the set range!");
            }
                System.out.println("Do you want to enter another number? (Y/N)");
                String userDecision = scan.next();
            if (userDecision.equalsIgnoreCase("n")) {
                decision = false;
                System.out.println("Fine then, be that way :(");
            }
        }
    }

    public static void getFactorial() {
        Scanner scan2 = new Scanner(System.in);
        boolean decision = true;
        while (decision) {
            System.out.println("Please enter a number between 1 <---> 10: ");
            int userInt = scan2.nextInt();
            int i =1;
            long factorial = 1;
            if (userInt < 1 || userInt > 10) {
                System.out.println("Really? That's not between 1 <---> 10!! Try again!");
            }else if (userInt > 1 && userInt <10) {
                while(i <= userInt) {
                    factorial *= i;
                    i++;
                }
                System.out.println("The factorial of " + userInt + "is: " + factorial);
            }
                System.out.println("Would you like to enter another number? (Y/N)");
                String userDecision = scan2.next();
            if(userDecision.equalsIgnoreCase("n")){
                decision = false;
                System.out.println("That's okay, it was fun while it lasted.");
            }

        }

    }



    public static void main(String[] args) {

//        System.out.println(multiplication(10,10));
//        System.out.println(addition(33,33));
//        System.out.println(division(30,5));
//        System.out.println(subtraction(253,135));
//        System.out.println(modulus(10, 3));
//
//
//        System.out.println(recursion(20, 5 ));
//        getInteger(15,45);
        getFactorial();

    }
}
