package algorithmization.arrays_of_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Сформировать квадратную матрицу порядка n по заданному образцу (n - четное число):
 *         1  2   3  ... n
 *         n n-1 n-2 ... 1
 *         1  2   3  ... n
 *         n n-1 n-2 ... 1
 *         ...............
 *         n n-1 n-2 ... 1
 */

public class FourthTask {
    private static String fourthTask(int n) {
        /*
        Сформировать квадратную матрицу порядка n по заданному образцу (n - четное число):
        1  2   3  ... n
        n n-1 n-2 ... 1
        1  2   3  ... n
        n n-1 n-2 ... 1
        ...............
        n n-1 n-2 ... 1
         */
        StringBuilder result = new StringBuilder();
        if (n % 2 != 0 || n < 2) result.append("Error! Invalid Value N");
        else {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = (j + 1);
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = (n - j);
                    }
                }
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
        System.out.println(fourthTask(7));
    }
}
