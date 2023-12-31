package Day32;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Phonebook {
    HashMap<String, String> phonebook = new HashMap<>();


    public void addContact(String name, String phoneNumber) {
        //write code which will add new contact to phonebook hashmap
        //then print contact added successfully
        phonebook.put(name, phoneNumber);
        System.out.println(name + " was added successfully");
    }

    public void removeContact(String name) {
        //write a code which will delete contact by either name
        //delete the contact by user provided name
        //print contact removed successfully
        if (phonebook.containsKey(name)) {
            phonebook.remove(name);
            System.out.println(name + " was removed!");
        } else {
            System.out.println(name + " was not found!");
        }
    }


    public void updateContactsName(String oldName, String newName) {
        //write a code which will update name of the contact
        if (phonebook.containsKey(oldName)) {
            phonebook.put(newName,phonebook.get(oldName));
            phonebook.remove(oldName);
        }
        else {
            System.out.println(oldName + " was not found");
        }

    }

    public void updateContactsPhoneNumber(String name, String newNumber) {
        //write a code which will update phone number of the contact
        if (phonebook.containsKey(name)) {
            phonebook.replace(name, newNumber);
        }
        else {
            System.out.println(name + " was not found");
        }
    }

    public void searchForContact(String name) {
        //write a code which prints the phone number of the given name
        //print error message if the contact doesn't exist
        if (phonebook.containsKey(name)) {
            System.out.println(name + " is present!");
            System.out.println(phonebook.get(name));
        } else {
            System.out.println(name + " was not found!");
        }

    }

    public void printPhoneBookMap() {
        // print with for-each all keys and values of phoneBook map
        for (Map.Entry<String, String> i : phonebook.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }

    public static void main(String[] args) {
        /*
        write a code that will produce following output:

        Welcome to the phonebook!

        Create a phonebook object

        Using scanner read these values from keyboard
        Enter name: John
        Enter phone number: 123-456-7890
        Call method phonebook.addContact() give as parameters name and phoneNumber

        Using scanner read these values from keyboard
        Enter name: Mike
        Enter phone number: 123-654-0987
        Call method phonebook.addContact() give as parameters name and phoneNumber


        Enter name: John
        Call method phonebook.searchForContact() give as parameter name


        Call method phonebook.printPhoneBookMap()
        It must print 2 entries


        Enter old name: John
        Enter new name: Andrew
        Call method updateContactsName() give as parameters oldName and newName

        Enter contact name: Andrew
        Enter new phoneNumber: 535-996-7890
        Call method updateContactsPhoneNumber() give as parameters name and newNumber


        Call method phonebook.printPhoneBookMap()
        One entry must be fully changed and the other should not be updated


        Enter name: Andrew
        Call method phoneBook.removeContact() give as parameter name


         Call method phonebook.printPhoneBookMap()
         There must be only one entry
         */
        System.out.println("Welcome to the phoneBook");
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        phonebook.addContact(name, phoneNumber);

        System.out.print("Enter name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber1 = scanner.nextLine();
        phonebook.addContact(name1, phoneNumber1);

        System.out.print("Enter name: ");
        String name2 = scanner.nextLine();
        phonebook.searchForContact(name2);

        phonebook.printPhoneBookMap();

        System.out.print("Enter old name: ");
        String oldName = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        phonebook.updateContactsName(oldName, newName);

        phonebook.printPhoneBookMap();

        System.out.print("Enter name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter new phoneNumber: ");
        String phoneNumber3 = scanner.nextLine();
        phonebook.updateContactsPhoneNumber(name3, phoneNumber3);

        phonebook.printPhoneBookMap();

        System.out.print("Enter name: ");
        String name4 = scanner.nextLine();
        phonebook.removeContact(name4);

        phonebook.printPhoneBookMap();

    }

}