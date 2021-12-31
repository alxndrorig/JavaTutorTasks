package algorithmization.sorting_one_dimension_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить числа в порядке возрастания. Для этого
 * сравниваются два соседних числа ai и ai+1. Если ai>ai+1, то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class FourthTask {
    private static double[] fourthTask(double[] array) {
        int counter = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    counter++;
                }
            }
        }
        System.out.println("Number of permutations: " + counter);
        return array;
    }

    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 7, 5, 9, 3, 8, 6, 10};
        System.out.println(Arrays.toString(fourthTask(array)));
    }
}
