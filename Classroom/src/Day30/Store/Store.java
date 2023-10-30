package Day30.Store;

import java.util.ArrayList;

public class Store {
    String name;
    String address;
    String city;
    String state;
    int postalCode;

    ArrayList<Item> inventory = new ArrayList<>();

    public Store (String name, String address, String city, String state, int postalCode) {

        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;

    }

    public void addItem (Item item) {

        System.out.println("------------");
        item.id = inventory.size()+1;

        if (inventory.add(item)) {
            System.out.println(inventory.size());
            System.out.println("Store: "+name);
            System.out.println(item.name + " is added to the inventory!");
            System.out.println("Price: "+ item.price + "$, Quantity: " + item.quantity);
            System.out.println("-----------------------");
        }

    }

    public void displayItems () {

        System.out.println("Displaying all items");
        for (Item element:
             inventory) {
            element.displayItem();
        }

    }
}
