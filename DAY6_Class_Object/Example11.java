import java.util.ArrayList;
import java.util.List;

// Author class
class Author {
    private String name;
    private String nationality;

    Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }
    @Override
    public String toString() {
        return name + " (" + nationality + ")";
    }
}
// Book class
class Book {
    private String title;
    private Author author;   // Aggregation (Book "has an" Author)
    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}
// Library class
class Library {
    private String name;
    private List<Book> books;   // Aggregation (Library "has" many Books)
    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void showBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}
// Main class
public class Example11 {
    public static void main(String[] args) {
        // Authors
        Author a1 = new Author("J.K. Rowling", "British");
        Author a2 = new Author("George R.R. Martin", "American");
        Author a3 = new Author("Chetan Bhagat", "Indian");
        // Books
        Book b1 = new Book("Harry Potter and the Sorcerer's Stone", a1);
        Book b2 = new Book("Game of Thrones", a2);
        Book b3 = new Book("Five Point Someone", a3);
        // Library
        Library lib = new Library("City Central Library");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        // Display books in the library
        lib.showBooks();
    }
}
