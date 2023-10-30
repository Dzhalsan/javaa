package D26.A2;

public class TestBankCustomer {
    public static void main(String[] args) {

        BankCustomer c1 = new BankCustomer("Customer1", 122343.25,false);
        BankCustomer c2 = new BankCustomer("Customer2", 677888.12,true);
        BankCustomer c3 = new BankCustomer("Customer3", 234.1,true);
        BankCustomer c4 = new BankCustomer("Customer4", 1356.0,false);

        BankCustomer.displayTotalCustomers();

        c1.deposit(22.2);
        c1.withdraw(256345);

        c2.deposit(2299.2);
        c2.withdraw(25);

        c3.deposit(256345);
        c3.withdraw(256);

        c4.deposit(1000);
        c4.withdraw(789);

        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
        c3.displayCustomerInfo();
        c4.displayCustomerInfo();




    }
}
