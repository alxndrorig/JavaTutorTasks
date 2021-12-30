package algorithmization.arrays_of_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class FifteenthTask {
    private static String fifteenth(float[][] array) {
        StringBuilder result = new StringBuilder();

        float maximum = array[0][0];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                if (array[i][j] > maximum) maximum = array[i][j];
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                if (array[i][j] % 2 == 0) array[i][j] = maximum;
                result.append(array[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fifteenth(new float[][]{{13, 10, 3, 4, 7, 11}, {7, 12, 11, 11, 8}, {13, 6, 12, 13, 2}, {15, 5, 11, 6, 2}}));
    }
}
