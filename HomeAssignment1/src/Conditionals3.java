import java.util.Scanner;

public class Conditionals3 {
    public static void main(String[] args) {


//        1: Write a program that takes two integers as input and checks if their sum is even or odd. Print "Even" if the sum is even, and "Odd" if the sum is odd.
//
//        Input: 5
//
//        Input: 4
//
//        Expected output: Odd

//        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int sum = n1+n2;
//
//        if (sum%2==0) System.out.println("Even");
//        else System.out.println("Odd");


//        2: Write a program that takes three integers as input and checks if any two of them are equal. Print "Two of the numbers are equal" if any two of the numbers are equal, and "None of the numbers are equal" if none of the numbers are equal.
//
//        Example input:
//
//        int num1 = 5;
//
//        int num2 = 7;
//
//        int num3 = 5;
//
//        Expected output: Two of the numbers are equal

//        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int n3 = scanner.nextInt();
//
//        if ((n1==n2) || (n2==n3) || (n1==n3)) System.out.println("Two of the numbers are equal");
//        else System.out.println("None of the numbers are equal");


//        3: Write a program that prompts the user to enter a string. Check if the string starts with the letter 'A' (ignoring case). If it does, print "The string starts with 'A'. " Otherwise, print "The string does not start with 'A'."
//
//        Input: AAA is an example sentence
//
//        Expected output: The string starts with 'A'

//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//
//        if (str.startsWith("A") || str.startsWith("a")) System.out.println("The string starts with 'A'");
//        else System.out.println("The string does not start with 'A'");



//        4: Write a program that takes an integer as input and checks if it is a
//
//        'multiple of 3 and 5' or 'multiple of 3 or 5'  or ' is not their multiple'
//
//        Input: 9;
//
//        Expected output: Multiple of 3 or 5
//
//        Input: 45
//
//        Expected output: Multiple of 3 and 5
//
//        Input: 23
//
//        Example output: Is not their multiple

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        if (n%15==0) System.out.println("Multiple of 3 and 5");
//        else if (n%3==0 || n%5==0) System.out.println("Multiple of 3 or 5");
//        else System.out.println("Is not their multiple");

//        5: Write a program that asks the user to enter a string. Check if the string is a valid email address by verifying if it contains the '@' symbol, ends with a valid domain extension (".com", ".org", ".net") and with minimum length of 10. Print "Valid email address" or "Invalid email address" accordingly.
//
//                * musth have @
//
//* must have domain like: .com, .org or .net
//
//                * must have length of at least 10
//
//        Input: zhanarbek@gmail.com
//
//        Output: Valid email address

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        if ((email.contains("@") && email.length()>=10) && ((email.endsWith("com")) || (email.endsWith("org")) || (email.endsWith(".net"))))
            System.out.println("Valid email address");
        else System.out.println("Not valid email address");

    }
}
