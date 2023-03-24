package homework_13.library;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private String ISBN;

    public Book(String title, String author, String publisher, int yearOfPublishing, String ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getPublisher() {
        return publisher;
    }

    public boolean equals(Book book){
        return this.getYearOfPublishing() == book.getYearOfPublishing() &&
                this.getISBN().equals(book.getISBN()) &&
                this.getPublisher().equals(book.getPublisher()) &&
                this.getAuthor().equals(book.getAuthor()) &&
                this.getTitle().equals(book.getTitle());
    }
}
