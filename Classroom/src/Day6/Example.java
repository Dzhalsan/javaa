package Day6;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);


        System.out.println("Enter name, age and salary:");

        // String imput
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output by user
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

    }
}
