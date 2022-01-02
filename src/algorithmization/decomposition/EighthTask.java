package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
 * с номерами от k до m.
 */

public class EighthTask {
    private static void eighthTask() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        System.out.println("Array size = 6. Enter numbers");
        for (int i = 0; i < 6; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter K");
        int k = scanner.nextInt();
        System.out.println("sum of three consecutive elements = " + sumThreeElements(array, k));
    }

    private static int sumThreeElements(int[] array, int k) {
        if (k < 0 || k + 3 > array.length) {
            System.out.println("Invalid K value");
            return 0;
        } else {
            int sum = 0;
            for (int i = k; i < k + 3; i++) {
                sum += array[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        eighthTask();
    }
}
