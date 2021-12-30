package algorithmization.arrays_of_arrays;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,..., n^2
 * так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 * SUM = n * (n*n + 1) / 2
 */

public class SixteenthTask {
    private static String sixteenthTask(int n) {
        /*

         */

        int[][] square = new int[n][n];

        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(square[i], 0);
            }

            int count = 1, y = 0, x = square.length / 2;

            while (true) {
                square[y][x] = count;
                count++;

                if (((y == 0) && (x >= n - 1)) && (square[n - 1][0] != 0)) {
                    y++;
                } else {
                    y--;
                    if (y < 0) y = n - 1;
                    x++;
                    if (x == n) x = 0;
                    if (square[y][x] != 0) {
                        y += 2;
                        x--;
                    }
                }
                if (count == n * n + 1) break;
            }
        }

        if (n % 4 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    square[i][j] = (n * i) + j + 1;
                }
            }

            for (int i = 0; i < n / 4; i++)
                for (int j = 0; j < n / 4; j++)
                    square[i][j] = (n * n + 1) - square[i][j];

            for (int i = 0; i < n / 4; i++)
                for (int j = 3 * (n / 4); j < n; j++)
                    square[i][j] = (n * n + 1) - square[i][j];

            for (int i = 3 * n / 4; i < n; i++)
                for (int j = 0; j < n / 4; j++)
                    square[i][j] = (n * n + 1) - square[i][j];

            for (int i = 3 * n / 4; i < n; i++)
                for (int j = 3 * n / 4; j < n; j++)
                    square[i][j] = (n * n + 1) - square[i][j];

            for (int i = n / 4; i < 3 * n / 4; i++)
                for (int j = n / 4; j < 3 * n / 4; j++)
                    square[i][j] = (n * n + 1) - square[i][j];
        }

        StringBuilder result = new StringBuilder();
        for (int[] ints : square) {
            for (int l = 0; l < square.length; l++) {
                result.append(ints[l]).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(sixteenthTask(5));
    }
}
