package D33.A2;

public class Shape {

    String name;
    String color;

    public Shape(String name, String color) {

        this.name = name;
        this.color = color;

    }

    public void draw() {

        System.out.println("Drawing the shape " + name);

    }
}
