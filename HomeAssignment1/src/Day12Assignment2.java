import java.util.Scanner;

public class Day12Assignment2 {
    public static void main(String[] args) {

//        1. Write a program that asks user to enter 2 variables login and password
//
//* if login and password are correct then print "Successful login!"
//        otherwise print "Some credential is wrong!"
//
//        Correct credentials: login = codewise22, password = password112
//
//        Input: codewise22
//        Input: password112
//        Output: Successful login!

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Login: ");
//        String log = scanner.nextLine();
//        System.out.print("Password: ");
//        String pass = scanner.nextLine();
//
//        if (!log.equals("codewise22") || !pass.equals("password112")) System.out.println("Some credential is wrong!");
//        else System.out.println("Successful login!");


//                2. Write a program that asks user to enter age
//
//        Level: Easy
//
//        Print age stage like toddler, teen and other by checking age
//// between 1 and 3 toddler inclusive
//// between 4 and 5 preschool inclusive
//// between 6 and 12 gradeschooler inclusive
//// between 13 and 17 teen inclusive
//// between 18 to .. adult inclusive
//// age is greater 135 -> Wrong age
//
//
//        Input: 23
//        Output: adult

//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//
//        if (age>=1 && age<=3) System.out.println("todler");
//        if (age>=4 && age<=5) System.out.println("preschool");
//        if (age>=6 && age<=12) System.out.println("gradeschooler");
//        if (age>=13 && age<=17) System.out.println("teen");
//        if (age>=18 && age<=135) System.out.println("adult");
//        else System.out.println("Wrong age");

//        Level: Medium
//
//        3) Write a program that asks user to enter password
//        and checks whether it follows rules and its level
//                * password must have at least 4 letters
//                * password must contain !
//                * if password has 4 or more letters its 1st level password
//                * if password has 6 or more letters its 2nd level password
//                * if password has 10 or more letters its 3rd level password
//
//
//        Input: pass
//        Output: Your password doesn't contain "!"
//
//        Input: 12
//        Output:
//        Your password is too short!
//                Your password doesn't contain "!"
//
//        Input: password!
//                Output: 2nd level password

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (pass.contains("!") && pass.length()>=10) System.out.println("3rd level password");
        else if (pass.contains("!") && pass.length()>=6) System.out.println("2nd level password");
        else if (pass.contains("!") && pass.length()>=4) System.out.println("1st level password");
        else if (!pass.contains("!") && pass.length()>=4) System.out.println(" Your password doesn't contain \"!\"");
        else if (pass.contains("!") && pass.length()<4) System.out.println(" Your password is too short!");
        else System.out.println("Your password is too short!\n" + "Your password doesn't contain \"!\"");




    }

}
