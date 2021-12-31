package algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

public class TenthTask {
    private static int[] tenthTask (int n, int[] source) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = source[i];
        }

        for (int i = 2, j = 0; i < numbers.length; i += 2) {
            numbers[i-j-1] = numbers[i];
            j++;
        }
        int tail;
        if (numbers.length % 2 == 0) {
            tail = numbers.length/2;
        } else {
            tail = numbers.length/2 + 1;
        }

        for (int i = tail; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tenthTask(6, new int[]{1, 2, 3, 4, 5, 6})));
    }
}
