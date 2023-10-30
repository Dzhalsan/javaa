package Day26.LibraryManagement;

public class Student {

    String name;
    int age;
    String gender;
    Book currentlyReading;

    public Student(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender =gender;

    }

    public void startReading (Book book) {

        if ( book.isAvailable == false) {
            System.out.println(name + " can't read " + book.title + " beacuse its occupied");
        }
        else if (currentlyReading == null) {
            currentlyReading = book ;
            currentlyReading.isAvailable = false;
            System.out.println(name + " started reading " + currentlyReading.title);

        }
        else System.out.println(name + "first need to finish "+ currentlyReading.title);
    }

    public void stopReading () {

        if (currentlyReading != null) {
            currentlyReading = null;
            currentlyReading.isAvailable = true;
            System.out.println(currentlyReading.title + " is available now ");
        }
        else System.out.println(name + " doesn't have a book to read ");


    }

}
