import java.util.Scanner;

public class HomeworkForLoop2 {
    public static void main(String[] args) {

//        1. Create a program that asks user to enter any word and print the word in reversed order.

//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//
//        for (int i= word.length()-1; i>= 0; i--)
//            System.out.print(word.charAt(i));

//        2. Create a loop that prints all March days from 1 to 31

//        for (int i = 1; i<=31; i++ )
//            System.out.println(i+" March 2023");

//        3. Create a program that asks user to enter start and end int values.
//        You will need to print numbers divisible by 3 or 5 within this range.

//        Scanner scanner = new Scanner(System.in);
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//
//        for ( int i = start; i<= end; i++)
//            if ( (i%3==0) || (i%5==0)) System.out.println(i);

//        4. Write a Java program to calculate the sum of the even numbers between 1 to 100 inclusive using a for loop.
//
//                Example(Not output): 2 + 4 + 6 + 8 + ... + 100

//        int sum = 0;
//        for (int i = 1; i<=100; i++)
//            if (i%2==0)
//                sum+=i;
//        System.out.println(sum);

//        5. Write a program that takes a number as input using scanner
//        class and calculates the factorial of a number.
//        For example, input is 5, then factorial is 5 * 4 * 3 * 2 * 1 = 120

        Scanner scanner =new Scanner(System.in);
        int n1 = scanner.nextInt();
        for (int i = n1-1; i>=1; i-- )
            n1 = n1*i;
        System.out.println(n1);





    }
}
