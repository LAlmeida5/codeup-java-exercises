import java.util.Scanner;

public class HighLow {
    public static void playGame() {
        Scanner scan = new Scanner(System.in);
        boolean decision = true;
        int randomNum = (int) (Math.random() * 100) + 1;
        int guessCount = 5;

        while (decision) {
            if (guessCount == 0) {
                System.out.println("You're done son, I WIN!!!");
                break;
            }
            System.out.println("Guess a number between 1 and 100:");
            int userGuess = scan.nextInt();
                if(userGuess == randomNum) {
                    System.out.println("Good guess");
                    System.out.println("Play again? (Y/N)");
                    String userChoice = scan.next();
                    if (userChoice.equalsIgnoreCase("n")) {
                        decision = false;
                    }
                } else if (userGuess > randomNum) {
                    System.out.println("Higher");
                }else if (userGuess < randomNum) {
                    System.out.println("Lower");
                }
                    guessCount--;
                    System.out.println("Number of guesses remaining: " + guessCount);
            }
        }

    public static void main(String[] args) {
        playGame();
    }
}


