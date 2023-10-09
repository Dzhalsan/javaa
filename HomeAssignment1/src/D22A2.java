import java.util.Arrays;
import java.util.Scanner;

public class D22A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       int price = scanner.nextInt(); //task1
//        int discount = scanner.nextInt();
//        System.out.println(calculateDiscount(price, discount));
//        int[] array2 = {5,2,3,9,6,8,6}; //task2
//        sortArray(array2);
//       int[] array3 = {10,15,20,25,30}; //task3
//        findMaxMin(array3);
//        String str = scanner.nextLine(); // task4
//        char chr = scanner.nextLine().charAt(0);
//        countOccurrences(str,chr);
        int[] task5 = {1,5,1,2,3,8,2};
//       removeDuplicatesTest1(task5);
//        removeDuplicatesTest2(task5);
        removeDuplicatesString(task5);
    }

    public static int calculateDiscount (int origPrice, int discPrice){
        return (int)(((double) -discPrice/100+1)*origPrice);
    }

    public static void sortArray (int[] task2){
        Arrays.sort(task2);
        System.out.println(Arrays.toString(task2));
    }

    public static void findMaxMin (int[] task3){
        int max = task3[0];
        int min = task3[0];
        for (int i=0; i<task3.length; i++ ) {
            if (task3[i]>max) max=task3[i];
            if (task3[i]<min) min=task3[i];
        }
        task3 = new int[]{min, max};
        System.out.println(Arrays.toString(task3));
    }

    public static void countOccurrences(String task4, char t4){
        int counter=0;
        for (int i =0; i<task4.length();i++) {
            if ((task4.charAt(i)+"").equalsIgnoreCase(t4+"")) counter++;
        }
        System.out.println(counter);
    }

    public static int[] removeDuplicatesString (int[] task5){
        String arrToStr = Arrays.toString(task5);
        arrToStr = arrToStr.replace("[","").replace(",","").replace("]","");
        System.out.println(arrToStr);
        String arrtoStrRem ="";
        for (int i=0;i<arrToStr.length();i++) {
            for (int j=i+1;j<arrToStr.length()-1;j++) {
                if ((arrToStr.charAt(i)+"").equals("") || (arrToStr.charAt(j)+"").equals("")) continue; // stuck with saving in a new String without Duplicates, smth wrong with iterators
                if (!(arrToStr.charAt(i)+"").equals((arrToStr.charAt(j)+""))) {
                    arrtoStrRem =arrtoStrRem+(arrToStr.charAt(i));
                    break;
                }

            }
        }
        System.out.println(arrtoStrRem);

        String[] numberStr = arrToStr.split("\\s+");

        System.out.println(Arrays.toString(numberStr));
        return task5;

    }
    public static int[] removeDuplicatesTest1 (int[] task5){ //creates a new arr with 1's where duplicate met, need to count new size of array and fill excluding duplicates
        int[] sortedArr = task5.clone();
        int[] dElements = new int[task5.length];
        Arrays.sort(sortedArr);
        int duplicate = sortedArr[0];
        int counter = 0;
        for (int i = 1; i<sortedArr.length; i++){
            if (sortedArr[i] == duplicate) {
                dElements[i] = 1;
                duplicate = sortedArr[i];
                counter++;
            }
            else duplicate = sortedArr[i];
        }
        int [] testFill = new int[task5.length-counter];
        int k = 0;
        for (int i=0; i<sortedArr.length;i++){ // messed up iteration through elements of arr FIX!
            if (dElements[i]==0) {
                testFill[k]=sortedArr[i];
                k++;
            }
//                else {testFill[i]=sortedArr[i+1];
//                i++;
//                }
        }

        System.out.println(Arrays.toString(testFill));
        System.out.println(Arrays.toString(sortedArr));
        System.out.println(Arrays.toString(dElements));
        return sortedArr;

    }

    public static int[] removeDuplicatesTest2 (int[] task5){
        int[][] duplicateEl = new int[2][task5.length];
        for (int i = 0; i<2; i++) {
            for (int j = 0; j<task5.length; j++){
                duplicateEl[i][j]= task5[j];
            }
        }
        for (int i = 0; i<2; i++) {
            for (int j = 0; j<task5.length; j++){
                System.out.print(duplicateEl[i][j]+" ");
            }
            System.out.println();
        }
        int[] copyA = new int[task5.length-2];
        int[] copyB = new int[task5.length-2];
        int[] copyR = new int[task5.length-2];
        for (int i = 0; i<1; i++) {
            for (int j = 1; j< task5.length-1; j++){
            if (duplicateEl[i][j] == duplicateEl[i][j])
                copyA = Arrays.copyOf(duplicateEl[0], j);
            }
        }
        System.out.println(Arrays.toString(copyA));

        return task5;
    }
}
