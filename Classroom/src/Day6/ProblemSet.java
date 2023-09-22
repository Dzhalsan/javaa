package Day6;

import java.util.Scanner;

public class ProblemSet {
    public static void main(String[] args) {

//        task 1
//        Scanner scanner = new Scanner(System.in);
//        String name;
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//        System.out.println(name+", have a productive day! ");

//        task 2
//        Scanner scanner= new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        System.out.println((n1+n2));
//
//        task 3
//        Scanner scanner = new Scanner(System.in);
//        int result;
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        result = n1 + n2 ;
//        System.out.println(result);

//        task 4
//        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        double d = (double)(n1+n2)/2;

//
//        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int n3 = scanner.nextInt();
//        int d = n1*n2*n3 ;

//        Scanner scanner = new Scanner(System.in);
//        double n1 = scanner.nextDouble();
//        double n2 = scanner.nextDouble();
//        double n3 = scanner.nextDouble();
//        double n4 = scanner.nextDouble();
//        double d = n1/n2/n3/n4 ;
//
//        System.out.println(n1+" / "+n2+" / "+n3+" / "+n4+" = "+d);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d1 = n/100;
        int d2 = (n/10)%10;
        int d3 = n%10;


        System.out.println(d1+","+d3+","+d2);




    }
}
