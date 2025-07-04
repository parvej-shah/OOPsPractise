import Models.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        // Creating 4 Book objects
        Book b1 = new Book("Clean Code", "Robert C. Martin", "9780132350884");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Book b3 = new Book("Design Patterns", "Erich Gamma", "9780201633610");
        Book b4 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978024");
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        // Print each book info
        System.out.println("Before Sorting:\n");
        for (Book b : books) {
            System.out.println(b);
        }
        Collections.sort(books);
        System.out.println("\nAfter Sorting by Title:\n");
        for (Book b : books) {
            System.out.println(b);
        }
        // Print the total number of books created
        System.out.println("\nTotal books created: " + Book.getTotalBooksCreated());
    }
}
