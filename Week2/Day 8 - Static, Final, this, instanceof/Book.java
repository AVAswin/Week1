class Book {
    static String libraryName;
    static int totalBooks = 0;

    public final String isbn;
    public String title;
    public String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public void displayLibraryName() {
        System.out.println("library Name: " + libraryName);
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
