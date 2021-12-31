package algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Даны действительные числа А1 ,А2 ,..., Аn. Поменять местами наибольший и наименьший элементы.
 */

public class FourthTask {
    private static double[] fourthTask(double[] array) {
        double min = array[0];
        int minNum = 0;
        double max = array[0];
        int maxNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minNum = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxNum = i;
            }
        }

        double temp = array[maxNum];
        array[maxNum] = array[minNum];
        array[minNum] = temp;

        System.out.printf("Min value: %s, MinNum: %d, Max value: %s, MaxNum: %d", min, minNum, max, maxNum);
        System.out.println();

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fourthTask(new double[]{4, 10, 8, 11, 4, 25, 7, 13, 3, 3, 25})));
    }
}
