package programming_with_classes.aggragation_and_composition.thirdTask;

/**
 * Государство
 */
public class State {
    private String name;
    private Region[] regions;
    private int area;

    public State(String name, Region[] regions) {
        this.name = name;
        this.regions = regions;
        this.area = setFullArea();
    }

    private int setFullArea() {
        int sumArea = 0;
        for (Region region :
                regions) {
            sumArea += region.getArea();
        }
        return sumArea;
    }

    public void showCapital() {
        for (int i = 0; i < regions.length; i++) {
            City[] cities = regions[i].getCities();
            for (int j = 0; j < cities.length; j++) {
                if (cities[j].isCapital()) {
                    System.out.println(cities[j]);
                    return;
                }
            }
        }
    }

    public void showRegionsCount() {
        System.out.println(regions.length);
    }

    public void showRegions() {
        StringBuilder builder = new StringBuilder("Regions: \n");
        for (Region region :
                regions) {
            builder.append(region).append("\n");
        }
        System.out.println(builder);
    }

    public int getArea() {
        return area;
    }

    public void showArea() {
        System.out.println(getArea());
    }
}
