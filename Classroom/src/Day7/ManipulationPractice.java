package Day7;

import java.util.Scanner;

public class ManipulationPractice {
    public static void main(String[] args) {

//        String message = "Hello everyone, let's do Java String exercises";
//        System.out.println(message.charAt(message.indexOf('y')));
//        System.out.println(message.length());

//        System.out.println(message.toUpperCase());
//        System.out.println(message.toLowerCase());
//        message = message.toUpperCase();
//        System.out.println(message);

//        System.out.println(message.replace(" ","??"));

//        Scanner scanner = new Scanner(System.in);
//        String result = scanner.nextLine();
//        System.out.println(result.contains("@"));
//        System.out.println(result.charAt(result.length()-1));


//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        System.out.println(str1.equalsIgnoreCase(str2)); Hello Batch4! String Manipulation

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String old = new String(scanner.nextLine());
        String newWord = new String(scanner.nextLine());

        System.out.println(word.replace(old,newWord));







    }
}
