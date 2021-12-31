package algorithmization.sorting_one_dimension_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую последовательность
 * так, чтобы новая последовательность оставалась возрастающей.
 */

public class SeventhTask {
    private static int[] seventhTask(double[] array1, double[] array2) {
        int[] positionArray = new int[array2.length];

        for (int i = 0, j = 0; i < array1.length-1 && j < array2.length;) {
            if (array1[i] <= array2[j] && array1[i+1] >= array2[j]) {
                positionArray[j] = i;
                j++;
            } else i++;
        }
        return positionArray;
    }

    public static void main(String[] args) {
        double[] firstArray = new double[]{1, 10, 20, 30, 50, 60, 100, 150};
        double[] secondArray = new double[]{55, 56, 68};
        System.out.println(Arrays.toString(seventhTask(firstArray, secondArray)));
    }
}
