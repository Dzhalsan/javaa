package D34.A1;

public class Main {
    public static void main(String[] args) {

        EmployeeRecordSystem recordSystem = new EmployeeRecordSystem();

        Manager manager1 = new Manager("ManagerJack", 123000, "Sales");
        Engineer engineer1 = new Engineer("EngineerKevin", 111000, "C#");
        Technician technician1 = new Technician("TechnicianMike", 65000, 2);

       recordSystem.addEmployee(recordSystem.employeesList, manager1);
       recordSystem.addEmployee(recordSystem.employeesList, engineer1);
       recordSystem.addEmployee(recordSystem.employeesList, technician1);

       recordSystem.displayAllEmployees(recordSystem.employeesList);

       recordSystem.removeById(recordSystem.employeesList, 2);
       recordSystem.removeById(recordSystem.employeesList, 3);

       recordSystem.displayAllEmployees(recordSystem.employeesList);

       recordSystem.updateSalaryByID(recordSystem.employeesList, 1, 500);

       recordSystem.displayAllEmployees(recordSystem.employeesList);



    }
}
