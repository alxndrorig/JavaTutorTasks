package basics_of_oop.fourthTask.treasure_data;

public class Treasure {
    private int number;
    private TreasureType type;
    private String name;
    private int price;

    public Treasure(int number, TreasureType type) {
        this.number = number;
        this.type = type;
        this.name = type.getName();
        this.price = type.getPrice();
    }

    public static Treasure getTreasureById(int number, int id) {
        return new Treasure(number, TreasureType.getType(id));
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "number=" + number +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
