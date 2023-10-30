package Day25.Static;

public class Student {
    public int numberOfStudents;

    static int moneybox;
    int wallet;

    public  Student (int wallet){
        this.wallet = wallet;
        numberOfStudents++;
    }

    public static void staticMethod(){
        System.out.println("Static method");
    }

    public void instanceMethod(){
        System.out.println("Instance method");
    }


}
