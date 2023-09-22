import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {

//        1.  Write a program that prints multiplications table.
//                Ask user starting and ending numbers.
//                Also ask user for which number is multiplication table.
//                Enter The Starting Number :1
//        Enter The Ending Number :5
//        Enter The Tables Number :3

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter The Starting Number : ");
//        int start = scanner.nextInt();
//        System.out.print("Enter The Ending Number : ");
//        int end = scanner.nextInt();
//        System.out.print("Enter The Table Number : ");
//        int table = scanner.nextInt();
//
//        for (int i = start; i <= end; i++)
//            System.out.println(table+" * "+i+" = "+(table*i));

//        2. Write a program that takes a word as input using scanner class and
//        prints it in reversed.
//        Expected output:
//        Given word HELLOWORLD, Reversed number DLROWOLLEH

//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//
//        for (int i = word.length()-1; i>=0; i--)
//            System.out.print(word.charAt(i));

//        3. Write a java program which takes from user int n number,
//                then prints from 1 to n, with difference of multiplication 4
//        Input: 350
//        Output:
//        1
//        4
//        16
//        64
//        256
//        1024 doesn't match because 1024 is greater than 350

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i<n; i*=4)
//            System.out.println(i);


//        4. Write a program that takes from user to enter 2 string values, str1 and str2.
//        Print the number of occurences of str2 in str1.
//
//                your str2 every time must be only 3 letters
//        Input: codingiscodingbutnotcode
//        Input: cod
//        Output: cod is repeated 3 times
//        Explanation: cod is repeated in codingiscodingbutnotcode 3 times
//
//        Input: human being is never perfect
//        Input: e
//        Output: 5
//        Explanation: e is repeated in human being is never perfect 5 times

//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        int counter = 0;
//
//
//        if (str1.contains(str2)) {
//            for (int i = 0; i<(str1.length()-str2.length()); i++) {
//                if (str1.substring(i,i+str2.length()).equalsIgnoreCase(str2))
//                    counter+=1;}
//            System.out.println(str2+" is repeated in "+str1+" "+counter+" time(s) ");}
//        else System.out.println("String {"+str1+"} does not contain string2 {"+str2+"}");

//        5. Write a java program that asks user to enter a number then checks
//        if given number prime or not and prints it.
//
//* If number is divisible by 1 and itself only than it is a prime number
//                * otherwise if it divisibly by more than 2 number, it is not a prime number


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter=0;
        String parameters = "";

        for (int i = number; i>0; i--){
            if (number%i==0){
                counter+=1;
                parameters = parameters+i+"; ";
            }
        }
        if (counter==2) System.out.println(number+" is a prime number");
        else System.out.println(number+" is NOT a prime number");
        System.out.println("is divisible by "+parameters);









    }
}
