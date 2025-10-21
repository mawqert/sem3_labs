package lab3;

public class Book {
    private final String title;
    private final String author;
    private final int count;

    public Book(int count, String title, String author) {
        this.count = count;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return author + ": " + title;
    }
}
