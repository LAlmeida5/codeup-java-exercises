import java.util.Scanner;

public class ConsoleAdventureGame {
    //Returns a random number between 1-5.
    public static int randomizer = 1 + (int)(Math.random() * ((5 - 1) + 1));


    public static void startGame() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey there! You must be our new HUSTLER! What's your name?");
        String playerName = scan.nextLine();

        System.out.println(playerName + " ,I love that name! It's time to pick a role. Do you want to move TRADITIONAL or EXTRACURRICULAR items?");

        System.out.println("Well then " + playerName + " , it's time to get you loaded up\n and out on your deliveries. Once you reach your quota, return here (we call it \"the shop\")\n to update your inventory or cash out your sales");


    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean decision = true;

        System.out.println("WELCOME TO THE HUSTLER! \n");

        while(decision) {
            System.out.println("ENTER THE NUMBER FOR THE CORRESPONDING SELECTION: \n--  Play Disgruntled? (1) \n--  How to Play? (2)");
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
