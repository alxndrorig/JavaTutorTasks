package algorithmization.arrays_of_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class FirstTask {
    private static String firstTask(int[][] numbers) {
        StringBuilder result = new StringBuilder();
        int row = 0;
        for (int column = 1; column < numbers[row].length; column += 2) {
            if (numbers[0][column] > numbers[numbers.length - 1][column]) {
                for (int[] number : numbers) {
                    result.append(number[column]).append(" ");
                }
                result.append("\n");
            }
            row++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(firstTask(new int[][]{{12, 20, 30, 16}, {4, 5, 6, 8}, {7, 8, 9, 1}, {10, 11, 12, 3}}));
    }
}
