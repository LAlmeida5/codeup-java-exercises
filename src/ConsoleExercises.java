import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
    //ex #1
    //   double pi = 3.14159;
    //   System.out.printf("The value of pi is approximately %.2f", pi  );

    //Scanner Class
    //ex #1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
    //ex #2
        System.out.println("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("Your words are: --> \"" + firstWord + " " + secondWord + " " + thirdWord +"\" <--");
    //ex #3
        scanner.nextLine();
        System.out.println("Enter a sentence:");
        String userSentence = scanner.nextLine();
        System.out.println("Here is your sentence: --> \"" + userSentence + "\" <--");

    }
}
