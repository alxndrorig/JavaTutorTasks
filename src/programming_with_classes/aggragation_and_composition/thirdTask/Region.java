package programming_with_classes.aggragation_and_composition.thirdTask;


/**
 * Область
 */
public class Region {
    private String name;
    private City[] cities;
    private int area;


    public City[] getCities() {
        return cities;
    }

    public Region(String name, City[] cities) {
        this.name = name;
        this.cities = cities;
        this.area = setFullArea();
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Region(String name, City[] cities, int area) {
        this.name = name;
        this.cities = cities;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    private int setFullArea() {
        int sumArea = 0;
        for (City city :
                cities) {
            sumArea += city.getArea();
        }
        return sumArea;
    }



    public City getRegionalCenter() {
        for (City city :
                cities) {
            if (city.isRegionalCenter()) return city;
        }
        return null;
    }

    private String getRegionalCenterName() {
        for (City city :
                cities) {
            if (city.isRegionalCenter()) return city.getName();
        }
        return null;
    }

    @Override
    public String toString() {
        return  name + ": regional center is " + getRegionalCenterName() + ", area = " + area;
    }
}
