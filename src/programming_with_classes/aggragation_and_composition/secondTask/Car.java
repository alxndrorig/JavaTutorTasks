package programming_with_classes.aggragation_and_composition.secondTask;

public class Car {
    private Engine engine;
    private Wheel wheels;
    private String model;
    private int maxFuelVolume;
    private int fuelVolume;

    public Car(Engine engine, Wheel wheels, int maxFuelVolume, int fuelVolume) {
        this.engine = engine;
        this.wheels = wheels;
        this.maxFuelVolume = maxFuelVolume;
        this.fuelVolume = normalFuelVolume(fuelVolume);
    }

    public Car(Engine engine, Wheel wheels, int maxFuelVolume, int fuelVolume, String model) {
        this.engine = engine;
        this.wheels = wheels;
        this.maxFuelVolume = maxFuelVolume;
        this.fuelVolume = normalFuelVolume(fuelVolume);
        this.model = model;
    }

    private int normalFuelVolume(int volume) {
        if (volume < 0) return 0;
        return Math.min(volume, maxFuelVolume);
    }

    public int getMaxFuelVolume() {
        return maxFuelVolume;
    }


    public void setMaxFuelVolume(int maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = normalFuelVolume(fuelVolume);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void run() {
        if (!engine.isStarted()) {
            System.out.println("Engine is on!");
            engine.setStarted(true);
        } else {
            System.out.println("Engine is off!");
            engine.setStarted(false);
        }
    }

    public void refuel(int volume) {
        this.fuelVolume = normalFuelVolume(fuelVolume + volume);
        System.out.println("The car is filled!");
    }

    public void changeWheels(Wheel replacement) {
        this.wheels = replacement;
        System.out.println("Wheels have been replaced!");
    }

    public void showModel() {
        System.out.println("You're the owner of " + getModel());
    }
}
