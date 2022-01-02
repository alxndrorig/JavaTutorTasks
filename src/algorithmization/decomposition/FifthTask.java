package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое
 * меньше максимального элемента массива, но больше всех других элементов).
 */

public class FifthTask {
    private static void fifthTask() {
        /*
        Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
        которое меньше максимального элемента массива, но больше всех других элементов).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scanner.nextInt();

        double[] array = getArray(n);

        System.out.println("Second largest number = " + array[array.length-2]);
    }

    private static double[] getArray(int n) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[n];
        System.out.println("Enter values");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        sortArray(array);

        return array;
    }

    private static void sortArray(double[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        fifthTask();
    }
}
