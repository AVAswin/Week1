import java.util.ArrayList;
import java.util.List;

// Library class (Aggregates Books)
class Library {
    private String name;
    private List<Book> books; // Aggregation: Library has multiple books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}



