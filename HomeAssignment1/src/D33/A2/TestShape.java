package D33.A2;

public class TestShape {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5, "Sunny", "orange");
        Rectangle rectangle1 = new Rectangle(1.5, 6.77, "Darky", "black");

        circle1.draw();
        circle1.calculateArea();
        rectangle1.draw();
        rectangle1.calculateArea();

    }
}
