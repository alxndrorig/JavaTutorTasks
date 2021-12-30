package algorithmization.arrays_of_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Сформировать квадратную матрицу порядка N по правилу: A[i,j] = sin ((i^2 - j^2)/n)) и подсчитать количество положительных элементов в ней.
 */

public class SeventhTask {
    private static String seventhTask(int n) {
        int count = 0;
        double[][] matrix = new double[n][n];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                String str = String.format("%.3f", matrix[i][j]);
                result.append(str).append(" ");
                if (matrix[i][j] > 0) count++;
            }
            result.append("\n");
        }
        result.append("\nCount of positive elements: ").append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(seventhTask(4));
    }
}
