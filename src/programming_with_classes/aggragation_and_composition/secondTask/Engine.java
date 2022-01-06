package programming_with_classes.aggragation_and_composition.secondTask;

public class Engine {
    private int power;
    private double consumption;
    private boolean isStarted;

    public Engine(int power, double consumption, boolean isStarted) {
        this.power = power;
        this.consumption = consumption;
        this.isStarted = isStarted;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }
}
