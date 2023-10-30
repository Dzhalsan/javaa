package D34.A1;

public class Engineer extends Employee{

    String programmingLanguage;

    public Engineer (String name, int salary, String programmingLanguage) {
        super(name,salary);
        this.programmingLanguage = programmingLanguage;
    }
}
