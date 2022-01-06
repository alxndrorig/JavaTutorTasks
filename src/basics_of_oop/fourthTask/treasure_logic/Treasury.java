package basics_of_oop.fourthTask.treasure_logic;

import basics_of_oop.fourthTask.treasure_data.Treasure;

import java.util.ArrayList;

public class Treasury {
    private static ArrayList<Treasure> base = new ArrayList<>(100);

    public void fill() {
        for (int i = 0; i < 100; i++) {
            base.add(Treasure.getTreasureById((i + 1), (int) (Math.random() * 10)));
        }
    }

    public static ArrayList<Treasure> getBase() {
        return base;
    }
}
