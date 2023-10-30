package D24A1;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Bottle", 4.99, 27);
        Product p2 = new Product("Coffee", 6.25);
        Product p3 = new Product("Service");

        p1.displayProduction();
        p2.displayProduction();
        p3.displayProduction();
    }
}
