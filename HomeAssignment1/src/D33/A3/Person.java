package D33.A3;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void introduce() {

        System.out.println("My name is " + name + " and I am " + age + " years old.");

    }

}
