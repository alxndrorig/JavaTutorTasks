package algorithmization.arrays_of_arrays;

import java.util.Random;

/**
 * @author Aliaksandr Yamrom
 * @task Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых
 * число 5 встречается три и более раза.
 */

public class EleventhTask {
    private static String eleventhTask() {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        int[][] matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(15);
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }

        result.append("Rows where 5 occurs three or more times: ");
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5) counter++;
            }
            if (counter > 2) result.append(i).append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(eleventhTask());
    }
}
