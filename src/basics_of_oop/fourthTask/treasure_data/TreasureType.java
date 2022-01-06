package basics_of_oop.fourthTask.treasure_data;

public enum TreasureType {
    Platinum(0, "Platinum", 120),
    Diamond(1, "Diamond", 100),
    Gold(2, "Gold", 80),
    Silver(3, "Silver", 60),
    Bronze(4, "Bronze", 40),
    Iron (5, "Iron", 20),
    Copper(6, "Copper", 10);

    private int id;
    private String name;
    private int price;

    TreasureType(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    static TreasureType getType (int number) {
        for (TreasureType type :
                TreasureType.values()) {
            if (number == type.getId()) return type;
        }
        return Copper;
    }
}
