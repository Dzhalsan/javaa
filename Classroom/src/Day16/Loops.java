package Day16;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int counter =0;
        int lettercounter = 0;
        int specialsigns = 0;
        for (int i = 0; i< str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                counter++;
            else if (Character.isLetter(str.charAt(i)))
                lettercounter++;
                        else specialsigns++;
        }
        System.out.println("I found "+counter+" digits");
        System.out.println("I found "+lettercounter+" letters");
        System.out.println("I found "+specialsigns+" special signs");
    }
}
