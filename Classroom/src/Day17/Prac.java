package Day17;

import java.util.Random;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter secret word: ");
//        String secret = scanner.nextLine();
//        System.out.print("Enter your guess: ");
//        String userinput = scanner.nextLine();
//        int attempts = 1 ;
//
//        while (!userinput.equals(secret))
//        {
//            System.out.println("Try again you didn't guess");
//            attempts++;
//            userinput = scanner.nextLine();
//
//        }
//
//        System.out.println("You guessed the secret word in "+attempts+" attempts");

        // task 2


//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.nextLine();
//        int i = 2;
//        boolean b = false;
//
//        while (i<word.length()-2)
//        {
//            if ("*".equals(word.charAt(i)+""))
//            {
//                if ((word.charAt(i-1)+"").equals(word.charAt(i+1)+"")) b =true;
//            }
//            i++;
//        }
//        System.out.println(b);

//task 3

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int secret = random.nextInt(10);
//        System.out.print("Enter your guess between 0-10: ");
//        int userinput = scanner.nextInt();
//
//        while (userinput!=secret)
//        {
//            System.out.println("Try again you didn't guess");
//            userinput = scanner.nextInt();
//
//        }
//
//        System.out.println("Congratulations! You guessed the number "+secret+"!");

        // task 4

//        Scanner scanner = new Scanner(System.in);
//        int max = scanner.nextInt();
//
//        for (int i = 0; i < 4 ; i++)
//        {
//            int n = scanner.nextInt();
//            if (n>max) max = n;
//        }
//        System.out.println("The greatest number is "+max);

//        task 5
//
//
//        Random random = new Random();
//        int counter = 0;
//
//        for (int i=0; i < 10; i++)
//        {
//            int n = random.nextInt(5,50);
//            System.out.println(n);
//            if (n>10) counter++;
//        }
//        System.out.println(counter+" Numbers are greater than 10");

        Random random = new Random();
        int tailcounter = 0;
        int headcounter = 0;

        for ( int i = 0; i < 5 ; i++)
        {
          int n = random.nextInt(1,3);
            if (n==1)
            {
                System.out.println("tail");
                tailcounter++;
            }
            else
            {
                System.out.println("head");
                headcounter++;
            }

        }
        if (headcounter==5 || tailcounter==5) System.out.println("You won a jackpot");


    }
}
