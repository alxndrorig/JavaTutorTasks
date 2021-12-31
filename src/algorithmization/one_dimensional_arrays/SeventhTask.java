package algorithmization.one_dimensional_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Даны действительные числа A1, A2, ..., An. Найти max (A1 + A2n, A2 + A2n-1, ..., An + An+1)
 */

public class SeventhTask {
    private static double seventhTask (double[] source) {
        /*

         */
        double max = 0;
        double[] array = new double[source.length/2];

        for (int i = 0; i < source.length / 2 - 1; i++) {
            array[i] = source[i] + source[source.length - i - 1];
        }

        for (double number :
                array) {
            if(number > max) max = number;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(seventhTask(new double[]{2, 4, 8, 10, 3, 7, 15, 1, 6}));
    }
}
