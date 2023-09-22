public class RecapPrimitives1 {

    public static void main(String[] args) {

//        Task 1:
//
//        a)
//
//        Write program to convert temperature.
//
//                Given temperature is in Celsius.
//
//        Declare int temperature = 30;
//
//        Convert it to Fahrenheit and store in a double variable
//
//        Print the result as following: (9 * temperature + ( 32 * 5 )) / 5 = result
//
//formula to convert Celcius to Fahrenheit is F = (9 * celsius + ( 32 * 5 )) / 5

        int temp = 30 ;
        double ftemp;

        ftemp = (9 * (double)temp + ( 32 * 5 )) / 5;

        System.out.println("Task 1");
        System.out.println("(9 * "+temp+" + ( 32 * 5 )) / 5 = "+ftemp+'\n');

//        b)
//
//        Write program to convert temperature.
//
//                Given temperature is in Fahrenheit.
//
//        int temperature = 100;
//
//        Convert it to Celcius and store in a double variable
//
//        Print the result as following: 5 * (temperature - 32 ) /9 = result
//
//formula to convert Fahrenheit to Celcius is C = (5 * ( fahrenheit - 32 )) / 9

        temp = 100;
        ftemp = (5 * ( (double)temp - 32 )) / 9;

        System.out.println("(5 * ("+temp+" - 32 ) /9 = "+ftemp);


//        Task 2)
//
//        Write a program that takes each digit of number 132 and assigns them to new variables
//
//        a)prints them
//
//        As following: first digit = 1, second digit = 3, third digit = 2

        int n = 123;
        int d1,d2,d3 ;

        d1 = n/100;
        d2 = (n/10)%10;
        d3 = n%10;

        System.out.print('\n');
        System.out.println("Task 2 ");
        System.out.println("first digit = "+d1+", second digit =  "+d2+", third digit = "+d3+'\n');

//        b)prints the sum of digits

        System.out.println(d1+" + "+d2+" + "+d3+" = "+(d1+d2+d3)+'\n');

//        c)prints the product of digits
//
//        As following: 1 * 3 * 2 = 7

        System.out.println(d1+" * "+d2+" * "+d3+" = "+(d1*d2*d3)+'\n');

//        d)prints the number 132 in reverse order (231) separated by commas
//
//        As following: 2, 3, 1

        System.out.println(d3+", "+d2+", "+d1);









    }
}
