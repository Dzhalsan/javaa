import java.util.Random;
import java.util.Scanner;

public class RecapAllLoopsAssignment1 {
    public static void main(String[] args) {

//        1. Write a program that uses generates and uses 10 random numbers for head or tail
//        and prints in the end who wins heads or tails

//        Random random = new Random();
//        int tailcounter = 0;
//        int headcounter = 0;
//
//        for ( int i = 0; i < 10 ; i++)
//        {
//            int n = random.nextInt(1,3);
//            System.out.println(n);
//            if (n==1)
//            {
//                tailcounter++;
//            }
//            else
//            {
//                headcounter++;
//            }
//
//        }
//        if (headcounter>tailcounter) System.out.println("There are " + headcounter + " heads, heads wins");
//        else System.out.println("There are " + tailcounter + " tails, tails wins");

        // 2. Write a program that generates random number between 1-10 inclusive.
        //Then user needs to guess this number until user enters secret number.
        //* user has only has 3 attempts otherwise he lose the game

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int attempts = 1;
//        int secret = random.nextInt(1,10);
//        System.out.println(secret);
//        System.out.print("Enter your guess between 1-10 inclusive: ");
//        int userinput = scanner.nextInt();
//
//        while (userinput!=secret)
//        {
//            attempts++;
//            if (attempts>3) break;
//            System.out.println("Try again you didn't guess");
//            userinput = scanner.nextInt();
//
//
//        }
//        if (attempts<=3) System.out.println("Congratulations! You guessed the number "+secret+"!");
//          else  System.out.println("Game over, secret number was "+secret);

          // 3. Write a program which generates 15 numbers in this range (50,101);
        //These random numbers represent the students grades for the exam.
        //You need to print whether students go for free or need to pay for summer camp,
        //including average grade of the students.
        //* If the average grade for the exam is greater than 70
        //print that students go to a summer camp for free
        //* Otherwise they need to pay for summer camp

        Random random = new Random();
        int pass = 0;

        for (int i = 0; i < 15;i++)
        {
         int n = random.nextInt(50,101);
         pass+=n;
        }
        if ((double)pass/15>70)
            System.out.println("You summer camp is free of charge, because your average is about " + ((double)pass / 15));
        else System.out.println("You need to pay for summer camp, because your average is about " + ((double)pass / 15));


    }
}
