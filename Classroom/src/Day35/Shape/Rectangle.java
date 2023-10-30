package Day35.Shape;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle ( double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();

        double rectangleArea = length * width;

        System.out.println(rectangleArea);
    }
}
