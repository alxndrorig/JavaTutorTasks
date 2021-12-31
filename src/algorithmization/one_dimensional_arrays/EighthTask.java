package algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана последовательность целых чисел A1, A2, ..., An. Образовать новую последовательность, выбросив из исходной
 * те члены, которые равны min(A1, A2, ..., An);
 */

public class EighthTask {
    private static int[] eighthTask(int [] source) {
        /*

         */
        int min = source[0];
        for (int number :
                source) {
            if (number < min) min = number;
        }

        int counter = 0;
        for (int number :
                source) {
            if (number == min) counter++;
        }

        int[] array = new int[source.length-counter];
        for (int i = 0, j = 0; i < source.length; i++) {
            if (source[i] != min) {
                array[j] = source[i];
                j++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(eighthTask(new int[]{1, 2, 3, 4, 5, 7, 1, 10})));
    }
}
