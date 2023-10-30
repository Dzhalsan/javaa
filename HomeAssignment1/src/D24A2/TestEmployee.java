package D24A2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Good one", 29, "Senior", 123000.0);
        Employee e2 = new Employee("Mediocre", 30);
        Employee e3 = new Employee("Newbie");

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
        e3.displayEmployeeInfo();

    }
}
