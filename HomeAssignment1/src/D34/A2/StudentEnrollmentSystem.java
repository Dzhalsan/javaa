package D34.A2;

import java.util.ArrayList;

public class StudentEnrollmentSystem {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student someStudent) {

       if (students.add(someStudent)) {
           System.out.println(someStudent.name + " was added into the system");
           someStudent.studentId = students.size();
       }
       else {
           System.out.println("unsuccessful adding");
       }

    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students in the system");
        }
        else {
            for (Student element: students) {
                System.out.println("----------Printing each student details----------");
                System.out.println("Name: " + element.name);
                System.out.println("ID: " + element.studentId);
            }
        }

        System.out.println("----------End of the list with details----------");

    }

    public void updateName(int inputId, String newName) {

        boolean found = false;

        if (inputId < 0) {
            System.out.println("Id is not valid, ID must be positive number");
        }
        else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).studentId == inputId) {
                    students.get(i).name = newName;
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Student's name with id: " + inputId + " was successfully updated");
        }
        else {
            System.out.println("Student with id: " + inputId + " was not found");
        }

    }

    public void removeById(int inputId) {

        boolean found = false;

        if (inputId < 0) {
            System.out.println("Id is not valid, ID must be positive number");
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).studentId == inputId) {
                    students.remove(i);
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("Such student was not found");
        }
        else {
            System.out.println("Student with id: " + inputId + " was successfully removed");
        }
    }
}
