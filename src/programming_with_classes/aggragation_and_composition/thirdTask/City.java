package programming_with_classes.aggragation_and_composition.thirdTask;

/**
 * Город
 */
public class City {
    private String name;
    private District[] districts;
    private boolean isRegionalCenter;
    private boolean isCapital;
    private int area;

    public City(String name, District[] districts, boolean isRegionalCenter, boolean isCapital) {
        this.name = name;
        this.districts = districts;
        this.isRegionalCenter = isRegionalCenter;
        this.isCapital = isCapital;
        this.area = setArea();
    }

    public City(String name, int area, boolean isRegionalCenter, boolean isCapital) {
        this.name = name;
        this.isRegionalCenter = isRegionalCenter;
        this.isCapital = isCapital;
        this.area = area;
    }

    public boolean isCapital() {
        return isCapital;
    }

    private int setArea() {
        int sumArea = 0;
        for (District d :
                districts) {
            sumArea += d.getArea();
        }
        return sumArea;
    }

    public int getArea() {
        return area;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City " + name + "\nArea: " + area + "\nCity is regional Center: " + isRegionalCenter +
                "\nCity is capital: " + isCapital;
    }
}
