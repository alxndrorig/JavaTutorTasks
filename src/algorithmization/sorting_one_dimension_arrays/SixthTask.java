package algorithmization.sorting_one_dimension_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим образом:
 * сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1,
 * то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */

public class SixthTask {
    private static double[] sixthTask(double[] array){
        for (int i = 0; i < array.length-1;) {
            if (array[i] <= array[i+1]) {
                i++;
            } else {
                double temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                if (i!=0) {
                    i--;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 7, 5, 9, 3, 8, 6, 10};
        System.out.println(Arrays.toString(sixthTask(array)));
    }
}
