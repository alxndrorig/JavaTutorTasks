package algorithmization.one_dimensional_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Даны целые числа А1, А2, ..., Аn. Вывести на печать только те числа, для которых Аi > i.
 */

public class FifthTask {
    private static String fifthTask(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) result.append(array[i]).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fifthTask(new int[]{5, 2, 4, 1, 3}));
    }
}
