package basics_of_oop.fourthTask.cave_runner;

import basics_of_oop.fourthTask.cave_data.Cave;
import basics_of_oop.fourthTask.treasure_data.Treasure;
import basics_of_oop.fourthTask.treasure_logic.Treasury;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    private static final ArrayList<Treasure> base = Treasury.getBase();

    public static void run() {
        openTreasury();
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        while (isActive) {
            System.out.println("""
                    --------------------------
                    1. Show all treasures here
                    2. Show the most expensive treasure
                    3. Select treasures for a given amount
                    0. Exit
                    --------------------------""");
            switch (scanner.nextInt()) {
                case 1 -> showCollection();
                case 2 -> System.out.println(mostExpensiveTreasure());
                case 3 -> selectTreasures();
                case 0 -> isActive = false;
            }
        }
    }

    private static void openTreasury() {
        Treasury treasury = new Treasury();
        Cave.treasury = treasury;
        treasury.fill();
        System.out.println("Treasury is opened");
    }

    private static void showCollection() {
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        int counter = 99;
        System.out.println(base.get(counter));

        while (isActive) {
            System.out.println("""
                    1. Next treasure
                    2. Previous treasure
                    3. Exit""");

            switch (scanner.nextInt()) {
                case 1 -> {
                    if (counter == base.size() - 1) {
                        counter = 0;
                    } else {
                        counter++;
                    }
                    System.out.println(base.get(counter));
                }
                case 2 -> {
                    if (counter == 0) {
                        counter = base.size() - 1;
                    } else {
                        counter--;
                    }
                    System.out.println(base.get(counter));
                }
                case 3 -> isActive = false;
            }
        }
    }

    private static Treasure mostExpensiveTreasure() {
        int maxPrice = base.get(0).getPrice();
        for (Treasure item :
                base) {
            if (item.getPrice() > maxPrice) maxPrice = item.getPrice();
        }
        System.out.println("The most expensive treasure in this cave: ");
        for (Treasure item :
                base) {
            if (item.getPrice() == maxPrice) return item;
        }
        return base.get(0);
    }

    private static void selectTreasures() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount:");
        int amount = Math.abs(scanner.nextInt());
        System.out.println("For the amount " + amount + " you can get:");
        ArrayList<Treasure> selectedTreasures = new ArrayList<>();
        for (Treasure item :
                base) {
            if (amount - item.getPrice() >= 0) {
                selectedTreasures.add(item);
                amount -= item.getPrice();
            }
        }
        System.out.println(selectedTreasures.size() + " treasures");
        if (selectedTreasures.size() > 0) {
            System.out.println(selectedTreasures);
        }
    }
}
