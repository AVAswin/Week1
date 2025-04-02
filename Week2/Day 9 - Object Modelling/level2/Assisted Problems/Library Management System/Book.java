import java.util.ArrayList;
import java.util.List;

// Book class (Independent Entity)
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}
