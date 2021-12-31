package algorithmization.sorting_one_dimension_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. Образовать из них новую последовательность чисел
 * так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать
 */

public class SecondTask {
    private static double[] secondTask(double[] array1, double[] array2) {
        /*

         */
        double[] result = new double[array1.length + array2.length];

        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (pos1 < array1.length && pos2 < array2.length) {
                if (array1[pos1] < array2[pos2]) {
                    result[i] = array1[pos1];
                    pos1++;
                } else {
                    result[i] = array2[pos2];
                    pos2++;
                }
            }

            else if (pos2 < array2.length) {
                result[i] = array2[pos2];
                pos2++;
            } else {
                result[i] = array1[pos1];
                pos1++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        double[] firstArray = new double[]{1, 10, 20, 30, 50, 60, 100, 150};
        double[] secondArray = new double[]{55, 56, 68};
        System.out.println(Arrays.toString(secondTask(firstArray, secondArray)));
    }
}
