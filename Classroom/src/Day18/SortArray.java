package Day18;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

//        int[] my_array1= {1789,2035,1899,1456,2013};
//        String[] my_array2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

//        Arrays.sort(my_array1);
//        Arrays.sort(my_array2);
//        System.out.println(Arrays.toString(my_array1));
//        System.out.println(Arrays.toString(my_array2));


//        for (int i = 0 ; i < my_array1.length; i++) {
//            if (i==my_array1.length-1) {
//                System.out.println(my_array1[i]);
//                break;
//            }
//            System.out.print(my_array1[i]+"! ");
//
//        }

//        int[] ints = {1,5,3,44,5,65,7,83,-4};
//        Arrays.sort(ints);
//        for (int i = ints.length-1; i>=0; i--) {
//            System.out.println(ints[i]);
//
//        }

//        int[] array5 = {1,2,3,4,5,6,54,90};
//
//        if (Arrays.toString(array5).contains("54") || Arrays.toString(array5).contains("90")) System.out.println("true");
//        else System.out.println("false");

        int[] array7 = new int[10];
        System.out.println(Arrays.toString(array7));
        Arrays.fill(array7,1);
        System.out.println(Arrays.toString(array7));
        int[] array8 = Arrays.copyOf(array7,array7.length);
        System.out.println(Arrays.toString(array8));


    }
}
