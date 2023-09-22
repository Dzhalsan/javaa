public class StringComparing {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("Hello World!");

        System.out.println(hello1.equals(hello2)); // task 1
        System.out.println(hello1==hello3);        // task 2
        System.out.println(hello1.equals(hello3)); // task 3

        hello1=hello1.toLowerCase();
        hello2=hello2.toLowerCase();
        System.out.println(hello1.equals(hello2)); // task 4

        hello1=hello1.toUpperCase();
        hello3=hello3.toUpperCase();
        System.out.println(hello1.equals(hello3)); // task 5






    }
}
