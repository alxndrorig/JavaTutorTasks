package programming_with_classes.aggragation_and_composition.fourthTask;

public class Person {
    private int id;
    private String name;
    private static int counterID = 1;

    public Person(String name) {
        this.id = counterID;
        this.name = name;
        counterID++;
    }

    public int getId() {
        return id;
    }

    public static int getCounterID() {
        return counterID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
