package D26.A1;

public class TestProduct {

    public static void main(String[] args) {

        Product p1 = new Product("Product1", 25, 57);
        Product p2 = new Product("Product2", 5, 225);
        Product p3 = new Product("Product3", 1, 129);
        Product p4 = new Product("Product4", 1024, 3);
        Product p5 = new Product("Product5", 35, 64);
        Product p6 = new Product("Product6", 256, 128);

        Product.displayTotalProductsSold();

        p1.calculateTotalValue();
        p2.calculateTotalValue();
        p3.calculateTotalValue();
        p4.calculateTotalValue();
        p5.calculateTotalValue();
        p6.calculateTotalValue();


    }

}
