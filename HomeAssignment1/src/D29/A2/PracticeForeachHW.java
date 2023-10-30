package D29.A2;

import java.util.ArrayList;
import java.util.List;

public class PracticeForeachHW {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(4,6,2,7,99,4,322,4,66,7,9,99,5,3,33,8,9));
        ArrayList<Integer> copy = new ArrayList<>(arrayList.size());

        printArrayList(arrayList);

        printSum(arrayList);

        printEven(arrayList);

        largestEl(arrayList);

        smallestEl(arrayList);

        numberOfOccurrences(arrayList, 99);

        printContains(arrayList, 322);

        copyForEach(arrayList, copy);

        printArrayList(copy);

        printReversed(copy);


    }

    public static void printArrayList(ArrayList<Integer> arrayList) {

        System.out.println("----------------Printing all elements of arrayList----------------");
        for (Integer element: arrayList) {
            System.out.println(element);
        }

    }

    public static void printSum(ArrayList<Integer> arrayList) {

        System.out.println("----------------Printing sum of arrayList----------------");

        int sum = 0;

        for (Integer element: arrayList) {
            sum+= element;
        }

        System.out.println("Sum of arrayList is: " + sum);

    }

    public static void printEven(ArrayList<Integer> arrayList) {

        System.out.println("----------------Printing even numbers of arrayList----------------");

        for (Integer element: arrayList) {
            if (element % 2 == 0)
                System.out.println(element);
        }

    }

    public static void largestEl(ArrayList<Integer> arrayList) {

        System.out.println("----------------Printing largest element of arrayList----------------");

        int max = arrayList.get(0);

        for (Integer element: arrayList) {
            if (element>max)
                max = element;
        }

        System.out.println("The largest element of array list is: " + max);

    }

    public static void smallestEl(ArrayList<Integer> arrayList) {

        System.out.println("----------------Printing smallest element of arrayList----------------");

        int min = arrayList.get(0);

        for (Integer element: arrayList) {
            if (element<min)
                min = element;
        }

        System.out.println("The smallest element of array list is: " + min);
    }

    public static void numberOfOccurrences(ArrayList<Integer> arrayList, Integer element) {

        System.out.println("----------------Printing numbers of occurrences----------------");

        if (!arrayList.contains(element)) {
            System.out.println("Element not found");
            return;
        }
        else {

            int counter = 0;

            for (Integer i: arrayList) {

                if (i == element)
                    counter++;

            }

            System.out.println("Number of occurrences is: " + counter);

        }

    }

    public static void printContains(ArrayList<Integer> arrayList, Integer element) {

        System.out.println("----------------Printing if elements exist in arraylist----------------");

        boolean found = false;

        for (Integer i: arrayList) {
            if (i == element) {
                found = (i == element) ;
                System.out.println(element + " found in arraylist : " + found);
                return;
            }
        }

        System.out.println(element + " found in arraylist : " + found);

    }

    public static void copyForEach(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {

        for (Integer element: arrayList) {
            arrayList2.add(element);
        }

    }

    public static void printReversed(ArrayList<Integer> arrayList) {

        System.out.println("----------------Printing reversed arraylist----------------");

        for (int i = arrayList.size()-1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }

    }
}
