package lab5.library;
import java.util.*;
import java.util.stream.Collectors;

//this class will handle the logic
public class Demo {
    public static List<Book> filterByGenre(Library<Searchable> lib, Genre genre) {
        return lib.filter(i -> (i instanceof Book b) && b.getGenre() == genre)
                  .stream().map(i -> (Book) i).toList();
    }

    public static List<Book> filterByAuthor(Library<Searchable> lib, String author) {
        String a = author.toLowerCase();
        return lib.filter(i -> (i instanceof Book b) && b.getAuthor().toLowerCase().equals(a))
                  .stream().map(i -> (Book) i).toList();
    }

    public static List<Searchable> searchByKeyword(Library<Searchable> lib, String keyword) {
        return lib.filter(i -> i.containsKeyword(keyword));
    }

    public static String recommendBook(String category) {
        Genre g = Genre.fromString(category);
        return switch (g) {
            case SCIENCE -> "Try 'A Brief History of Time' by Stephen Hawking.";
            case FICTION -> "Try '1984' by George Orwell.";
            case BIOGRAPHY -> "Try 'A Beautiful Mind' by Sylvia Nasar.";
            case HISTORY -> "Try 'Guns, Germs, and Steel' by Jared Diamond.";
            case FANTASY -> "Try 'The Hobbit' by J.R.R. Tolkien.";
            case TECHNOLOGY -> "Try 'Clean Code' by Robert C. Martin.";
            default -> "No recommendation available for that category.";
        };
    }

    public static void printAllBooks(Library<Searchable> lib) {
        for (Searchable s : lib.getAll()) {
            if (s instanceof Book b) System.out.println(b);
        }
    }

    public static List<Book> sortBooksByTitle(Collection<Book> books) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
}
