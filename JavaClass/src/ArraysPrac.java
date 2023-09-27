import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrac {
    public static void main(String[] args) {



            int[] array1 = new int[10];
            Arrays.fill(array1,5);
            int[] array2 = new int[2];
            Arrays.fill(array2,7);
            array1 = Arrays.copyOf(array2, array1.length);
        System.out.println(Arrays.toString(array1));


    }
    }
