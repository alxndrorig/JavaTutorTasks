package algorithmization.arrays_of_arrays;

import java.util.Random;

/**
 * @author Aliaksandr Yamrom
 * @task Сформировать случайную матрица m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно
 * номеру столбца.
 */

public class FourteenTask {
    private static String fourteenthTask() {
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        int n = random.nextInt(10);
        int m = random.nextInt(10);

        result.append("matrix size: m=").append(m).append(" n=").append(n).append("\n");

        int[][] array = new int[m][n];

        for (int j = 0; j < n; j++) {
            int counter = j;
            for (int i = 0; i < m; i++) {
                if (counter > 0) {
                    array[i][j] = 1;
                    counter--;
                } else array[i][j] = 0;
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result.append(array[i][j]).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fourteenthTask());
    }
}
