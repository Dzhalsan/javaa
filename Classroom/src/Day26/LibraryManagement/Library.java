package Day26.LibraryManagement;

import java.util.Arrays;

public class Library {

    String name;
    int numberOfBooks = 0;
    Book[] books = new Book[4];

    public Library(String name) {

        this.name = name;

    }

    public void displayBooks(Book[] ex) {
        System.out.println(name+" has these books: ");
        for (int i = 0; i < ex.length; i++) {
            System.out.print(ex[i].title+" is available");
            System.out.println(" "+ex[i].isAvailable);
        }
    }

    public void addBook(Book book){


        if (numberOfBooks<books.length) {
            books[numberOfBooks] = book;
            book.isAvailable = true;
            System.out.print(books[numberOfBooks].author);
            System.out.println(books[numberOfBooks].title+" Sucesssfully added");
            numberOfBooks++;
            System.out.println(numberOfBooks);
        }
        else {
            System.out.println("No place to add "+book.title);
        }



    }
}
