package Day19;

import java.util.Random;
import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] averValues = new int[scanner.nextInt()];
        int avg = 0 ;
        for (int i = 0; i<averValues.length;i++)
        {
            averValues[i] = random.nextInt(0,100);
            System.out.println(averValues[i]);
            if (averValues[i]!=1)
                avg+=averValues[i];

        }
        System.out.println(avg);
        System.out.println( (double) avg / (averValues.length ));

    }
}
