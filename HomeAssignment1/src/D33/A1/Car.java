package D33.A1;

public class Car extends Vehicle{

    int numDoors;

    public Car(int numDoors, int year, String make, String model) {

        super(year, make, model);
        this.numDoors = numDoors;
    }

    public void start(Car car) {
        System.out.println("Starting the car " + car.year + " " + car.make + " "  + car.model );
    }

}
