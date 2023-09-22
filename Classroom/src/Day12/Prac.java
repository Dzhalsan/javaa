package Day12;

import java.util.Scanner;
import java.util.SortedMap;

public class Prac {
    public static void main(String[] args) {

//System.out.println(word1.substring(0,word1.length()/2)+word2+word1.substring((word1.length()/2),word1.length()));
//        Scanner scanner = new Scanner(System.in);
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//
//        word1 = word1.substring(1);
//        word2 = word2.substring(1);
//
//        System.out.println(word1+word2);

//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.nextLine();
//        boolean isFront = scanner.nextBoolean();
//
//        if (isFront) System.out.println(word.substring(0,1));
//        else System.out.println(word.substring(word.length()-1));


//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.nextLine();
//
//        System.out.println(word.substring(2,word.length())+word.substring(0,1)+word.substring(1,2));

//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.nextLine();
//        int n = scanner.nextInt();
//
//        if (n>2) System.out.println(word.substring(0,n)+word.substring(n+1,word.length()));
//        else System.out.println("Invalid number");


//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.nextLine();
//        String str1= word.substring(0,2);
//        String str2= word.substring(word.length()-2);
//
//
//        if (str1.equals(str2)) System.out.println(str1.equals(str2));
//        else System.out.println(str1.equals(str2));

//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.nextLine();
//        String str1= word.substring(0,1);
//        String str2= word.substring(word.length()-1);
//
//
//        if (str1.equals("x")&&str2.equals("x")) System.out.println(word.substring(1,word.length()-1));
//        else if (str1.equals("x")) System.out.println(word.substring(1,word.length()));
//            else if (str2.equals("x")) System.out.println(word.substring(0,word.length()-1));
//            else System.out.println(word);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int n2 = scanner.nextInt();
        System.out.println("Choose one of the operator: +, -, *, /, %");
        scanner.nextLine();
        String symb = scanner.nextLine();

        if (symb.equals("+")) System.out.println("Result is "+n1+" + "+n2+" = "+(n1+n2));
        else if (symb.equals("-")) System.out.println("Result is "+n1+" - "+n2+" = "+(n1-n2));
        else if (symb.equals("%"))  System.out.println("Result is "+n1+" % "+n2+" = "+(n1%n2));
        else if (symb.equals("*")) System.out.println("Result is "+n1+" * "+n2+" = "+(n1*n2));
            else System.out.println("Result is "+n1+" / "+n2+" = "+((double) n1/(double) n2));






    }


}
