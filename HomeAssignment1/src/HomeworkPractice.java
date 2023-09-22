public class HomeworkPractice {

    public static void main(String[] args) {
       // task1 Print multiplication table from 1 to 10 with x
        int x = 4;

        System.out.println(x+" * 1 = "+(x*1));
        System.out.println(x+" * 2 = "+(x*2));
        System.out.println(x+" * 3 = "+(x*3));
        System.out.println(x+" * 4 = "+(x*4));
        System.out.println(x+" * 5 = "+(x*5));
        System.out.println(x+" * 6 = "+(x*6));
        System.out.println(x+" * 7 = "+(x*7));
        System.out.println(x+" * 8 = "+(x*8));
        System.out.println(x+" * 9 = "+(x*9));
        System.out.println(x+" * 10 = "+(x*10)+'\n');



        // task 2 Print division table from, dividing number 50 from 20 to 30 with x
        int a = 50, b = 20;

        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b++);
        System.out.println(a+" / "+b+" = "+(double)a/b+++'\n');



        // Task 3: Declare variables: int q = 5; int w = 9, int e = 10; Print the sum of all three variables.

        int q = 5, w = 9, e = 10;

        System.out.println("sum of all = "+(q+w+e)+'\n');

//        Task 4: Declare variables: int c = 10; int d = 5;
//        Using operators and variables, write a program that will print following lines of code:
//        10 + 5 = 15
//        10 - 5 = 5
//        10 * 5 = 50
//        10 / 5 = 2
//        10 % 5 = 0

        int c = 10, d = 5;

        System.out.println("10 + 5 = "+(c+d));
        System.out.println("10 - 5 = "+(c-d));
        System.out.println("10 * 5 = "+(c*d));
        System.out.println("10 / 5 = "+(c/d));
        System.out.println("10 % 5 = "+(c%d)+'\n');

//        Task 5: Declare a variable int number = 0;
//        Make an assign to the variable number so that sum of 2345 and 8 calculated first, then divide by 3, make modulus 5 and multiply by 5.
//        Print the final result as following:
//
//        (2345 + 8) / 3 % 5 * 5 = 20

        int number = 0;
        number = (2345 + 8) / 3 % 5 * 5;

        System.out.println("(2345 + 8) / 3 % 5 * 5 = "+number+'\n');

//        Task 6 : Print if the two numbers 23 and 45 are equal.
//        Output must be false

        int n1 = 23, n2 = 45;

        System.out.println("Two numbers are equal: "+(n1==n2)+'\n');

//        Task 7: Write a program to check if the two numbers 25 is greater than 10.
//        Output must be true

        n1 = 25;
        n2 =10;

        System.out.println(n1+" is greater than "+n2+": "+(n1>n2));







    }
}
