package Day17;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter secret word: ");
        String secret = scanner.nextLine();
        System.out.print("Enter your guess: ");
        String userinput = scanner.nextLine();
        int attempts = 1 ;

        while (!userinput.equals(secret))
        {
            System.out.println("Try again you didn't guess");
            attempts++;
            userinput = scanner.nextLine();

        }

        System.out.println("You guessed the secret word in "+attempts+" attempts");

    }
}
