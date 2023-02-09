import java.util.*;

public class Library {
    public static void main(String[] args) {
        List<Books> books = Books.getBookList(10);

        System.out.println("Books:");
        books.stream().forEach(System.out::println);

        System.out.println("Number of books with 5 letter names: " + books.stream().filter(book -> book.getName().length() == 5).count());
        System.out.println("Books with prices below 30:");
        books.stream().filter(book -> book.getPrice() <= 30).forEach(System.out::println);
        System.out.println("Book names:");
        books.stream().map(Books::getName).forEach(System.out::println);

        System.out.println("Total price: " + books.stream().mapToInt(Books::getPrice).sum());

        System.out.println("Book names starting with A:");
        books.stream().map(Books::getName).filter(name -> name.startsWith("A") || name.startsWith("a")).forEach(System.out::println);

        System.out.println("Book with highest price: " + books.stream().max(Comparator.comparing(Books::getPrice)).get().getName());

        System.out.println("Number of books with 5 letter names: " + books.stream().filter(book -> book.getName().length() == 5).count());
        System.out.println("Books with prices below 30:");
        books.stream().filter(book -> book.getPrice() <= 30).forEach(System.out::println);

        System.out.println("Task 2: ");
        Books book1 = new Books("Little women", 5);
        Books book2 = new Books("Little women2", 5);

        Map<Books, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "Harry Potter");
        mapWithBook.put(book2, "Harry Potter2");
        System.out.println(book1 + mapWithBook.get(book2));
    }
}