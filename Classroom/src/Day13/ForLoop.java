package Day13;

public class ForLoop {
    public static void main(String[] args) {
        int s=0;

        for (int i=1; i<=10; i++) {

            System.out.println("The value of x is "+i);
            s=s+i;
        }
        System.out.println("Sum of first ten numbers: "+s);

    }
}
