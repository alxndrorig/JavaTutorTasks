package programming_with_classes.simplest_classes.ninthTask;

public class BookArray {
    private Book[] books;

    public BookArray(Book[] books) {
        this.books = books;
    }

    public Book getById(int number) {
        for (Book book :
                books) {
            if (number == book.getId()) return book;
        }
        System.out.println("ID not found!");
        return null;
    }

    public void showBooksByAuthor(String author) {
        StringBuilder builder = new StringBuilder();
        for (Book book : books) {
            if (author.equalsIgnoreCase(book.getAuthor())) {
                builder.append(book.toString()).append("\n");
            }
        }
        if (builder.length() == 0) System.out.println("Error! Matches not found!");
        else System.out.println(builder);;
    }

    public void showBooksByPublishingHouse(String publisher) {
        StringBuilder builder = new StringBuilder();
        for (Book book : books) {
            if (publisher.equalsIgnoreCase(book.getPublishingHouse())) builder.append(book).append("\n");
        }
        if (builder.length() == 0) System.out.println("Error! Matches not found!");
        else System.out.println(builder);
    }

    public void showBooksNewerThanYear(int year) {
        StringBuilder builder = new StringBuilder();
        for (Book book : books) {
            if (year < book.getYearOfPublication()) builder.append(book).append("\n");
        }
        if (builder.length() == 0) System.out.println("Error! Matches not found!");
        else System.out.println(builder);;
    }
}
