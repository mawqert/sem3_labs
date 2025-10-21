package lab3;

import java.util.HashMap;

public class Library {
    private final HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String isbn, Book book) {
        books.put(isbn, book);
    }

    public Book findBook(String isbn) {
        return books.get(isbn);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }
    

}
