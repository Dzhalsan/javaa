package Day15;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int i = 0;
        while (i<word.length()) {
            System.out.println(word.charAt(i));
            System.out.println("It is digit = "+Character.isDigit(word.charAt(i)));
            System.out.println();
            i++;


        }
        }
    }
