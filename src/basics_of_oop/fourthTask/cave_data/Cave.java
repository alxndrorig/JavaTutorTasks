package basics_of_oop.fourthTask.cave_data;

import basics_of_oop.fourthTask.cave_runner.Runner;
import basics_of_oop.fourthTask.treasure_logic.Treasury;

import java.util.Random;
import java.util.Scanner;

public class Cave {
    private final String name;
    public static Treasury treasury;

    public Cave() {
        Random random = new Random();
        this.name = "Dragon's cave № " + random.nextInt(1000);
    }

    public void research() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to start research? Y/N");
        switch (scanner.next()) {
            case "Y", "y" -> {
                System.out.println("Welcome to " + this);
                Runner.run();
            }
            case "N", "n" -> System.out.println("Research is ended for you!");
            default -> System.out.println("Invalid key!");
        }
    }


    @Override
    public String toString() {
        return name;
    }
}
