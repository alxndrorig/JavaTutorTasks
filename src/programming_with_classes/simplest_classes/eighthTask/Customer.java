package programming_with_classes.simplest_classes.eighthTask;

import java.util.Scanner;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long cardNumber;
    private long bankAccountNumber;

    public Customer(int id, String surname, String name, String patronymic, String address, long cardNumber, long bankNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return String.format("Customer id = %d\nFull name: %s %s %s\nAddress: %s\nCard number: %d\nBank account number: %d", this.id, this.surname, this.name, this.patronymic, this.address, this.cardNumber, this.bankAccountNumber);
    }

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Make your choice:
                1. Id
                2. Name
                3. Surname
                4. Patronymic
                5. Full name
                6. Address
                7. Card number
                8. Bank account number
                9. Full information
                10. Exit""");
        switch (scanner.next()) {
            case "1":
                System.out.println("ID = " + this.id);
                break;
            case "2":
                System.out.println("Name: " + this.name);
                break;
            case "3":
                System.out.println("Surname: " + this.surname);
                break;
            case "4":
                System.out.println("Patronymic: " + this.patronymic);
                break;
            case "5":
                System.out.println("Full name: " + this.surname + " " + this.name + " " + this.patronymic);
                break;
            case "6":
                System.out.println("Address: " + this.address);
                break;
            case "7":
                System.out.println("Card number: " + this.cardNumber);
                break;
            case "8":
                System.out.println("Bank account number: " + this.bankAccountNumber);
                break;
            case "9":
                System.out.println(this.toString());
            case "10":
                break;
            default:
                System.out.println("Error!");
        }
    }
}
