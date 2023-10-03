import java.util.Random;
import java.util.Scanner;

public class Day20Assignment1 {
    public static void main(String[] args) {
//        1: Easy
//Write a program which prints the text below using nested loops.
//
//Output:
//***
//****
//*****
//******
//*******

//        for (int i = 0; i<5; i++) {
//            for (int j=0;j<i+3;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        2: Easy
//        Write a program which prints the rectangle below using nested loops.
//                First you need to enter some int number using Scanner.
//
//        Input: 8
//        Output:
//        88888888
//        88888888
//        88888888
//        88888888
//        88888888
//        88888888
//        88888888
//        88888888

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i =0 ; i<n ; i++) {
//            for (int j = 0 ; j<n ;j++ ) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }

//        3:Medium
//        1. Write a program that asks a user to enter 2 int numbers
//        then declare this array int[] array = new int[10]
//        and fill it with random numbers between 20-100.
//        2. Then enter 2 int numbers using scanner
//        3. If arrays contains those 2 int number then print true otherwise false
//
//        If your array is gonna be {23,55,91,25,76,34,98,77,15,43}
//        Input: 25
//        Input: 43
//        print: true
//
//        Input: 39
//        Input: 23
//        print: false

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int[] array = new int[10];
//        boolean b1 = false, b2 = false;
//
//        for (int i=0; i< array.length; i++) {
//            array[i] = random.nextInt(20,100);
//            if (array[i]==n1) b1=true;
//            if (array[i]==n2) b2=true;
//        }
//        System.out.println(b1 && b2);

//        4: Medium
//        Create a program where it prompts the user to enter 7 numbers and stores them in the array
//        Imagine you want to track your weekly expenses.
//        Create a Java program that allows you to input your daily expenses for a week.
//        It should print the total weekly expense.
//                It should print the average spent every day.
//                Input:20
//        Input:
//        Input:
//        Input

        Scanner scanner = new Scanner(System.in);
        int[] expenses = new int[7];
        int avg = 0;

        for (int i=0; i< expenses.length; i++){
            expenses[i] = scanner.nextInt();
            avg+=expenses[i];
        }
        System.out.println("You spent daily: " + ((double)avg / 7));
    }
}
