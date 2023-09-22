import java.util.Scanner;

public class Conditionals4 {
    public static void main(String[] args) {


//        1) Write a program that accepts two numbers from the user, the first
//        of which is the number of students in the class, and the second is the number of
//        chairs in the classroom. The program must check whether all students will have a place to sit.
//
//        Input: 20
//
//        Input: 25
//
//        Output: There are 5 extra seats
//        Input: 25
//
//        Input: 1
//
//        Output: There are 24 students left without chairs
//

//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if (s>c) System.out.println("There are "+(s-c)+" students left without chairs");
//        else if (s<c) System.out.println("There are "+(c-s)+" extra seats");
//        else System.out.println("All students have a place to sit");




//        2) A student will not be allowed to sit in exam if his/her attendance
//        is less than 75%.Take following input from user
//        Number of classes held Number of classes attended.
//        And print percentage of class attended. Is student is allowed to sit in exam or not?
//        Example input:
//        int classes = 20;
//        int attended = 12;
//        Expected output: Percentage of attended classes is 60, Student is not allowed to exam.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter amount of classes held: ");
//        int cl = scanner.nextInt();
//        System.out.print("Enter amount of classes attended: ");
//        int at = scanner.nextInt();
//
//        if ((100*at/cl)>=75) System.out.println("Percentage of attended classes is "+(100*at/cl)+", Student is allowed to exam");
//        else System.out.println("Percentage of attended classes is "+(100*at/cl)+", Student is not allowed to exam");


//        3) A shop will give discount of 10% if the cost of purchased quantity
//        is more than 1000$. Ask user for quantity. Suppose, one unit will cost 100$.
//                Judge and print total cost for user, if no discount just print no discount.
//        Example input: int num = 20;
//        Expected output: Total cost 2000, discount 200 cost after discount 1800

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter purchased quantity: ");
//        int p = scanner.nextInt();
//
//        if (p>10) System.out.println("Total cost "+100*p+", discount "+10*p+", cost after discount "+90*p);
//        else System.out.println("Total cost "+100*p+", no discount" );


//        4) Write a program that accepts 3 different numbers from the keyboard.
//                The class should display these numbers in ascending order -
//                in one line, and in the other in descending order.
//
//        Input: 23
//
//        Input: -5
//
//        Input: 99
//
//        Expected output:
//
//        -5, 23, 99
//
//        99, 23, -5

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int max = 0;
        int min = 0;


        if ((n1>n2) && (n1>n3)) {
            max = n1;
            if (n2>n3) {
                min = n3;
                n1=n2;
            }
            else  {
                min = n2;
                n1 = n3;
            }

        }
        else if ((n2>n1) && (n2>n3)) {
            max = n2;
            if (n1>n3) {
                min = n3;

            }
            else  {
                min = n1;
                n1 = n3;
            }
        }
        else if ((n3>n1) && (n3>n2)) {
            max = n3;
            if (n1>n2) {
                min = n2;
            }
            else  {
                min = n1;
                n1 = n2 ;
            }

        }

        System.out.println(min+", "+n1+", "+max);
        System.out.println(max+", "+n1+", "+min);


    }
}
