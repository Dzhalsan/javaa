package D26.A1;

public class Product {

    String name;
    double price;
    int quantity;
    static int totalProductsSold;

    public Product(String name, int price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProductsSold++;

    }

    public static void displayTotalProductsSold() {

        System.out.println("Products sold in total: " + totalProductsSold);

    }

    public void calculateTotalValue() {

        System.out.println("Value of all "+ name + " : " + quantity * price);

    }

    public void displayProductInfo() {

        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total value of product " + quantity * price);


    }


}
