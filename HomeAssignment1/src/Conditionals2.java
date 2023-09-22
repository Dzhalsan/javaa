import java.util.Scanner;

public class Conditionals2 {
    public static void main(String[] args) {


//
//        Task: 1 Write a Java program that asks a user which city he/she lives. If user answers Chicago tell him/her to join Codewise Java classes from campus, if he/she answers other city from Chicago tell him/her to join classes online.
//
//        Input: Chicago
//
//        Output: Join Codewise Java classes from campus.

//        Scanner scanner = new Scanner(System.in);
//        String c = scanner.nextLine();
//
//        if (c.equals("Chicago")) System.out.println("Join Codewise Java classes from campus.");
//        else System.out.println("Join Codewise Java classes online.");




//        Task: 2 Write a Java program that asks the user to enter a school grade and checks if it is A, B, C, D or F
//        using if-else statement.
//
//                Input: A
//
//        Output: Student was graded A. q
//
//        Input: B
//
//        Output: Student was graded B.

//        Scanner scanner = new Scanner(System.in);
//        String g = scanner.nextLine();
//
//        if (g.equals("A")) System.out.println("Student was graded "+g);
//        if (g.equals("B")) System.out.println("Student was graded "+g);
//        if (g.equals("C")) System.out.println("Student was graded "+g);
//        if (g.equals("D")) System.out.println("Student was graded "+g);
//        if (g.equals("F")) System.out.println("Student was graded "+g);


//
//        Task: 3 Write a Java program that asks the user to enter their age and checks if they are eligible to vote. Starting from 21 person is eligible to vote.
//
//                Input: 23
//
//        Output: You are eligible to vote!


//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        if (age>=21) System.out.println("You are eligible to vote!");
//        else System.out.println("You are not eligible to vote!");




//        Task: 5 Write a Java program that asks the user to enter two strings and checks if their values are equal.
//
//        Input: Hello
//
//        Input: hello
//
//        Output: Hello and hello are not the same.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter 1st string: ");
//        String s1 = scanner.nextLine();
//        System.out.print("Enter 2nd string: ");
//        String s2 = scanner.nextLine();
//        if (s1.equals(s2)) System.out.println(s1+" and "+s2+" are the same");
//        else System.out.println(s1+" and "+s2+" are not the same");



//        Task: 6 Write a Java program that takes a number from 1 to 7 from the user and prints the weekday name. 1-Monday  2- Tuesday  7 –Sunday. If any other number then 1-7 then print “no such day”
//
//        Input: 1
//
//        Output: Today is Monday
//
//        Input: 9
//
//        Output: No such day


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ((n==0) || (n>7)) System.out.println("No such day");
        if (n==1) System.out.println("Today is Monday");
        if (n==2) System.out.println("Today is Tuesday");
        if (n==3) System.out.println("Today is Wednesday");
        if (n==4) System.out.println("Today is Thursday");
        if (n==5) System.out.println("Today is Friday");
        if (n==6) System.out.println("Today is Saturday");
        if (n==7) System.out.println("Today is Sunday");





    }
}
