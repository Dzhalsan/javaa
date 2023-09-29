import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrayCreation2 {
    public static void main(String[] args) {
//        Task 1: Declare and Initialize an Array of Integers
//
//        Declare an array to hold 5 integers.
//                Initialize it with the values 5, 10, 15, 20, 25.
//        Print all elements of the array to the console.

//        int[] intArray = new int[5];
//
//        for (int i = 5; i <= 25 ; i+=5)
//        {
//            int increment = 0;
//            intArray[increment] = i;
//            System.out.println(intArray[increment]);
//            increment++;
//        }

//        Task 3: Declare an Array with User Input
//
//        Ask the user to enter the size of an array.
//        Declare an array of that size.
//        Print the array to the console.
//        Print the size of array to the console.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter desired size of array: ");
//        int[] intArrayUser = new int[scanner.nextInt()];
//        System.out.println(Arrays.toString(intArrayUser));
//        System.out.println(intArrayUser.length);

//        Task 4: Sort an Array
//
//        Declare and initialize an int array with values {1000, 1, 934, 23, -5, 500}
//        Use the Arrays.sort() method to sort the array.
//                Print the sorted array to the console.

//        int[] intArray = {1000, 1, 934, 23, -5, 500};
//        Arrays.sort(intArray);
//        System.out.println(Arrays.toString(intArray));

//        Task 5: Check if Two Arrays are Equal
//
//        Declare and initialize two arrays of doubles with the same values but in a different order.
//        Sort both arrays using Arrays.sort().
//                Use the Arrays.equals() method to check if the two arrays are equal after sorting.
//                Print the result of the comparison.

//        double[] doubleArray = {1,2,3,4,5};
//        double[] doubleArrayUnsorted = {5,4,2,3,1};
//        Arrays.sort(doubleArray);
//        Arrays.sort(doubleArrayUnsorted);
//        System.out.println(Arrays.equals(doubleArray, doubleArrayUnsorted));

//        Task 6: Clone an Array
//
//        Declare and initialize an int[] array1 with values {1,2,3,4,5}
//        Declare and initialize an int[] array2
//        Use the Arrays.clone() method to clone the array1 into array2.
//                Print both the original and the cloned arrays to verify the copy.

//        int[] array1 = {1,2,3,4,5};
//        int[] array2 = {0,2,3};
//        array2 = array1.clone();
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

//        Task 7: Sort and Compare String Arrays
//
//        Declare and initialize two arrays of strings with the same words but in a different order.
//        Sort both arrays using Arrays.sort().
//                Use Arrays.equals() to compare the sorted arrays.
//                Print the result of the comparison.

        String[] strArray1 = {"hello", "hi", "hey", "$#@!"};
        String[] strArray2 = {"hi", "hello", "$#@!", "hey"};

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        System.out.println(Arrays.equals(strArray1, strArray2));


    }
}
