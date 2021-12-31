package algorithmization.one_dimensional_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class SixthTask {
    private static boolean primeCheck(int number) {
        //Метод для проверки числа на простое или составное (для больших чисел не подходит)

        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private static double sixthTask(double[] array) {
        double sum = 0;
        for (int i = 2; i < array.length; i++) {
            if (primeCheck(i))
                sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sixthTask(new double[]{1, 2, 3, 4, 5, 2, 3, 4, 2, 3}));
    }
}
