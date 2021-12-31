package algorithmization.sorting_one_dimension_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
 * включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
 */

public class FirstTask {
    private static double[] firstTask(double[] array1, double[] array2, int k) {
        double[] result = new double[array1.length + array2.length];

        for (int i = 0; i < k; i++) {
            result[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result[i + k] = array2[i];
        }

        for (int i = k + array2.length; i < result.length; i++) {
            result[i] = array1[i - array2.length];
        }

        return result;
    }

    public static void main(String[] args) {
        double[] firstArray = new double[]{1, 2, 7, 5, 9, 3, 8, 6, 10};
        double[] secondArray = new double[]{55, 56, 68};
        System.out.println(Arrays.toString(firstTask(firstArray, secondArray, 5)));
    }
}
