import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {

//        1. Write a program that takes a number as
//        input using scanner class and calculates the sum of the digits of a number.
//        For example, if the input is 12345, the output should be 15 (since 1+2+3+4+5=15).
//
//        Use conversion from String to int and a String method.
//
//                Input: 945
//        Output: 18
//
//        Input: 8263
//        Output: 19
//
//        Input: 73974343
//        Output: 40

        Scanner scanner = new Scanner(System.in);
        String snumber = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i<snumber.length();i++)
        {
            sum += (snumber.charAt(i)-48);
        }
        System.out.println(sum);




//        2. Write a java program that accepts 5 integers from the keyboard and displays
//        information about how many of them were even and how many are odd.
//                Input: 1
//        Input: 23
//        Input: 933
//        Input: 3
//        Input: 1244
//        Output: 4 odd, 1 even

//        Scanner scanner = new Scanner(System.in);
//        int oddcounter=0;
//        int evencounter=0;
//
//
//        for (int i=1; i<=5; i++){
//            int n = scanner.nextInt();
//            if (n % 2 == 0) evencounter+=1;
//            else oddcounter+=1;
//        }
//        System.out.println(oddcounter+" odd "+evencounter+" even ");

//        3. Write a program that takes from user a word and determines
//        whether a given string is a palindrome (reads the same forwards and backwards).
//
//                Input: rotator
//        Output: It is a palindrome
//
//        Input: cool
//        Output: It is not a palindrome
//
//        Input: macbook
//        Output: It is not a palindrome


//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        String rword ="";
//
//
//        for (int i = word.length()-1; i >= 0; i--)
//        {
//          rword = rword+word.charAt(i) ;
//        }
//        if (word.equalsIgnoreCase(rword)) System.out.println("It is a palindrome");
//        else System.out.println("It is not a palindrome");

//        4. Write a program that takes from user 6 integers and
//        displays information about how many of them
//        were larger than the first number.
//        Input: 15
//        Input: 9
//        Input: 209
//        Input: 19
//        Input: 4
//        Input: 123
//        Output: There are 3 numbers larger than 15

//        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int counter = 0;
//
//        for (int i = 0; i < 5 ; i++)
//        {
//            int n = scanner.nextInt();
//            if (n>n1)
//            {
//                counter+=1;
//            }
//        }
//        System.out.println("There are "+counter+" numbers larger than "+n1);

//        5. Write a program that takes a word from user
//        and prints every second letter in upper case
// 1 3 5 7 - uppercase
// 0 2 4 6 - as they are
//                INPUT: macbook
//        OUTPUT: mAcBoOk

//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        String Upperword=""+word.charAt(0);
//
//        for (int i = 1; i<word.length(); i++)
//        {
//            if (i % 2 !=0) Upperword+=(word.charAt(i)+"").toUpperCase();
//            else Upperword+=word.charAt(i);
//        }
//        System.out.println(Upperword);

    }
}

