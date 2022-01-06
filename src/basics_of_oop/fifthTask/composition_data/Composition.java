package basics_of_oop.fifthTask.composition_data;

import basics_of_oop.fifthTask.cover_data.Cover;
import basics_of_oop.fifthTask.flower_data.Flower;

import java.util.ArrayList;

public class Composition {
    private ArrayList<Flower> flowers = new ArrayList<>();
    private Cover cover;

    public Composition() {
    }


    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "flowers=" + flowers +
                ", cover=" + cover +
                '}';
    }
}
