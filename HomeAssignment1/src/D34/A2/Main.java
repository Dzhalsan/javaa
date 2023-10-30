package D34.A2;

public class Main {
    public static void main(String[] args) {

        StudentEnrollmentSystem system1 = new StudentEnrollmentSystem();

        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("Bobby");
        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent("Ricky");

        GraduateStudent graduateStudent1 = new GraduateStudent("Leonard");

        system1.addStudent(undergraduateStudent1);
        system1.addStudent(undergraduateStudent2);
        system1.addStudent(graduateStudent1);
        system1.displayAllStudents();

        system1.removeById(2);
        system1.displayAllStudents();

        system1.updateName(1, "Michaela");
        system1.displayAllStudents();



    }
}
