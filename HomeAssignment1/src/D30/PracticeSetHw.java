package D30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class PracticeSetHw {
//    Problem set:
//    Task 1:  Create PracticeSetHW java class and do the following tasks:   
//            •Create a TreeSet of String “colors” and add six colors.
//            •Iterate over the set and print each element.
//            •Print the number of elements in set.
//•Remove all elements from the set.
//            •Print if the set is full or empty.
//            •Add 3 elements to set.
//•Convert the set to array and print it.

    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<>();

        colors.add("Grey");
        colors.add("White");
        colors.add("Beige");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Green");


        for (String element:
             colors) {

            System.out.println(element);

        }

        System.out.println("Printing number of elements: " + colors.size());

        System.out.println("The is empty: " + colors.removeAll(colors));

        colors.add("1");
        colors.add("2");
        colors.add("3");

        System.out.println(Arrays.toString(colors.toArray()));

    }
}
