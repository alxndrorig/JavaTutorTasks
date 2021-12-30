package algorithmization.arrays_of_arrays;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить на
 * соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class EighthTask {
    private static String eighthTask(int n, int p) {
        StringBuilder result = new StringBuilder();
        double[][] matrix = new double[5][4];
        if (n > matrix[0].length || n < 0 || p > matrix[0].length || p < 0) result.append("Error! Invalid values.");
        else {
            result.append("Initial matrix: \n");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = i + j;
                    result.append(matrix[i][j]).append(" ");
                }
                result.append("\n");
            }
            for (int i = 0; i < matrix.length; i++) {
                double temp = matrix[i][n];
                matrix[i][n] = matrix[i][p];
                matrix[i][p] = temp;
            }
            result.append("The resulting matrix: \n");
            for (double[] doubles : matrix) {
                for (int j = 0; j < matrix[0].length; j++) {
                    result.append(doubles[j]).append(" ");
                }
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(eighthTask(scanner.nextInt(), scanner.nextInt()));
    }
}
