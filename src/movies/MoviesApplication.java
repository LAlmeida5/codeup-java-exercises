package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("To view all movies (Enter \"A\")\nTo view movies by category: (Enter \"C\")");
        String userSelect = scan.nextLine();
    }
}
