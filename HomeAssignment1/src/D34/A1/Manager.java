package D34.A1;

public class Manager extends Employee{

    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
}
