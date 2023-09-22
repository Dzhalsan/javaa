package Day14;

import java.util.Scanner;

public class ForRecap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        for (int i=1;i<=10;i++) {

            num = scanner.nextInt();
            sum= sum +num;

        }

        System.out.println("Sum is "+sum);

    }
}
