package basics_of_software_code_development.cycles;

/**
 * @author Aliaksandr Yamrom
 * @task Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: a(n) = 1/(2^n) + 1/(3^n)
 */

public class FifthTask {
    private static double fifthTask(int n, double e) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double temp = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            if (temp >= e) sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fifthTask(10, 0.2));
    }
}
