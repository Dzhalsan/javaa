package D28.A2;

import java.util.ArrayList;
import java.util.Random;

public class PracticeArrayListHW5 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Random random = new Random();
        int givenSize = 10;

        for (int i = 0; i < givenSize; i++) {
            int randomNumber = random.nextInt(10,50);
            integerArrayList.add(randomNumber);
            System.out.println(randomNumber);
        }

        for (int i = integerArrayList.size() - 1; i >= 0; i--) {
            if (integerArrayList.get(i) < 20) {
                integerArrayList.set(i,0);
            }
        }

        System.out.println("------After modifying------");

        for (int element:integerArrayList) {
            System.out.println(element);
        }

    }
}
