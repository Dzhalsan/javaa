package Day22;

import java.util.Arrays;
import java.util.Random;

public class Classroom2 {
    public static void main(String[] args) {

        int[] array1 ={1,2,3,55,3,2,13,4};
        int[] array2 = new int[50];
        int[] array3 = new int[100];
        arraySum(array1);


    }

    public static void fillArrayRandom(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void arraySum (int[] array){
        int sum = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]==13) break;
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
