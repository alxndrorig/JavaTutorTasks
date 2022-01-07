package programming_with_classes.simplest_classes.eighthTask;

import java.util.Arrays;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счёта.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class CustomerArrays {

    private Customer[] customers;

    public CustomerArrays(Customer[] customers) {
        this.customers = customers;
    }

    public void sortByAlphabet() {
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if (!customers[i].getSurname().equalsIgnoreCase(customers[j].getSurname())) {
                    Customer[] sorted = sortSurname(customers[i], customers[j]);
                    customers[i] = sorted[0];
                    customers[j] = sorted[1];
                } else if (!customers[i].getName().equalsIgnoreCase(customers[j].getName())) {
                    Customer[] sorted = sortName(customers[i], customers[j]);
                    customers[i] = sorted[0];
                    customers[j] = sorted[1];
                } else if (!customers[i].getPatronymic().equalsIgnoreCase(customers[j].getPatronymic())) {
                    Customer[] sorted = sortPatronymic(customers[i], customers[j]);
                    customers[i] = sorted[0];
                    customers[j] = sorted[1];
                } else if (customers[i].getId() > customers[j].getId()) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }
        showCustomers(customers);
    }

    private static Customer[] sortPatronymic(Customer customer1, Customer customer2) {
        String a = customer1.getPatronymic().toLowerCase();
        String b = customer2.getPatronymic().toLowerCase();
        String[] array = new String[] {a, b};
        Arrays.sort(array);
        if (array[0].equalsIgnoreCase(customer1.getPatronymic())) return new Customer[] {customer1, customer2};
        else return new Customer[] {customer2, customer1};
    }

    private static Customer[] sortName(Customer customer1, Customer customer2) {
        String a = customer1.getName().toLowerCase();
        String b = customer2.getName().toLowerCase();
        String[] array = new String[] {a, b};
        Arrays.sort(array);
        if (array[0].equalsIgnoreCase(customer1.getName())) return new Customer[] {customer1, customer2};
        else return new Customer[] {customer2, customer1};
    }


    private static void showCustomers(Customer[] customers) {
        for (Customer customer :
                customers) {
            System.out.println(customer + "\n");
        }
    }

    public void sortByCardInterval(long start, long end) {
        for (Customer customer: customers) {
            if ((customer.getCardNumber() >= start) && (customer.getCardNumber() <= end)) {
                System.out.println(customer);
            }
            System.out.println();
        }
    }

    private static Customer[] sortSurname(Customer customer1, Customer customer2) {
        String a = customer1.getSurname().toLowerCase();
        String b = customer2.getSurname().toLowerCase();
        String[] array = new String[] {a, b};
        Arrays.sort(array);
        if (array[0].equalsIgnoreCase(customer1.getSurname())) return new Customer[] {customer1, customer2};
        else return new Customer[] {customer2, customer1};
    }

    public Customer getById(int number) {
        for (Customer customer: customers) {
            if (number == customer.getId()) return customer;
        }
        System.out.println("ID not found!");
        return null;
    }
}
