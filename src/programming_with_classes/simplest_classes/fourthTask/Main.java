package programming_with_classes.simplest_classes.fourthTask;


public class Main {

    private static Train[] getTrains() {
        Train[] trains = new Train[] {
                new Train("Minsk", 642, "12:05"),
                new Train("Moscow", 749, "06:20"),
                new Train("Vitebsk", 610, "08:46"),
                new Train("Minsk", 55, "09:12"),
                new Train("St. Petersburg", 83, "19:34")
        };
        return trains;
    }

    public static void main(String[] args) {
        Train[] trains = getTrains();
        TrainsArrays.sortByNumber(trains);
        TrainsArrays.findByNumber(trains);
        TrainsArrays.sortByDestination(trains);
    }
}
