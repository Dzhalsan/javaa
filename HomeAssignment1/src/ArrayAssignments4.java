import java.util.Arrays;

public class ArrayAssignments4 {
    public static void main(String[] args) {

//        Task 1: Easy
//                * Create 3 arrays of int with different sizes, names and values.
//        Print elements of all 3 int arrays.
//
//*Create 3 arrays of short with different sizes, names  and values.
//        Print elements of all 3 short arrays.
//
//* Create 3 arrays of double with different sizes, names  and values.
//        Print elements of all 3 double arrays.
//
//* Create 3 arrays of boolean with different sizes, names  and values.
//        Print elements of all 3 boolean arrays.
//
//* Create 3 arrays of String different sizes, names  and values.
//        Print elements of all 3 String arrays.

//        int[] intArray1 = {1,2,3};
//        int[] intArray2 = {0,4,10,5};
//        int[] intArray3 = {10,199,12310,54,3,3};
//
//        System.out.println(Arrays.toString(intArray1));
//        System.out.println(Arrays.toString(intArray2));
//        System.out.println(Arrays.toString(intArray3));
//
//        short[] shortArray1 = {0};
//        short[] shortArray2 = {-1,-5,1};
//        short[] shortArray3 = {2,150};
//
//        System.out.println(Arrays.toString(shortArray1));
//        System.out.println(Arrays.toString(shortArray2));
//        System.out.println(Arrays.toString(shortArray3));
//
//        double[] doubleArray1 = {1.5, 2.5};
//        double[] doubleArray2 = {1.2, -2.5, 0};
//        double[] doubleArray3 = {0};
//
//        System.out.println(Arrays.toString(doubleArray1));
//        System.out.println(Arrays.toString(doubleArray2));
//        System.out.println(Arrays.toString(doubleArray3));
//
//        boolean[] booleanArray1 = {true};
//        boolean[] booleanArray2 = {false,false,false};
//        boolean[] booleanArray3 = {false,false};
//
//        System.out.println(Arrays.toString(booleanArray1));
//        System.out.println(Arrays.toString(booleanArray2));
//        System.out.println(Arrays.toString(booleanArray3));
//
//        String[] stringArray1 = {"true", "no"};
//        String[] stringArray2 = {"false","12345","#$#@("};
//        String[] stringArray3 = {"null","zero"};
//
//        System.out.println(Arrays.toString(stringArray1));
//        System.out.println(Arrays.toString(stringArray2));
//        System.out.println(Arrays.toString(stringArray3));

//        Task 2: Easy
//
//        Given below array of ints, write a program to print array elements in reversed order.
//        int [] array = {1, 99, 0, -5, 12, 543, -123, 234, 98};
//        Expected output: 98, 234, -123, 543, 12, -5, 0, 99, 1

//        int [] array = {1, 99, 0, -5, 12, 543, -123, 234, 98};
//
//        for (int i = array.length-1; i>=0; i--) {
//            if (i==0) {
//                System.out.println(array[i]);
//                break;
//            }
//            System.out.print(array[i]+", ");
//        }

//        Task 3:  Difficult
//
//        Given below array of ints, write a program to sum values of array and print this sum. Hint: use loop or manually one by one
//        int [] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Expected output:The sum of given ints is: 55

//        int [] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//
//        for (int i = 0; i<my_array.length; i++)
//        {
//            sum+=my_array[i];
//
//        }
//        System.out.println("The sum of given ints is: " + sum);

//        Task 4:  Difficult
//
//        Given below array of ints, write a program to find average value of array elements. Hint: use loop or manually one by one
//        int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
//        Expected output:The average value of given ints is: 18

        int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        int avg = 0 ;
        for (int i = 0; i<averValues.length;i++)
        {
            avg+=averValues[i];
        }
        System.out.println( (double) avg / (averValues.length ));


    }
}
