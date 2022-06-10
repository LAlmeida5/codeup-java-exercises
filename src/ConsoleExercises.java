import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
    //ex #1
       double pi = 3.14159;
       System.out.printf("The value of pi is approximately %.2f%n", pi  );

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
//    David's answer
        System.out.println("Hey what's the length of your room?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Hey what's the width of your room?");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.printf("A room with a length of %d and width of %d results in an area of %d and a perimeter of %d",
                length, width, length * width, (length * 2) + (width * 2));


    }
}
