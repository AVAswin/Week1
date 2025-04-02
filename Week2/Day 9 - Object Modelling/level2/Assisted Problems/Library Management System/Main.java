class Main {
    public static void main(String[] args) {
        // Creating independent book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
 
        // Creating Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");
 
        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
 
        library2.addBook(book2); // Same book can exist in different libraries
        library2.addBook(book3);
 
        // Display books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}