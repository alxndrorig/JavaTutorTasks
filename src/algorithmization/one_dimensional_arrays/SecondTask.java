package algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана последовательность действительных чисел а1, а2, ..., аn. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

public class SecondTask {
    private static int secondTask(double[] array, double z)  {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(secondTask(new double[] {1, 2, 3, 25, 56, 15}, 5));

    }
}
