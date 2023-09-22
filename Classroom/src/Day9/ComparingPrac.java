package Day9;

import java.util.Scanner;

public class ComparingPrac {
    public static void main(String[] args) {

//        boolean b1 = 15>20;
//        boolean b2 = 22/2>=2;
//        boolean b3 = 3<2;
//        boolean b4 = 22/2==2;
//        boolean b5 = 22*2<=2;
//
//        boolean b6 = "Hi".equals("hi");
//        boolean b7 = "Hi".equalsIgnoreCase("hi");
//        boolean b8 = "Hi".length()>1;
//        boolean b9 = "Hi".length()<=1;
//        boolean b10 = "gday".indexOf('g')<=1;

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        if (n>0){
//            System.out.println("This number is > 0");
//
//        } else {
//                if (n<0) {
//            System.out.println("Number is < 0");
//
//
//        }
//                else {
//                    System.out.println("Number is 0");
//                }
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        String password = scanner.nextLine();
//        int l = password.length();
//
//        if (l>5) {
//            System.out.println("password level 2");
//        } else if (l<5) {
//
//            System.out.println("password weak");
//        }
//                else System.out.println("password level 1");


        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();

        if (price>=10000){
            System.out.println("CAR B is bought");
        } else if (price<5000) {
            System.out.println("CAR C is bought");

        }
        else {
            System.out.println("CAR A is bought");
        }


    }
}
