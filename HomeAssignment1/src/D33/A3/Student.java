package D33.A3;

public class Student extends Person{

    static int nextId = 1;
    int studentId;

    public Student(String name, int age) {

        super(name, age);
        this.studentId = nextId;
        nextId++;

    }

    public void study() {

        System.out.println(name + " is studying");

    }

    public int getStudentId() {

        return studentId;

    }
}
