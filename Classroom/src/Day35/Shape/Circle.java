package Day35.Shape;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();

        double circleArea = Math.PI * radius * radius;

        System.out.println(circleArea);
    }
}
