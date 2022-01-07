package programming_with_classes.simplest_classes.fifthTask;

public class Counter {
    /**
     * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
     * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
     * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
     * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
     */
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public Counter(int counter) {
        if (counter >= 0 && counter < 10) this.counter = counter;
        else this.counter = 0;
    }

    public void increment() {
        if (counter > 9) counter = 0;
        else counter++;
    }

    public void decrement() {
        if (counter < 1) counter = 10;
        else counter--;
    }

    public int getValue() {
        return counter;
    }
}
