import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {

//        1: Create a program, that asks user to enter a number, until user enters 999.
//        Program should count number of entered numbers, 999 not included.

//       Scanner scanner = new Scanner(System.in);
//        int counter = 0, number;
//
//        do
//        {
//            counter++;
//            number = scanner.nextInt();
//            if (number!=999) System.out.println("Try again!");
//        }
//        while (number!=999);
//        System.out.println("You entered " + counter + " numbers");

//        2: Create a program that takes 5 digit String number and using while loop it
//        reverses the number and prints it

//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String strreversed = "";
//        int i = str.length() ;
//        do
//        {
//         i--;
//         strreversed+=str.charAt(i);
//        }
//        while (i>0);
//        System.out.println(strreversed);

//        3: Create a program, that takes birth month for 5 students.
//                And calculates numbers of students who was born in Winter, Spring, Summer and Autumn.

//        Scanner scanner = new Scanner(System.in);
//        int winterCounter=0, springCounter=0, summerCounter=0, autumnCounter=0;
//        do
//        {
//         String month = scanner.nextLine();
//         if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February"))
//             winterCounter++;
//         else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May"))
//             springCounter++;
//         else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August"))
//             summerCounter++;
//         else autumnCounter++;
//        }
//        while ((winterCounter+springCounter+summerCounter+autumnCounter)!=5);
//        System.out.println(winterCounter + " in Winter " + springCounter + " in Spring " + summerCounter + " in Summer and " + autumnCounter + " in Autumn");

//        4: Create a program that takes from user a number, until entered number
//        is divisible by 5 and 9. Once desired number is entered, print the number
//        of attempts.

        Scanner scanner = new Scanner(System.in);
        int counter = 0, n;
        do
        {
            counter++;
            n = scanner.nextInt();
            if (n%5!=0 & n%9!=0) System.out.println("Try again!");
        }
        while (n%5!=0 & n%9!=0);
        System.out.println(counter + " attempts");


    }
}
