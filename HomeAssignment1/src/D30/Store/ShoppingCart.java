package D30.Store;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> cart = new ArrayList<>();

    public void add(Product product) {

        System.out.println("-----------Adding product-----------");
        cart.add(product);
        System.out.println(product.name + " was successfully added");

    }

    public void displayProducts() {

        System.out.println("-----------Displaying products-----------");
        for (Product element:
             cart) {
            System.out.print(element.name + " ");
            System.out.print( "$" + element.price + " , ");
            System.out.println("Amount:" + element.quantity);
        }

    }

    public void removeProduct(Product product) {

        System.out.println("-----------Removing " + product.name + " -----------");

        if (cart.remove(product)) System.out.println(product.name + " was removed from the cart");
        else System.out.println(product.name + " is not in the cart");
    }

    public void calculateTotalPrice() {

        System.out.println("-----------Calculating total price-----------");

        double sum = 0;

        for (Product element:
             cart) {
            sum += (element.price * (double) element.quantity);
        }

        System.out.println("Total price of cart is: " + sum + "$");

    }

}
