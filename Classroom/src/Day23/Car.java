package Day23;

public class Car {
    String brand;
    String color;
    int price;

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println("Car 1 details");
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.price);

        System.out.println("Car 2 details");
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.price);

    }
}
