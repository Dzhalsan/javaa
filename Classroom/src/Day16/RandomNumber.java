package Day16;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));

        for (int i=0; i < 100 ; i++) {
            int n = random.nextInt();
            System.out.println(n);
        }

    }
}
