import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeArrayCreation {
    public static void main(String[] args) {

//        1. Create 3 String arrays using first way, and print them using Arrays.toString methods

//        int[] array1 = new int[]{1,2,3,5};
//        String[] array2 = new String[]{"hey", "hello","hi"};
//        char[] array3 = new char[]{'a','b','c'};
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        2. Create 3 String arrays using second way, and print them using Arrays.toString methods

//        int[] array1 = {1,2,3,5};
//        String[] array2 = {"hey", "hello","hi"};
//        char[] array3 = {'a','b','c'};
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        3. Create 3 String arrays using third way, and print them using Arrays.toString methods

//        int array1[] = {1,2,3,5};
//        String array2[] = {"hey", "hello","hi"};
//        char array3[] = {'a','b','c'};
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        4. Create 3 int arrays using first way, and print them using Arrays.toString methods

//        int[] array1 = new int[]{1,2,3,5};
//        int[] array2 = new int[]{2,2,3};
//        int[] array3 = new int[]{1,2};
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        5. Create 3 int arrays using second way, and print them using Arrays.toString methods

//        int[] array1 ={1,2,3,5};
//        int[] array2 = {2,2,3};
//        int[] array3 = {1,2};
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        6. Create 3 int arrays using third way, and print them using Arrays.toString methods

//        int array1[] ={1,2,3,5};
//        int array2[] = {2,2,3};
//        int array3[] = {1,2};
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        7. Create 3 double arrays using first way, and print them using Arrays.toString methods

//        double[] array1 = new double[]{1,2,3,5};
//        double[] array2 = new double[]{2,2,3};
//        double[] array3 = new double[]{1,2};
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        8.

//        double[] array1 = {1,2,3,5};
//        double[] array2 = {2,2,3};
//        double[] array3 = {1,2};
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        9.

//        double array1[] = {1,2,3,5};
//        double array2[] = {2,2,3};
//        double array3[] = {1,2};
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        10.

//        boolean[] array1 = new boolean[]{true, false, true};
//        boolean[] array2 = new boolean[]{false, false, false};
//        boolean[] array3 = new boolean[]{true, true, true};
//
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//         11.

//        boolean[] array1 = {true, false, true};
//        boolean[] array2 = {false, false, false};
//        boolean[] array3 = {true, true, true};
//
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));


//        12.

//        boolean array1[] = {true, false, true};
//        boolean array2[] = {false, false, false};
//        boolean array3[] = {true, true, true};
//
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        13.

//        String[] strarraynull = new String[3];
//        String[] strarray = new String[3];
//        strarray[0] = "Wish";
//        strarray[1] = "you";
//        strarray[2] = "luck!";
//
//        System.out.println(Arrays.toString(strarraynull));
//        System.out.println(strarraynull.length);
//        System.out.println(Arrays.toString(strarray));
//        System.out.println(strarray.length);

//        14.

//        String strarray1[] = new String[2];
//        String strarray2[] = new String[2];
//        System.out.println(Arrays.toString(strarray1));
//        System.out.println(strarray1.length);
//        System.out.println(Arrays.toString(strarray2));
//        System.out.println(strarray2.length);

//        15.

//        int[] intarray1 = new int[4];
//        intarray1[0] = 12;
//        intarray1[1] = 1;
//        intarray1[2] = 2;
//        intarray1[3] = 12345;
//        int[] intarray2 = new int[4];
//        Arrays.fill(intarray2,Math.max(5214,2*2345));
//
//        System.out.println(Arrays.toString(intarray1));
//        System.out.println(intarray1.length);
//        System.out.println(Arrays.toString(intarray2));
//        System.out.print(intarray2.length);

//        16.

        Random random = new Random();
        int intarray1[] = new int[3];
        int intarray2[] = new int[3];

        Arrays.fill(intarray1,random.nextInt());
        Arrays.fill(intarray2,random.nextInt());

        System.out.println(Arrays.toString(intarray1));
        System.out.println(intarray1.length);
        System.out.println(Arrays.toString(intarray2));
        System.out.println(intarray2.length);


    }
}
