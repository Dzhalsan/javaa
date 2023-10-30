package D28.A1;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayListHW2 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>(List.of("Car1","Car2","Car3","Car4","Car5"));

        cars.remove(0);
        cars.remove(2);

        cars.add("caradded");
        cars.add("caradded2");
        cars.add("caradded3");

        System.out.println("The number of cars is: " + cars.size());

        int i = 0;
        while (i < cars.size()) {
            System.out.println(cars.get(i));
            i++;
        }

        for (int j = cars.size()-1; j >= 0 ; j--) {
            int lengthEl = cars.get(j).length();
            if (lengthEl<7) cars.remove(cars.remove(j));
        }



        System.out.println("The number of cars is: " + cars.size());

        for (String element: cars) {
            System.out.println(element);
        }
        


    }
}
