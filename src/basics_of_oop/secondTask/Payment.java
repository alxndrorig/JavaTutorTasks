package basics_of_oop.secondTask;

import java.util.ArrayList;

public class Payment {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void add(Product item) {
        products.add(item);
    }

    public static int getTotalAmount() {
        int sum = 0;
        for (Product item :
                products) {
            sum += item.getPrice();
        }
        return sum;
    }

    public static void add(String name, int price) {
        products.add(new Product(name, price));
    }

    public static class Product {
        private final String name;
        private final int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " " + price + "$";
        }
    }
}
