package basics_of_oop.fifthTask.compostition_logic;

import basics_of_oop.fifthTask.composition_data.Composition;
import basics_of_oop.fifthTask.cover_data.Cover;
import basics_of_oop.fifthTask.flower_data.Flower;

public class CompositionLogic {
    private Composition composition;

    public CompositionLogic(Composition composition) {
        this.composition = composition;
    }

    public void add(Flower flower) {
        this.composition.getFlowers().add(flower);
    }

    public void delete(String name) {
        composition.getFlowers().removeIf(item -> item.getName().equals(name));
    }

    public void delete(String name, String color) {
        composition.getFlowers().removeIf(item -> item.getName().equals(name) && item.getColor().equals(color));
    }

    public void setCover(String color) {
        this.composition.setCover(new Cover(color));
    }
}
