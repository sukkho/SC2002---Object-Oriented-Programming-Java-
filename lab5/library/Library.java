package lab5.library;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library<T extends Searchable> { //only allow items that are Searchable
    private final List<T> items = new ArrayList<>();

    private final Set<Genre> supportedGenres = Set.of( //immutable / read only
        Genre.FICTION, Genre.SCIENCE, Genre.BIOGRAPHY, Genre.HISTORY, Genre.FANTASY, Genre.TECHNOLOGY
    );

    public void add(T item) { items.add(item); }
    public boolean remove(T item) { return items.remove(item); }
    public List<T> getAll() { return Collections.unmodifiableList(items); }

    // for filtering
    public List<T> filter(Predicate<T> predicate) {
        return items.stream().filter(predicate).collect(Collectors.toList());
    }

    // to group all books by authors
    public Map<String, List<Book>> mapAuthorToBooks() {
        return items.stream()
                .filter(o -> o instanceof Book)
                .map(o -> (Book) o)
                .collect(Collectors.groupingBy(Book::getAuthor, LinkedHashMap::new, Collectors.toList()));
    }

    public Set<Genre> getSupportedGenres() { return supportedGenres; }
}
