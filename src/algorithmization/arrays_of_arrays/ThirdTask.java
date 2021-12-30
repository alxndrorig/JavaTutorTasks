package algorithmization.arrays_of_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class ThirdTask {
    private static String thirdTask(int k, int p, int[][] array) {
        StringBuilder result = new StringBuilder("Elements of row №" + k + ": ");
        if (k > array.length || k < 0) result.append("Error! Invalid value K");
        else {
            for (int i = 0; i < array[k].length; i++) {
                result.append(array[k][i]).append(" ");
            }
        }

        result.append("\nElements of column №").append(p).append(": ");
        if (p > array[0].length || p < 0) result.append("Error! Invalid value P");
        else {
            for (int[] ints : array) {
                result.append(ints[p]).append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(thirdTask(1, 0, new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}}));
    }
}
