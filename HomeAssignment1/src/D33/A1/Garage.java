package D33.A1;

public class Garage {
    public static void main(String[] args) {

        Car car1 = new Car(2, 2007, "Mazda", "MX5");
        Motorcycle bike1 = new Motorcycle(2, 2015, "Honda", "1000R");

        car1.drive(car1);
        car1.start(car1);

        bike1.drive(bike1);
        bike1.rev(bike1);


    }
}
