package programming_with_classes.aggragation_and_composition.secondTask;

public class Wheel {
    private String brand;
    private int diameter;

    public Wheel(String manufacturer, int diameter) {
        this.brand = manufacturer;
        this.diameter = normalDiameter(diameter);
        }

    private int normalDiameter(int diameter) {
        if (diameter < 14) return  14;
        else return Math.min(diameter, 22);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
