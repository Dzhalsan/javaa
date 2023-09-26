import java.util.Random;

public class RandomAssignments {
    public static void main(String[] args) {
//        1. Write a program that generates 5 random numbers
//        within this range (20-31) and prints them in new lines using for loop.

//        Random random = new Random();
//        for (int i = 0 ; i<5; i++)
//        {
//            System.out.println(random.nextInt(20, 31));
//        }

        // task 2

//        2. Write a program that generates 3 random numbers
//        within this range (1-5), print random number itself and random number multiplied by 2

//        Random random = new Random();
//        for (int i = 0; i < 3 ; i++)
//        {
//            int n = random.nextInt(1,5);
//            System.out.println(n+", "+2*n);
//        }

//        3. Write a program that generates 5 random numbers within
//        this range (1,11) and prints them in new lines and the last line
//        is their sum
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 5 ; i++)
        {
          int n = random.nextInt(1,11);
            System.out.println(n);
            sum+=n;
        }
        System.out.println("Sum of random numbers is " + sum);

    }
}
