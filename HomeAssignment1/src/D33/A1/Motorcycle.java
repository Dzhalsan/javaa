package D33.A1;

public class Motorcycle  extends Vehicle {

    int numWheels;

    public Motorcycle(int wheels, int year, String make, String model) {

        super(year, make, model);
        numWheels = wheels;

    }

    public void rev(Motorcycle motorcycle) {

        System.out.println("Revving the engine " + motorcycle.model);

    }
}
