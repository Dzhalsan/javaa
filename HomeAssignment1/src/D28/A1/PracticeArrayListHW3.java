package D28.A1;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayListHW3 {
    public static void main(String[] args) {

        ArrayList<Integer> years = new ArrayList<>(List.of(1,2,3,4,5));

        years.remove(0);
        years.remove(years.size()-1);

        years.add(88);
        years.add(77);
        years.add(66);
        years.add(55);
        years.add(7);

        System.out.println("The number of years is: " + years.size());

        for (int i = 0; i < years.size(); i++) {
            int element = years.get(i);
            System.out.println(element);
        }

        for (int i = years.size() - 1; i >= 0; i--) {
            int element = years.get(i);
            int counter = 0;

            if (years.get(i)>1) {
                while (element>0) {
                    if (years.get(i) % element == 0) counter++;
                    element--;
                }
            } else if (element == 1) {
                years.remove(i);
            }
            if (counter == 2) years.remove(i);
        }

        System.out.println("The number of years is: " + years.size());

        int index = 0;
        do {
            System.out.println(years.get(index));
            index++;

        } while (index<years.size());





    }
}
