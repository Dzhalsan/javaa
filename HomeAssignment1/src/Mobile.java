public class Mobile {
    String model;
    double price;
    String memory;

    void ring(){
        System.out.println(model + " is ringing");
    }

    void turnOn(){
        System.out.println(model + " is turning on");
    }

    void turnOff(){
        System.out.println(model + " is turning off");
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
        m1.model = "Samsung";
        m2.model = "Iphone";
        m3.model = "RedMi";

        m1.ring();
        m1.turnOn();
        m1.turnOff();
        System.out.println();
        m2.ring();
        m2.turnOn();
        m2.turnOff();
        System.out.println();
        m3.ring();
        m3.turnOn();
        m3.turnOff();
    }
}
