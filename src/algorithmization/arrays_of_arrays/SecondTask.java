package algorithmization.arrays_of_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class SecondTask {
    private static String secondTask(int[][] array) {
        StringBuilder diagonal = new StringBuilder("Elements of the main diagonal: ");
        for (int i = 0; i < array.length; i++) {
            diagonal.append(array[i][i]).append(" ");
        }
        return diagonal.toString();
    }

    public static void main(String[] args) {
        System.out.println(secondTask(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
