package D28.A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PracticeArrayListHW4 {
    public static void main(String[] args) {

        ArrayList<Integer> subTask1 = new ArrayList<>();
        Random random = new Random();
        int size = 10;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(10,50);
            subTask1.add(randomNumber);
            sum += randomNumber;
        }

        System.out.println("Sum of all numbers is: " + sum);

        ArrayList<Double> subTask2 = new ArrayList<>();
        size = 8;
        double avg = 0;

        for (int i = 0; i < size; i++) {
            double randNumber = random.nextDouble(100);
            subTask2.add(randNumber);
            avg += randNumber;
        }

        avg = avg/size;

        System.out.println("Average of the double numbers is: " + avg);

        ArrayList<String> subTask3 = new ArrayList<>(List.of("Singapore", "Qatar", "Switzerland", "Japan", "Luxembourg", "Netherlands", "Sweden"));

        Collections.sort(subTask3);

        for (String country: subTask3) {
            System.out.println(country);
        }

        ArrayList<Integer> subTak4 = new ArrayList<>();

        for (int i = subTask1.size() - 1; i >= 0; i--) {
            subTak4.add(subTask1.get(i));
        }

        for (int i = subTak4.size() - 1; i >= 0; i--) {
            if (subTak4.get(i) % 2 == 0) {
                subTak4.remove(i);
            }
        }

        if (subTak4.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            for (int element : subTak4) {
                System.out.println(element);
            }
        }

    }
}
