package homework_13.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> listOfBooks = new ArrayList<>();



    public Book search(String title, String author){
        for (Book b: listOfBooks) {
            if(b.getAuthor().equals(author) && b.getTitle().equals(title))
                return b;
        }
        return null;
    }

    public void add(Book book){
        if(!listOfBooks.contains(book))
            listOfBooks.add(book);
    }

    public void display(){
        for (Book book: listOfBooks) {
            System.out.println("Title -> " + book.getTitle());
            System.out.println("Author -> " + book.getAuthor());
            System.out.println("Publisher -> " + book.getPublisher());
            System.out.println("Year of Publishing -> " + book.getYearOfPublishing());
            System.out.println("ISBN -> " + book.getISBN());
            System.out.println("=============");
        }
    }

    public void deleteBook(Book book){
        listOfBooks.remove(book);
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }
}
