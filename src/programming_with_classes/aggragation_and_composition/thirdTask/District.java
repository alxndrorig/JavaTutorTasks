package programming_with_classes.aggragation_and_composition.thirdTask;

/**
 * Район
 */
public class District {
    private  String name;
    private  int area;

    public District(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "District " + name + ", area: " + area;
    }
}
