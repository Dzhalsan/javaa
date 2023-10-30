package D24A1;

public class Product {
    String name;
    double price;
    int quantity;

    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product (String newName, double newPrice){
        name = newName;
        price = newPrice;
        quantity = 1;
    }

    public  Product (String name){
        this.name = name;
        price = 0;
        quantity =0;
    }

    public void displayProduction(){
        System.out.println(name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity+" ;");
        System.out.println();
    }

}


