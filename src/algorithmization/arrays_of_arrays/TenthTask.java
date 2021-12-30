package algorithmization.arrays_of_arrays;

import java.util.Random;

/**
 * @author Aliaksandr Yamrom
 * @task Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class TenthTask {
    private static String tenthTask() {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        int n = random.nextInt(5);
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(10);
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }

        result.append("Positive elements of the diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) result.append(matrix[i][i]).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(tenthTask());
    }
}
