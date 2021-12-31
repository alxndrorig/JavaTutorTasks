package algorithmization.sorting_one_dimension_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана последовательность чисел a1,a2,..., an. Требуется переставить числа в порядке возрастания. Делается это
 * следующим образом. Пусть a1, a2, ...,  ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <=an.
 * Берется следующее число ai+1  и вставляется в последовательность так, чтобы новая последовательность была тоже
 * возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
 * Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.
 */

public class FifthTask {
    private static int binarySearch(double[] array, int pos) {
        if (array[pos-1] <= array[pos]) return pos;

        int index1 = 0;
        int index2 = pos - 1;
        while (index1 != index2) {
            if (array[(index2 + index1) / 2] < array[pos]) {
                index1 = (index2 + index1) / 2 + 1;
            } else index2 = (index2 + index1) / 2;
        }
        return index1;
    }

    private static double[] fifthTask(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double temp = array[i];
            int position = binarySearch(array, i);

            for (int j = i; j > position; j--) {
                array[j] = array[j - 1];
            }

            array[position] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 7, 5, 9, 3, 8, 6, 10};
        System.out.println(Arrays.toString(fifthTask(array)));
    }
}
