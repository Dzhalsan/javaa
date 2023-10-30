package D33.A3;

public class Classroom {
    public static void main(String[] args) {

        Student student1 = new Student("Ayrton", 45);
        Teacher teacher1 = new Teacher("Lisa", 33, "Business analytics");

        student1.introduce();
        System.out.println(student1.getStudentId() + ". " + student1.name + ", it is your student id number");
        student1.study();

        teacher1.introduce();
        System.out.println(teacher1.name + ", this is your new subject " + teacher1.getSubject());
        teacher1.teach();

    }
}
