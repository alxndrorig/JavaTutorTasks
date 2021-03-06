package programming_with_classes.simplest_classes.tenthTask;
/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.time.LocalTime;
import java.util.Scanner;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private String dayOfWeek;

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, String dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = LocalTime.parse(departureTime);
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;

    }

    @Override
    public String toString() {
        return "Airline to " +
                destination +
                "\nFlight number: " + flightNumber +
                "\nAircraft type: " + aircraftType +
                "\nDeparture time: " + departureTime +
                "\nDay of week: " + dayOfWeek;
    }

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Make your choice:
                1. Destination
                2. Flight number
                3. Aircraft type
                4. Departure time
                5. Day of week
                6. Full information
                7. Exit""");
        switch (scanner.next()) {
            case "1":
                System.out.println("Destination = " + this.destination);
                break;
            case "2":
                System.out.println("Flight number" + this.flightNumber);
                break;
            case "3":
                System.out.println("Aircraft type: " + this.aircraftType);
                break;
            case "4":
                System.out.println("Departure time: " + this.departureTime);
                break;
            case "5":
                System.out.println("Day of week: " + this.dayOfWeek);
                break;
            case "6":
                System.out.println(this);
            case "7":
                break;
            default:
                System.out.println("Error!");
        }
    }
}
