package D30;

import java.lang.reflect.Array;
import java.util.*;

public class PracticeSetHW3 {
//    //        Task 2:  Create PracticeSetHW3 class, and:
////•Create an array with the length 100. Fill the array with random ints between 1-10 and print array.
////•Take all numbers divisible by 3 from array and add them to new arrayList and print arrayList.
////•Create new TreeSet and add all elements of arrayList to the set.
////•Calculate and print number of all unsuccessful tries in task 3.

    public static void main(String[] args) {

        int[] array100 = new int[100];
        Random random = new Random();

        for (int i = 0; i < array100.length; i++) {
            array100[i] = random.nextInt(1,11);
        }

        System.out.println(Arrays.toString(array100));

        ArrayList<Integer> arrayListDiv3 = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < array100.length; i++) {
            if (array100[i] % 3 == 0) {
                arrayListDiv3.add(array100[i]);
            }
            else counter++;
        }

        System.out.println(arrayListDiv3);

        HashSet<Integer> hashSet = new HashSet<>(List.copyOf(arrayListDiv3));

        System.out.println("Number of unsuccessful tries: " + counter);

    }
}
