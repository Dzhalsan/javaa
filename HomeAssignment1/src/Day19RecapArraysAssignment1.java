import java.awt.event.WindowFocusListener;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day19RecapArraysAssignment1 {
    public static void main(String[] args) {
//        1: Easy
//
//Write a program which declares String[] string = new String[10];
//Then fill your array using for loop with "HI" and print your array's values;
//Output: ["HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI"]

//        String[] strings = new String[10];
//
//        for (int i=0; i < strings.length; i++) {
//            strings[i] = "HI";
//        }
//        System.out.println(Arrays.toString(strings));

//        2.Write a program which creates an int[] array = new int[10];
//and then enter numbers using scanner and for loop.
//Print how many times 5 is occurred in an array;

//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[10];
//        int counter = 0;
//
//        for (int i=0; i<array.length; i++) {
//            array[i] = scanner.nextInt();
//            if (array[i]==5)  counter++;
//        }
//        System.out.println("5 occured " + counter + " times");

//        3:  Medium
//
//Given below array of ints, write a program to find and prints the largest value of array elements.
//int [] values = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
//Expected output: The largest value of given ints is: 90

//        int[] values  = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
//        int max = values[0];
//
//        for (int i=0; i<values.length; i++) {
//            if (max<values[i]) max = values[i];
//        }
//        System.out.println("The largest value of given ints is: " + max);

//        4:  Medium
//
//        Given below array of ints, write a program to find and prints the smallest value of array elements.
//        int [] values = {3, 6,-3, 8, 10, 90, 0,-1, 25, 2, 32,-22, 11};
//        Expected output: The smallest value of given ints is: -22

//        int [] values = {3, 6,-3, 8, 10, 90, 0,-1, 25, 2, 32,-22, 11};
//        int min = values[0];
//        for (int i=0; i<values.length; i++) {
//            if (min>values[i]) min = values[i];
//        }
//        System.out.println("The smallest value of given ints is: " + min);


//        5:  Difficult
//
//        Given below array of ints, write a program that creates new array with elements of given array in reversed order and prints it.
//                Note: in this task you are not allowed to use Arrays.sort and Collections.reverseOrder methods
//
//
//        int [] values = {1,2,3,4,5};
//        Expected output: 5 4 3 2 1

//        int [] values = {1,2,3,4,5};
//        int [] rvalues = new int[5];
//        int j=1;
//
//        for (int i = 0; i<rvalues.length; i++){
//            rvalues[i] = values[rvalues.length-j];
//            j++;
//        }
//        System.out.println(Arrays.toString(rvalues));

//        6: Difficult
//Write a program which declares int[] array = new int[20]
//and fills it with random numbers from (0 to 100)
//print in the first line numbers less than 50
//print in the second line numbers greater than 50 or equal to

        int[] array = new int[20];
        int[] lessarray = new int[20];
        int[] morearray = new int[20];
        Random random = new Random();
        int j=0,k=0;

        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i]<50) {
                lessarray[j]=array[i];
                j++;
            }
            else {
                morearray[k]=array[i];
                k++;
            }
        }
        array = Arrays.copyOf(lessarray,j);
        lessarray = Arrays.copyOf(morearray,k);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(lessarray));



    }
}
