package lab5;
import lab5.library.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Library<Searchable> lib = new Library<>();

        lib.add(new Book("1984", "George Orwell", Genre.FICTION, 1949));
        lib.add(new Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE, 1988));

        runLabTests(lib);
        interactiveMenu(lib);
    }

    private static void runLabTests(Library<Searchable> lib) {
        System.out.println("\n=== AUTO TESTS ===");
        System.out.println("Library contains " + lib.getAll().size() + " books.");

        System.out.println("\nFilter by Genre: Fiction");
        Demo.filterByGenre(lib, Genre.FICTION).forEach(System.out::println);

        System.out.println("\nFilter by Author: Stephen Hawking");
        Demo.filterByAuthor(lib, "Stephen Hawking").forEach(System.out::println);

        System.out.println("\nSearch by keyword: Time");
        Demo.searchByKeyword(lib, "Time").forEach(System.out::println);

        Book abm = new Book("A Beautiful Mind", "Sylvia Nasar", Genre.BIOGRAPHY, 1998);
        lib.add(abm);
        List<Book> allBooks = lib.getAll().stream()
                                 .filter(b -> b instanceof Book)
                                 .map(b -> (Book) b)
                                 .toList();
        System.out.println("\nSorted by Title:");
        Demo.sortBooksByTitle(allBooks).forEach(b -> System.out.println("\"" + b.getTitle() + "\""));

        System.out.println("\nRecommendation (Science):");
        System.out.println(Demo.recommendBook("Science"));

        Borrower alice = new Borrower("Alice");
        Book b1984 = allBooks.stream().filter(b -> b.getTitle().equals("1984")).findFirst().orElse(null);
        if (b1984 != null) alice.borrow(b1984);
        System.out.println("\nBorrower after borrowing 1984:\n" + alice);
        alice.returnBook("1984");
        System.out.println("Borrower after returning 1984:\n" + alice);
    }

    private static void interactiveMenu(Library<Searchable> lib) {
        Scanner sc = new Scanner(System.in);
        String menu = """
            \n=== MENU ===
            1) List all books
            2) Add a book
            3) Filter by genre
            4) Filter by author
            5) Search by keyword
            6) Recommend by category
            0) Exit
            """;
        while (true) {
            System.out.println(menu);
            System.out.print("Choice: ");
            String c = sc.nextLine().trim();
            switch (c) {
                case "1" -> Demo.printAllBooks(lib);
                case "2" -> addBook(lib, sc);
                case "3" -> { System.out.print("Genre: "); Genre g = Genre.fromString(sc.nextLine());
                    if (g != null) Demo.filterByGenre(lib, g).forEach(System.out::println);
                    else System.out.println("Invalid genre."); }
                case "4" -> { System.out.print("Author: "); Demo.filterByAuthor(lib, sc.nextLine()).forEach(System.out::println); }
                case "5" -> { System.out.print("Keyword: "); Demo.searchByKeyword(lib, sc.nextLine()).forEach(System.out::println); }
                case "6" -> { System.out.print("Category: "); System.out.println(Demo.recommendBook(sc.nextLine())); }
                case "0" -> { System.out.println("Bye!"); return; }
                default -> System.out.println("Unknown choice.");
            }
        }
    }

    private static void addBook(Library<Searchable> lib, Scanner sc) {
        System.out.print("Title: "); String title = sc.nextLine();
        System.out.print("Author: "); String author = sc.nextLine();
        System.out.print("Genre: "); Genre g = Genre.fromString(sc.nextLine());
        System.out.print("Year: "); int year = safeInt(sc.nextLine(), 2000);
        if (g == null) System.out.println("Invalid genre.");
        else { lib.add(new Book(title, author, g, year)); System.out.println("Added!"); }
    }

    private static int safeInt(String s, int fallback) {
        try { return Integer.parseInt(s.trim()); } catch (Exception e) { return fallback; }
    }
}
