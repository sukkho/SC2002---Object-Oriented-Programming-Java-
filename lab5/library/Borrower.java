package lab5.library;
import java.util.*;

public class Borrower {
    private final String name;
    private final List<Book> borrowedBooks = new ArrayList<>();

    //constructor
    public Borrower(String name) {
        this.name = name;
    }

    //get methods
    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public boolean borrow(Book b) {
        if (b == null) return false;
        if (!borrowedBooks.contains(b)) {
            borrowedBooks.add(b);
            return true;
        }
        return false;
    }

    public boolean returnBook(String title) { //make sure title is in the library 
        return borrowedBooks.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
    }

    @Override public String toString() { 
        List<String> titles = borrowedBooks.stream().map(Book::getTitle).toList();
        return String.format("{\"name\": \"%s\", \"borrowedBooks\": %s}", name, titles);
    }
}
