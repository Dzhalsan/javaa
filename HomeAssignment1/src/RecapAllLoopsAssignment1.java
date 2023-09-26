import java.util.Random;

public class RecapAllLoopsAssignment1 {
    public static void main(String[] args) {

//        1. Write a program that uses generates and uses 10 random numbers for head or tail
//        and prints in the end who wins heads or tails

        Random random = new Random();
        int tailcounter = 0;
        int headcounter = 0;

        for ( int i = 0; i < 10 ; i++)
        {
            int n = random.nextInt(1,3);
            System.out.println(n);
            if (n==1)
            {
                tailcounter++;
            }
            else
            {
                headcounter++;
            }

        }
        if (headcounter>tailcounter) System.out.println("There are " + headcounter + " heads, heads wins");
        else System.out.println("There are " + tailcounter + " tails, tails wins");

        // 2. Write a program that generates random number between 1-10 inclusive.
        //Then user needs to guess this number until user enters secret number.
        //* user has only has 3 attempts otherwise he lose the game



    }
}
