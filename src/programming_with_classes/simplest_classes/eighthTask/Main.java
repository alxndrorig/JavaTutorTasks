package programming_with_classes.simplest_classes.eighthTask;

public class Main {

    public static void main(String[] args) {

        CustomerArrays baseCustomers = new CustomerArrays(new Customer[] {
                new Customer(1, "Farmer", "Peter", "Davidovich", "Moscow City", 132432432, 3324432),
                new Customer(2, "Pittman", "Michael", "Maksimovich", "Los Angeles", 522027415, 7487484),
                new Customer(3, "Garcia", "Richard", "Denisovich", "New York", 419784241, 1748417)
        });

        baseCustomers.sortByAlphabet();
        baseCustomers.sortByCardInterval(12345678, 444444444);

        Customer customer = baseCustomers.getById(3);
        System.out.println(customer);
    }
}
