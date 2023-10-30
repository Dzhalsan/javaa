package Day35.Shape;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();

        double triangleArea = height * 0.5 * base;

        System.out.println(triangleArea);
    }
}
