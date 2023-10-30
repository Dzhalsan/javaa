package D25;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Dick";

        Person p2 = new Person();
        p2.name = "Unknown";

        Person p3 = new Person();

        Person.displayTotalPersons();
        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
