import java.util.Scanner;

public class D21A2 {
    public static void main(String[] args) {
        helloLoop(5);
        strToLowerE("Codewise Chicago");
        System.out.println(calculateFactorial(0));
        calculatePower(2,6);
        calculatePower(3,4);
        System.out.println(isPrime(17));
        System.out.println(isPrime(15));
    }

   //task 1
    public static void helloLoop (int a){
        for (int i=0; i<a; i++)
            System.out.println("hello");
    }

    // task 2
    public static void strToLowerE(String e){
        System.out.println(e.toLowerCase().replace("e", "a"));
    }

    // task 3
    public static int calculateFactorial (int factorial){
        int f=1;
        for (int i=1; i<=factorial;i++)
            f*=i;
        return f;
    }

    // task 4
    public static void calculatePower (int base, int exp){
        int result=1;
        for (int i=1; i<=exp;i++) {
            result*=base;
        }
        System.out.println(result);
    }

    // task 5
    public static boolean isPrime(int par){
        if (par<=1){
            return false;
        }
        else if (par<=3) return true;
            else {
                int counter=0;
                for (int i=1; i<=par; i++)
                if (par%i==0) counter++;
                if (counter>2) return false;
                }
        return true;
    }

}
