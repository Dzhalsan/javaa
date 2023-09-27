package Day18;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {
        String[] array1; // not initialized
        String[] array2 = new String[3]; // 2. initialized
        array2[0] = "Jack";
        array2[1] = "Mike";
        array2[2] = "Smith";

        String[] array3 = {"Jack", "Mike", "Smith"}; // 3. initialized and assigned values
        String[] array5 = {"Jack", "Mike", "Smith"}; // they always reserve new memory

        String[] array4 = new String[]{"Jack", "Mike", "Smith"};

        System.out.println("array2 = " +Arrays.toString(array2));
        System.out.println("array3 = " +Arrays.toString(array3));
        System.out.println("array4 = " +Arrays.toString(array4));
        System.out.println(array3 == array5);
        System.out.println(Arrays.equals(array3, array5));

        int[] nums = {6,8,2,9};


    }
}
