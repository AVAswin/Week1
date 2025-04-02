class Book {
    static int totalBooks = 0;
    private String title;
    private String author;
    private int price;
    private Boolean availability;

    Book() {
        title = "NA";
        author = "NA";
        price = 0;
        totalBooks++;
        availability = true;
    }

    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
        totalBooks++;
        availability = true;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void totalBooksCreated() {
        System.out.println("Total Books Created: " + totalBooks);
    }

    public void borrow() {
        if(availability) {
            availability = false;
            System.out.println(this.title + " : Borrowed book sucessfully");
        } else {
            System.out.println(this.title + " : Not Available");
        }
    }

    public void returnBook() {
        availability = true;
        System.out.println(this.title + " is returned sucessfully");
    }

    public void isAvailable() {
        if(availability) {
            System.out.println(this.title + " : Book is available");
        } else {
            System.out.println(this.title + " : Book is Not Available");
        }
    }
}