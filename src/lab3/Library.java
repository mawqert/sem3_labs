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

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(10, "title", "author");
        Book book2 = new Book(10, "title", "author");
        Book book3 = new Book(10, "title", "author");
        Book book4 = new Book(10, "title", "author");
        library.addBook("1111111", book1);
        library.addBook("2222222", book2);
        library.addBook("3333333", book3);
        library.addBook("4444444", book4);

        System.out.println(library.findBook("1111111"));
    }
}
