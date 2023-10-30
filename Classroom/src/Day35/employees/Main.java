package Day35.employees;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Employee1",60000,5000);
        ContractEmployee contractEmployee = new ContractEmployee("Employee2", 55000,2);

        fullTimeEmployee.calculateSalary();
        contractEmployee.calculateSalary();
    }
}
