import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        // task 1
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        while (n>=0)
//        {
//            System.out.println("Enter negative number");
//             n = scanner.nextInt();
//
//        }

        // task 2
//        int n = scanner.nextInt();
//        int f = 1;
//
//        while (n>0)
//        {
//            f = f*n;;
//            n--;
//        }
//        System.out.println(f);
//task 3

        //int n ;
//        String indicator = "y";
//        int sum = 0;
//
//        while (indicator.equalsIgnoreCase("y")) {
//         int n = scanner.nextInt();
//         scanner.nextLine();
//         sum+=n;
//         System.out.println("Do you wanna continue y/n?");
//         indicator = scanner.nextLine();
//        }
//        System.out.println("Sum of the numbers your entered is+"sum);

        // task 4

//        String indicator = "y";
//        int pcounter = 0;
//        int ncounter = 0;
//        int zcounter = 0;
//
//        while (indicator.equalsIgnoreCase("y")) {
//            int n = scanner.nextInt();
//            scanner.nextLine();
//            if (n>0) pcounter++;
//            else if (n<0) ncounter++;
//            else zcounter++;
//            System.out.println("Do you wanna continue y/n?");
//            indicator = scanner.nextLine();
//        }
//        System.out.println("You entered "+pcounter+ " positive number "+ncounter+" negative number "+zcounter+" zero");

        // task 5
        int counter;
        String word = "";
        do
        {
            System.out.print("Enter a string: ");
            counter = 0;
            word = scanner.nextLine();
            for (int i = 0 ; i<word.length(); i++)
            if (Character.isDigit(word.charAt(i))) counter++;
            System.out.println(counter + " digits");

        }
        while (counter!=3) ;
        System.out.println("You entered a string with " + counter + " digits");

    }
}
