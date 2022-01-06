package algorithmization.arrays_of_arrays;

import java.util.Random;

/**
 * @author Aliaksandr Yamrom
 * @task Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */

public class ThirteenTask {
    private static String thirteenthTask() {
        StringBuilder result = new StringBuilder("Initial matrix: \n");
        int[][] matrix = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(15);
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }
        result.append("Sort columns in ascending order: \n");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[j][i] > matrix[k][i]) {
                        int temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }
        for (int[] value : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                result.append(value[j]).append(" ");
            }
            result.append("\n");
        }

        result.append("Sort columns in descending order: \n");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[j][i] < matrix[k][i]) {
                        int temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                result.append(ints[j]).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(thirteenthTask());
    }
}
