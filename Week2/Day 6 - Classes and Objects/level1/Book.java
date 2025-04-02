import java.util.*;

public class Book {
    private String title;
    private String author;
    private int price;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}



