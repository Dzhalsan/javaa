package D30.Store;

public class ShoppingMain {
    public static void main(String[] args) {

        Product waterBottles = new Product("Bottled water", 3.99, 48);
        Product bananas = new Product("Banana", 1.99, 12);
        Product milk = new Product("Gal of milk", 3.99, 2);
        Product chicken = new Product("Chicken thighs", 8.99, 5);

        ShoppingCart myShoppingCart = new ShoppingCart();

        myShoppingCart.add(waterBottles);
        myShoppingCart.add(bananas);
        myShoppingCart.add(milk);
        myShoppingCart.add(chicken);

        myShoppingCart.displayProducts();

        myShoppingCart.calculateTotalPrice();

        myShoppingCart.removeProduct(waterBottles);

        myShoppingCart.calculateTotalPrice();


    }
}
