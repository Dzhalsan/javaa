package Day30.Store;

public class StoreMain {
    public static void main(String[] args) {

        Store fashionOutlet = new Store("Fashion Outlet", "5220 Fashion Outlet way", "Rosemont", "IL",
                60018);

        Item tShirt = new Item("T-SHIRT", 15, 50);
        Item pants = new Item("Pants", 25, 40);
        Item cap = new Item("Cap", 20, 30);


        tShirt.displayItem();

        fashionOutlet.addItem(tShirt);
        fashionOutlet.addItem(pants);
        fashionOutlet.addItem(cap);

        fashionOutlet.displayItems();
    }
}
