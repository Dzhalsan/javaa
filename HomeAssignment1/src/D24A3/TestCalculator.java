package D24A3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
//        Scanner scanner =new Scanner(System.in);
//        ArrayList<Calculator> calculatorsList = new ArrayList<>();
//        System.out.println(calculatorsList.hashCode());
//        ArrayList<Integer> integerArrayList = new ArrayList<>(); // Wrapper classes
//        ArrayList<Double> doubleArrayList = new ArrayList<>(); // ArrayList, LinkedList -> List interface, HashSet, TreeSet, LinkedHashSet, HashMap, HashSet, TreeMap
//
//        for (int i = 0; i < 2; i++) {
//
//            System.out.print("Enter first value: ");
//            int firstValue = scanner.nextInt();
//
//            System.out.print("Enter second value: ");
//            int secondValue = scanner.nextInt();
//
//            Calculator calculator = new Calculator(firstValue, secondValue);
//            calculatorsList.add(calculator);
//
//            calculator.add();
//        }
//
//        for (Calculator calculator : calculatorsList) {
//            System.out.println("first value: " + calculator.n1 + " second value: "  + calculator.n2);
//        }
//
//        System.out.println(calculatorsList.hashCode());

//        obj.add();

        obj.add(2,2);
        obj.subtract(5,1);
        obj.multiply(2,1);
        obj.divide(2,2);
        obj.modulus(10,9);

    }
}
