package programming_with_classes.simplest_classes.ninthTask;

public class Main {
    public static void main(String[] args) {
        BookArray baseBooks = new BookArray(new Book[] {
                new Book(1, "Harry Potter and the Philosopher's Stone", "Rowling",
                "Machaon", 2021, 432, 508, "Hardcover"),
                new Book(2, "Lord of the Rings. Return of King", "Tolkien",
                        "AST Publishing House", 2018, 448, 371, "Hardcover"),
                new Book(3, "The Chronicles of Narnia", "Baines",
                        "Publishing house \"Eksmo\"", 2017, 912,1113, "Hardcover"),
                new Book(4, "The Thorn Birds", "McCullough",
                        "Fiction. Moscow", 1990, 622, 669, "Hardcover")
        });
        baseBooks.showBooksByAuthor("Baines");
        baseBooks.showBooksByPublishingHouse("Machaon");
        baseBooks.showBooksNewerThanYear(2000);
    }
}
