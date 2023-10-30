package D25;

public class Person {

    String name;

    static int totalPersons;


    public Person() {
        totalPersons++;
    }

    public static void displayTotalPersons() {
        System.out.println(totalPersons);
    }

    public void introduce() {
        System.out.println("My nane is " + name);
    }
}
