package D34.A1;

import java.util.ArrayList;

public class EmployeeRecordSystem {

    ArrayList<Employee> employeesList = new ArrayList<>();

    public void addEmployee(ArrayList<Employee> list, Employee employee) {

        if (list.add(employee)) {
            System.out.println(employee.name + " was added successfully .");
            employee.employeeID = list.size() ;
        }
        else {
            System.out.println("Error! " + employee.name + "was not added!");
        }

    }

    public void displayAllEmployeeDetails (ArrayList<Employee> list, Employee employee) {

        if (list.contains(employee)) {

            System.out.println("----------------Displaying details for employee " + employee.name + "----------------");
            System.out.println("Name: " + employee.name);
            System.out.println("ID: " + employee.employeeID);
            System.out.println("Salary: " + employee.salary + "$ ");

        }
        else {
            System.out.println(employee.name + " is not in the system! ");
        }

    }

    public void updateSalaryByID (ArrayList<Employee> list, int id, int updatedSalary) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).employeeID == id) {
                list.get(i).salary = updatedSalary;
                System.out.println("Employee with id " + id + " .Salary was updated");
                return ;
            }
        }

        System.out.println("Employee with such ID was not found in the records");

    }

    public void removeById (ArrayList<Employee> list, int id) {

        System.out.println("--------------------------------");
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).employeeID == id) {
                list.remove(i);
                System.out.println("id " + id + " employee was removed from records");
                return;
            }
        }

        System.out.println("Employee with such ID was not found in the records");
    }

    public void displayAllEmployees (ArrayList<Employee> list) {

        for (Employee element: list) {
            System.out.println("----------------Displaying details for employee " + element.name + "----------------");
            System.out.println("Name: " + element.name);
            System.out.println("ID: " + element.employeeID);
            System.out.println("Salary: " + element.salary + "$ ");
        }

    }
}
