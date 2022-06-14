import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
    //Loop Basics
         //a.While
        int i = 5;
        while (i <= 15) {
            System.out.println("i is:" + i);
            i++;
        }

        //b.Do While
        int w = 0;
        do {
            System.out.println(w);
            w += 2 ;
        }
        while (w <= 100);

        int y = 100;
        do {
            System.out.println(y);
            y -= 5;
        }
        while (y >= -10);

        long z = 2;
        do {
            System.out.println(z);
            z *= z;
        }
        while(z <= 1000000);

        //c.For

        for(int a = 100; a >= -10; a = a - 5) {
            System.out.println(a);
        }

        for(long b=2; b <= 1000000; b = b *  b) {
            System.out.println(b);
        }

    //Fizzbuzz

        for(int c = 1; c <= 100; c++) {
            if (c % 15 == 0) System.out.println("FizzBuzz");
            else if (c % 5 == 0) System.out.println("Buzz");
            else if (c % 3 == 0) System.out.println("Fizz");
            else System.out.println(c);
        }

    //Table of Powers
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to go to?");
        int userInputInt = scan.nextInt();

        final int NMAX = 3;
        final long XMAX = userInputInt;
        String number = "Number";
        String squared = "Squared";
        String cubed = "Cubed";

        for (long n = 1; n <= 1; n++){
            System.out.printf("%10s | %9s | %9s |", number, squared, cubed);
        }
        System.out.println();
        for (long n =1; n <= NMAX; n++){
            System.out.printf("%10s |", "----------");
        }
        System.out.println();

        for (long x = 1; x <= XMAX; x++){
            for(int n = 1; n <= NMAX; n++){
                System.out.printf("%-10.0f |", Math.pow(x, n));
            }
            System.out.println();
        }

    //Convert to letter grades
        boolean decision = true;

        while (decision){
            System.out.println("Please enter your numerical grade:");
            int userGradeIn = scan.nextInt();
            if(userGradeIn >= 0 && userGradeIn <= 59){
                System.out.println("F");
            }else if (userGradeIn > 59 && userGradeIn <= 69){
                System.out.println("D");
            }else if (userGradeIn > 69 && userGradeIn <= 79){
                System.out.println("C");
            }else if (userGradeIn > 79 && userGradeIn <= 89){
                System.out.println("B");
            }else if (userGradeIn > 89 && userGradeIn <= 100){
                System.out.println("A");
            }
                System.out.println("Do you want to enter another grade? (Y/N)");
                String userInput = scan.next();
                if(userInput.equalsIgnoreCase("n")){
                    decision = false;
                    System.out.println("See you later!");
                }

            }

        }

    }


