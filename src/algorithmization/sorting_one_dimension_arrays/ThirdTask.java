package algorithmization.sorting_one_dimension_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
 */

public class ThirdTask {
    private static double[] thirdTask(double[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int buffer = i;
            for (int j = buffer+1; j < array.length; j++) {
                if (array[j] > array[buffer]) {
                    buffer = j;
                }
            }
            double temp = array[i];
            array[i] = array[buffer];
            array[buffer] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 7, 5, 9, 3, 8, 6, 10};
        System.out.println(Arrays.toString(thirdTask(array)));
    }
}
