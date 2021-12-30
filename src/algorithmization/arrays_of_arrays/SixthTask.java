package algorithmization.arrays_of_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
 * 1 1 1 ... 1 1 1
 * 2 2 2 ... 2 2 0
 * 3 3 3 ... 3 0 0
 * ...............
 * n-1 n-1 0.0 0 0
 * n-1 0 0...0 0 0
 */

public class SixthTask {
    private static String sixthTask(int n) {
        StringBuilder result = new StringBuilder();

        if (n % 2 != 0 || n < 2) result.append("Error! Invalid Value N");
        else {
            int[][] matrix = new int[n][n];
            int counter = n;

            for (int i = 0; i < n; i++) {
                for (int j = n - counter; j < counter; j++) {
                    matrix[i][j] = 5;
                    matrix[n - 1 - i][j] = 5;
                }
                counter--;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result.append(matrix[i][j]).append(" ");
                }
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(sixthTask(16));
    }
}
