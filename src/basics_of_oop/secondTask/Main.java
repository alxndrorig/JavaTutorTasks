package basics_of_oop.secondTask;

public class Main {
    public static void main(String[] args) {
        Payment.Product juice = new Payment.Product("Pineapple Juice", 1);
        Payment.add(juice);
        Payment.add("Chocolate", 2);

        System.out.println(Payment.getTotalAmount());
    }
}
