package lab5.library;

public interface Searchable {
    String getTitle();
    String getDescription();

    default boolean containsKeyword(String keyword) {
        if (keyword == null || keyword.isBlank()) return false;

        String k = keyword.toLowerCase();

        return (getTitle() != null && getTitle().toLowerCase().contains(k)) || (getDescription() != null && getDescription().toLowerCase().contains(k));
    }
}
