package D34.A1;

public class Technician extends Employee{

    int yearsOfExperience;

    public Technician(String name, int salary, int yearsOfExperience) {
        super(name, salary);
        this.yearsOfExperience = yearsOfExperience;
    }
}
