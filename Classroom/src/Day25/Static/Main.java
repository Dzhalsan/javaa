package Day25.Static;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student(500);
        Student student2= new Student(300);
        Student student3= new Student(1000);

        student1.wallet-=100;
        Student.moneybox+=100;

        student2.wallet-=100;
        Student.moneybox+=100;

        student3.wallet-=100;
        Student.moneybox+=100;

        System.out.println(Student.moneybox);

        System.out.println("W1"+student1.wallet);
        System.out.println("W2"+student2.wallet);
        System.out.println("W3"+student3.wallet);


    }
}
