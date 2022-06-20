package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do?\n\n0 - Exit\n1 - view all movies\n2 - view Animated category\n" +
                "3 - view Drama category\n4 - view Horror category\n5 - view Sci-Fi category\n\nEnter your selection:");
        boolean decision = true;

        while(decision){
        int userSelect = scan.nextInt();
            if (userSelect > 5 || userSelect < 0) {
                System.out.println("Sorry that's not a selection");
            }else if (userSelect == 0) {
                System.out.println("You choose to exit, see ya!");
                break;
            }else if (userSelect == 1) {
                    System.out.println("Here are all the movies we have:");
            }else if (userSelect == 2) {
                System.out.println("Here are all the movies in the ANIMATED category:");
            }else if (userSelect == 3) {
                System.out.println("Here are all the movies in the DRAMA category:");
            }else if (userSelect == 4) {
                System.out.println("Here are all the movies in the HORROR category:");
            }else if (userSelect == 5) {
                System.out.println("Here are all the movies in the SCI-FI category");
            }else {
                System.out.println("Would you like to enter another number? (Y/N)");
                String userDecision = scan.next();
                if(userDecision.equalsIgnoreCase("n")) {
                    decision = false;
                    System.out.println("That's okay, you can check us out another time.");

                }
            }
        }
    }
}
