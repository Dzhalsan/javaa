package D24A2;

public class Employee {
    String name;
    int age;
    String position;
    double salary;

    public Employee(String name, int age, String position, double salary){
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String newName, int newAge){
        name = newName;
        age = newAge;
        position = "Unknown";
    }

    public Employee(String newName) {
        name = newName;
        position = "Unknown";
    }

    public void displayEmployeeInfo(){
        System.out.print(name);
        System.out.print(" " + age + " years ");
        System.out.print("Position: "+position);
        System.out.println(" $"+salary);
    }
}
