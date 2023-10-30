package D33.A2;

public class Circle extends Shape{

    double radius;

    public Circle(double radius, String name, String color) {

        super(name, color);
        this.radius = radius;

    }

    public void calculateArea() {

        double Area = Math.PI * radius * radius;
        System.out.println("Area of the circle " + name + " is: " + Area);

    }

}
