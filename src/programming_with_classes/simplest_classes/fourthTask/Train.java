package programming_with_classes.simplest_classes.fourthTask;


import java.time.LocalTime;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class Train {
    private String destination;
    private int number;
    private LocalTime time;

    public Train(String destination, int number, String time) {
        this.destination = destination;
        this.number = number;
        this.time = LocalTime.parse(time);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", time=" + time +
                '}';
    }
}
