package basics_of_oop.fifthTask;

import basics_of_oop.fifthTask.composition_data.Composition;
import basics_of_oop.fifthTask.compostition_logic.CompositionLogic;
import basics_of_oop.fifthTask.flower_data.*;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Rose("Green");
        Flower lily = new Lily("Orange");
        Flower pion = new Pion("Pink");
        Flower chrysanthemum = new Chrysanthemum("White");
        Flower tulip = new Tulip("Yellow");

        Composition composition = new Composition();
        CompositionLogic logic = new CompositionLogic(composition);

        logic.add(rose);
        logic.add(lily);
        logic.add(pion);
        logic.add(chrysanthemum);
        logic.add(tulip);

        System.out.println(composition);

        logic.delete("Lily");

        System.out.println(composition);

        logic.setCover("Blue");
    }
}
