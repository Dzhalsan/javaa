package D26.A2;

public class BankCustomer {

    String name;
    double balance;
    boolean isVIP;
    static int totalCustomers;

    public BankCustomer(String name, double balance, boolean isVIP) {

        this.name = name;
        this.balance = balance;
        this.isVIP = isVIP;
        totalCustomers++;

    }

    public static void displayTotalCustomers() {

        System.out.println();
        System.out.println("Total customers: " + totalCustomers);

    }

    public void deposit(double fundsAdd) {

        balance += fundsAdd;

    }

    public  void withdraw(double fundsOut) {

        if (balance>fundsOut) balance -= fundsOut;
        else {
            System.out.println();
            System.out.println("Declined. Insufficient balance");
        }

    }

    public void displayCustomerInfo() {

        System.out.println();
        System.out.println("Customer's name: " + name);
        System.out.println("Customer's balance: " + balance);
        if (isVIP) System.out.println(name + " is VIP");
        else System.out.println(name + " is not VIP");

    }




}
