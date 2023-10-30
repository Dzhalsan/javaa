package D33.A1;

public class Vehicle {

    String make;
    String model;
    int year;

    public Vehicle(int year, String make, String model) {

        this.year = year;
        this.make = make;
        this.model = model;

    }

    public void drive(Vehicle vehicle) {

        System.out.println("Driving the vehicle " + vehicle.model);

    }

}
