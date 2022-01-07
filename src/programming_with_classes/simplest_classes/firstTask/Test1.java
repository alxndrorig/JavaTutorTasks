package programming_with_classes.simplest_classes.firstTask;
/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

public class Test1 {
    private int a;
    private int b;

    public Test1() {
    }

    public void getA() {
        System.out.println("a = " + a);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void getB() {
        System.out.println("b = " + b);
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        return Math.max(a, b);
    }
}
