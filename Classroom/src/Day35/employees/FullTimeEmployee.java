package Day35.employees;

public class FullTimeEmployee extends Employee{

    double bonus;

    public FullTimeEmployee(String name, double salary, double bonus) {
        super(name, salary);

        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("Fulltime employee salary: " + (salary+bonus));
    }
}
