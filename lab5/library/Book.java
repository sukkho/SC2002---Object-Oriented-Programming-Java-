package lab5.library;

public class Book implements Searchable {
    private final String title;
    private final String author;
    private final Genre genre;
    private final int publicationYear;

    public Book(String title, String author, Genre genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() { return author; }
    public Genre getGenre() { return genre; }
    public int getPublicationYear() { return publicationYear; }

    @Override public String getTitle() { return title; }

    @Override public String getDescription() {
        return author + " " + title;
    }

    @Override public String toString() {
        return String.format("{\"title\": \"%s\", \"author\": \"%s\", \"genre\": \"%s\", \"publicationYear\": %d}", title, author, genre, publicationYear);
    }
}
