package algorithmization.arrays_of_arrays;

import java.util.Random;

/**
 * @author Aliaksandr Yamrom
 * @task Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class TwelfthTask {
    private static String twelfthTask() {
        int[][] matrix = new int[4][3];
        Random random = new Random();
        StringBuilder result = new StringBuilder("Initial matrix: \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(15);
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }

        result.append("Sort rows in ascending order: \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int k = j + 1; k < matrix[0].length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
            for (int j = 0; j < matrix[0].length; j++) {
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }

        result.append("Sort rows in descending order: \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int k = j + 1; k < matrix[0].length; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
            for (int j = 0; j < matrix[0].length; j++) {
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(twelfthTask());
    }
}
