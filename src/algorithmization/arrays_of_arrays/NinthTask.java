package algorithmization.arrays_of_arrays;

import java.util.Random;

/**
 * @author Aliaksandr Yamrom
 * @task Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class NinthTask {
    private static int ninthTask() {
        int[][] matrix = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum = 0;
        int numberMax = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > maxSum) {
                maxSum = sum;
                numberMax = i;
            }
        }
        return numberMax;
    }

    public static void main(String[] args) {
        System.out.println(ninthTask());
    }
}
