package programming_with_classes.aggragation_and_composition.secondTask;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */
public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Advanti", 16);

        wheel.setBrand("Rosava");
        wheel.setDiameter(18);

        Engine engine = new Engine(123, 6.3, false);
        engine.setPower(340);
        engine.setConsumption(5.9);

        Car myCar = new Car(engine, wheel, 15,  43,"Kia");
        myCar.setModel("Audi");
        myCar.setMaxFuelVolume(70);
        myCar.setFuelVolume(50);

        myCar.run();
        myCar.refuel(10);
        myCar.changeWheels(new Wheel("Michelin", 21));

        myCar.showModel();
    }
}
