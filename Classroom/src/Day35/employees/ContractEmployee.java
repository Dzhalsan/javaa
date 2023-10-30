package Day35.employees;

public class ContractEmployee extends Employee{
    int contractDuration;

    public ContractEmployee(String name, double salary, int contractDuration) {
        super(name, salary);
        this.contractDuration = contractDuration;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("Contract employee: " + salary);
    }

    public void calculateSalary(int hourlyRate, int hoursWorked) {
        super.calculateSalary();
        System.out.println("Contract employee: " + (hourlyRate*hoursWorked));
    }
}
