import java.util.Scanner;

public class Day12Assignment1 {
    public static void main(String[] args) {


//        1) Write a class that accepts a first and last name from the keyboard
//                one person, and then the name and surname of another.
//        The class should check if these two people are:
//
//        First you need to enter first and last name for one person, then for another.
//
//                * Check if they have the same first and last names and print relevant text.
//
//* Check if they have same first names, but not last names and print relevant text.
//
//                * Check if they have the same last names but not first names and print relevant text

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter 1st person First Name: ");
//        String f1 = scanner.nextLine();
//        System.out.print("Enter 1st person Last Name: ");
//        String l1 = scanner.nextLine();
//        System.out.print("Enter 2nd person First Name: ");
//        String f2 = scanner.nextLine();
//        System.out.print("Enter 2nd person Last Name: ");
//        String l2 = scanner.nextLine();
//
//        if (f1.equals(f2) && l1.equals(l2)) System.out.println("First and last names are identical");
//        else if (f1.equals(f2)) System.out.println("First names are same but not the Last names");
//        else if (l1.equals(l2)) System.out.println("Last names are same but not the First names");
//        else System.out.println("Names are different");


//        2)  Write a program that asks user for their salary and year of service and print the net bonus amount.
//
//        A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//
//        Input: 10000
//
//        Input: 9
//
//        Output: 10500

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Salary: ");
//        int sal = scanner.nextInt();
//        System.out.print("Years of service: ");
//        int y = scanner.nextInt();
//
//        if (y>5) System.out.println(sal*1.05);
//        else System.out.println("You didn't deserve bonus");


//        3) Write a program to check if a year is leap year or not.
//                If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
//
//        You can declare int year using Scanner or just manually giving value.
//
//                yes	Leap Years are any year that can be exactly divided by 4 (such as 2016, 2020, 2024, etc)
//        not	except if it can be exactly divided by 100, then it isn't (such as 2100, 2200, etc)
//        yes	except if it can be exactly divided by 400, then it is (such as 2000, 2400)
//        Input: 2016
//
//        Output: It is a leap year
//
//        Input: 2500
//
//        Output:It is not a leap year

//        Scanner scanner = new Scanner(System.in);
//        int y = scanner.nextInt();
//
//        if (y%400==0 || y%4==0 && y%100!=0) System.out.println("It is a leap year");
//        else System.out.println("It is not a leap year");


//        4) Ask user to enter age, gender ( M or F ) and then using following rules print their place of service.
//        if employee is female, then she will work only in urban areas.
//
//        if employee is a male and age is in between 20 to 40 then he may work in anywhere
//
//        if employee is male and age is in between 40 to 60 then he will work in urban areas only.
//
//        And any other input of age should print "ERROR".

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter age: ");
//        int a = scanner.nextInt();
//        System.out.print("Enter gender: ");
//        scanner.nextLine();
//        String g = scanner.nextLine();
//
//        if (a<20 || a>60) System.out.println("ERROR");
//        else if (g.equalsIgnoreCase("M") && a>=20 && a<40) System.out.println("You may work anywhere");
//        else if (g.equalsIgnoreCase("M") || g.equalsIgnoreCase("W")) System.out.println("You may work in urban ares only");
//        else System.out.println("Check input");

//        5) Write a program that asks user to enter boolean talking, int hour
//
//        Imagine that if talking is true that means that parrot is talking and hour 22 means : Parrot is talking at 10PM
//
//
//                * hours can be from 0 - 23
//
//                * We are in trouble if the parrot is talking and the hour is before 7 or after 20
//        return true
//
//                * If at least talking is false and hour is between 7 and 20 then we are not in trouble
//
//        Input: true
//        Input: 6
//        Output: We are in trouble
//
//        Input: true
//        Input: 7
//        Output: We are not in trouble
//
//        Input: false
//        Input: 5
//        Output: We are not in trouble

        Scanner scanner = new Scanner(System.in);
        System.out.print("Is it talking?: ");
        boolean talk = scanner.nextBoolean();
        System.out.print("Hour: ");
        scanner.nextLine();
        int hour = scanner.nextInt();

        if (talk && (hour<7 || hour>20)) System.out.println("We are in trouble");
        else System.out.println("We are not in trouble");

    }
}
