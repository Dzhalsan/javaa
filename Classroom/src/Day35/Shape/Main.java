package Day35.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2,2);
        Triangle triangle = new Triangle(5, 2);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();

        
    }
}
