package homework_13.library;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Castle", "Kafka",
                "Knopf", 1926, "978-08052");
        Book book2 = new Book("Java", "Nakov",
                "?", 2017, "567-08052");
        Book book3 = new Book("C#", "Nakov",
                "?", 2017, "456-08052");
        Book book4 = new Book("Siddhartha", "Hesse",
                "New Directions", 1922, "241-3463-23");
        Book book5 = new Book("Python", "Nakov",
                "?", 2017, "456-08052");

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);

        library.display();

        for(int i = 0; i < library.getListOfBooks().size(); i++){
            if(library.getListOfBooks().get(i).getAuthor().equals("Nakov")){
                library.deleteBook(library.getListOfBooks().get(i));
                i--;
            }
        }

        System.out.println("=======After Deleting \"Nakov\"=======");
        library.display();
    }
}
