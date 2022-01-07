package programming_with_classes.simplest_classes.ninthTask;

import java.util.Scanner;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublication;
    private int numberOfPages;
    private int price;
    private String bindingType;


    public Book(int id, String title, String author, String publishingHouse, int yearOfPublication, int numberOfPages, int price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book \"" + title + "\"\nID: " + id + "\nAuthor: " + author + "\nPublishing house: " + publishingHouse + "\nYear of publication: " + yearOfPublication +
                "\nNumber of pages: " + numberOfPages + "\nBinding type: " + bindingType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Make your choice:
                1. Id
                2. Title
                3. Author
                4. Publishing house
                5. Year of publication
                6. Number of pages
                7. Price
                8. Binding type
                9. Full information
                10. Exit""");
        switch (scanner.next()) {
            case "1":
                System.out.println("ID = " + this.id);
                break;
            case "2":
                System.out.println("Title" + this.title);
                break;
            case "3":
                System.out.println("Author: " + this.author);
                break;
            case "4":
                System.out.println("Publishing house: " + this.publishingHouse);
                break;
            case "5":
                System.out.println("Year of publication: " + this.yearOfPublication);
                break;
            case "6":
                System.out.println("Number of pages: " + this.numberOfPages);
                break;
            case "7":
                System.out.println("Price: " + this.price);
                break;
            case "8":
                System.out.println("Binding type: " + this.bindingType);
                break;
            case "9":
                System.out.println(this);
            case "10":
                break;
            default:
                System.out.println("Error!");
        }
    }
}
