import java.util.Scanner;

public class D21MethodsAdvanced {
    public static void main(String[] args) {

        System.out.println(hundredMultiply());

    }

//    task 1.1
//    public static int calculateSum (int a, int b){
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        return a+b;
//    }

    // task 1.2
//    public static void calculateSum (int n1, int n2) {
//        Scanner scanner = new Scanner(System.in);
//        n1 = scanner.nextInt();
//        n2 = scanner.nextInt();
//        System.out.println(n1 + n2);
//    }

    //task 2.1
//    public String getString (String g) {
//        Scanner scanner = new Scanner(System.in);
//        g = scanner.nextLine();
//        return g.toUpperCase();
//    }

    // task 2.2
//    void  getStr22 (String g) {
//        Scanner scanner = new Scanner(System.in);
//        g = scanner.nextLine();
//        System.out.println(g.toUpperCase());
//    }

    //task 3
    public static int task3 (){
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        return 10*a/b;
    }

    // task 4
    public static void isEven (int a){
        System.out.println(a % 2 == 0);
    }

    // task 5
    public static double hundredMultiply(){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        return (a*100);
    }

}
