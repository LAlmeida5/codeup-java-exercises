import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ConsoleAdventureGame {
    //Returns a random number between 1-5.
    public static int randomizer = 1 + (int)(Math.random() * ((5 - 1) + 1));

    public static void traditional(){
        System.out.println("Now playing...THE HUSTLER: TRADITIONAL");
        System.out.println("**************************************");
    }

    public static void extracurricular() {
        System.out.println("Now playing...THE HUSTLER: EXTRACURRICULAR");
        System.out.println("******************************************");
    }


    public static void startGame() {
        Scanner scan = new Scanner(System.in);
        boolean gameChoice = true;

        System.out.println("****************************************************************************\n\n");

        System.out.println("Macho Man: oooooooh yeahhhhh, You must be our new HUSTLER! What's your name?");
        String playerName = scan.nextLine();

        while (gameChoice) {
            System.out.println("Macho Man: Awesome " + playerName + " It's time to pick a style of play.");
            System.out.println("Do you want to move TRADITIONAL or EXTRACURRICULAR items? (TRAD/EXTRA)");
            String gameSelect = scan.nextLine();
            if (gameSelect.equalsIgnoreCase("trad")) {
                System.out.println("Let's load up TRADITIONAL play...\n\n");
                System.out.println("**************************************");
                gameChoice = false;
                traditional();
            } else if (gameSelect.equalsIgnoreCase("extra")) {
                System.out.println("Let's load up EXTRACURRICULAR play...\n\n");
                System.out.println("******************************************");
                gameChoice = false;
                extracurricular();
            } else {
                System.out.println("Check spelling and try again? (Y/N)");
                String userChoice = scan.next();
                if (userChoice.equalsIgnoreCase("n")) {
                    gameChoice = false;
                    System.out.println("I guess you didn't really wanna play?");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean decision = true;

        System.out.println("WELCOME TO THE HUSTLER! \n");

        while(decision) {
            System.out.println("ENTER THE NUMBER FOR THE CORRESPONDING SELECTION: \n--  Play HUSTLER? (1) \n--  How to Play? (2)");
            int userSelect = scan.nextInt();
            if (userSelect == 1) {
                startGame();
                break;
            } else if (userSelect == 2) {
                System.out.println("""
                HOW TO PLAY:
                *******************************************************************************************************************************
                * Navigate through the city to make your deliveries to hungry customers. Make selections from provided options to ensure the  *
                * right orders are delivered to the right people. Beware! Chance has been embedded into all your deliveries, fail to navigate *
                * challenges and customers get HANGRY! Return to base with the right amount of cash or get CANNED!                            *
                *******************************************************************************************************************************
                """);
            } else {
                System.out.println("HEY THAT'S NOT A OPTION, TRY AGAIN... (Y/N)");
                String userChoice = scan.next();
                if (userChoice.equalsIgnoreCase("n")) {
                    decision = false;
                    System.out.println("THAT'S COOL, NOW BEAT IT!");
                }
            }
        }
    }
}
