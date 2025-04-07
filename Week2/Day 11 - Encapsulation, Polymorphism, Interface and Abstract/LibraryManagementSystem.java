// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}   

// Abstract class for common properties
abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private String borrowerName = null;
    private boolean isAvailable = true;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        if (!isAvailable) {
            System.out.println("Borrowed by: " + borrowerName);
        }
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println();
    }

    // Encapsulation: Reserve logic
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println(title + " has been reserved for " + borrowerName + ".");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }

    // Optional: Method to return the item
    public void returnItem() {
        isAvailable = true;
        borrowerName = null;
        System.out.println(title + " has been returned.");
    }
}

// Book subclass
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks
    }
}

// Magazine subclass
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }
}

// DVD subclass
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days
    }
}

// Driver class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Polymorphic references
        LibraryItem[] items = {
            new Book("B001", "The Alchemist", "Paulo Coelho"),
            new Magazine("M001", "National Geographic", "NatGeo Team"),
            new DVD("D001", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
        }

        // Reserve a book
        items[0].reserveItem("Alice");
        items[0].getItemDetails();

        // Try reserving it again
        items[0].reserveItem("Bob");

        // Return the book
        items[0].returnItem();
        items[0].getItemDetails();
    }
}
