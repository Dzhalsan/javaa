package D33.A2;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle (double length, double width, String name, String color) {

        super(name, color);
        this.length = length;
        this.width = width;

    }

    public void calculateArea() {

        double Area = width * length;
        System.out.println("Area of the rectangle " + name + " is: " + Area);

    }
}
