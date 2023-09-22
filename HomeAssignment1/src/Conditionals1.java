import java.util.Scanner;

public class Conditionals1 {
    public static void main(String[] args) {

//        Task: 1. Write a program that asks from user int number to enter, then check whether the number is positive, negative, or zero. The program should print out a message indicating the result:
//
//        Expected output: number is positive or number is negative or number is zero
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = scanner.nextInt();
//
//        if (n>0) System.out.println(n+" is positive");
//        else if (n<0) System.out.println(n+" is negative");
//        else System.out.println(n+" is zero");

//        Task: 2. Write a program that asks from user double temperature to enter and check if it is below freezing (32 degrees or lower), above boiling (212 degrees or higher), or in between.
//
//                Expected output:
//
//        77.3 degrees is between or
//
//        15 degrees is lower or
//
//        300 degrees is higher

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter temperature: ");
//        double t = scanner.nextDouble();
//
//        if (t<=32) System.out.println(t+" is freezing (32 degrees or lower)");
//        else if (t>=212)  System.out.println(t+" is boiling (212 degrees or higher)");
//        else System.out.println(t+" is in between");

//        Task: 3. Write a Java program that takes three numbers from the user and prints the greatest number.
//
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output :
//        The greatest: 87

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input the 1st number: ");
//        int n1 = scanner.nextInt();
//        System.out.print("Input the 2nd number: ");
//        int n2 = scanner.nextInt();
//        System.out.print("Input the 3rd number: ");
//        int n3 = scanner.nextInt();
//
//        if ( (n1>n2) && (n1>n3) ) System.out.println("The greatest: "+n1);
//        else if ( (n3>n2) && (n3>n1) ) System.out.println("The greatest: "+n3);
//        else if ((n2>n1) && (n2>n3))  System.out.println("The greatest: "+n2);


//
//        Task: 4. Write a program that takes from keybaord the months and tells which season it is (winter, spring, summer, or fall). Assume that winter starts in December, spring starts in March, summer starts in June, and fall starts in September.
//
//        Expected output:
//
//        summer season

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int m = scanner.nextInt();

        if (((m>=1) && (m<=2)) || (m==12)) System.out.println("Winter season");
        else if ((m>=3) && (m<=5)) System.out.println("Spring season");
        else if ((m>=6) && (m<=8)) System.out.println("Summer season");
        else System.out.println("Fall season");


    }
}
