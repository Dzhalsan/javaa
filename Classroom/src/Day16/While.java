package Day16;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = 0;

        while (i<str.length())
        {
            System.out.println(str.charAt(i));
            i++;
        }
    }
}
