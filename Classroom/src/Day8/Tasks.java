package Day8;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        int length = word.length();
//        System.out.println("The length of string is "+length);

//        String message = "This is just example";
//        System.out.println(message.toUpperCase().charAt(message.length()-1));

//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
////        System.out.println(word.substring(1).substring(0,word.length()-2));
//        System.out.println(word.substring(1,(word.length()-1)));

//        Scanner scanner = new Scanner(System.in);
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        System.out.println(word1.substring(0,3)+word2.substring(word2.length()-3)+word2.substring(word2.length()-3)+word1.substring(0,3));


//        Scanner scanner = new Scanner(System.in);
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        System.out.println(word1.substring(0,word1.length()/2+word1.length()&2)+word2.substring(word2.length()/2));

//        Scanner scanner = new Scanner(System.in);
//        String word1 = scanner.nextLine();
//        System.out.println(word1.endsWith("ly"));


//        Scanner scanner = new Scanner(System.in);
//        String word1 = scanner.nextLine();
//        System.out.println(word1.substring(0,2)+word1.substring(3));

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        word1 = word1.toUpperCase();
        System.out.println(word1);
        System.out.println(word1.substring(0,start)+word1.substring(start,end).toLowerCase()+word1.substring(end));





///

    }
}
