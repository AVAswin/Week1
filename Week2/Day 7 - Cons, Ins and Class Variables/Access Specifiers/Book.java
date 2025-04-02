class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String s1, String s2, String s3) {
        ISBN = s1;
        title = s2;
        author = s3;
    }

    public void getAuthor() {
        System.out.println("Author: " + author);
    }

    public void setAuthor(String s) {
        author = s;
    }
}

class EBook extends Book {
    EBook(String s1, String s2, String s3) {
        super(s1, s2, s3);
    }
}