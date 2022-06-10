import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
    //ex #1
    //   double pi = 3.14159;
    //   System.out.printf("The value of pi is approximately %.2f", pi  );

    //Scanner Class
    //ex #1
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//    //ex #2
//        System.out.println("Enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println("Your words are: --> \"" + firstWord + " " + secondWord + " " + thirdWord +"\" <--");
//    //ex #3
//        scanner.nextLine();
//        System.out.println("Enter a sentence:");
//        String userSentence = scanner.nextLine();
//        System.out.println("Here is your sentence: --> \"" + userSentence + "\" <--");

    //Calculate Perimeter
    //ex #1
        System.out.println("Enter classroom length, then width:");
        String userLength = scanner.nextLine();
        String userWidth = scanner.nextLine();
        System.out.println("You entered: \"" + userLength + " for the Length, and " + userWidth + " for the Width\"");
        int intLength = Integer.parseInt(userLength);
        int intWidth = Integer.parseInt(userWidth);
        System.out.println("The area of your room is: \"" + intLength * intWidth + "\"");
        System.out.println("The perimeter of your room is: \"" + ((intLength*2) + (intWidth*2)) + "\"");

    }
}
