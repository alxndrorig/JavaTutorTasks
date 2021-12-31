package algorithmization.one_dimensional_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных
 * и нулевых элементов.
 */

public class ThirdTask {
    private static String thirdTask(int n, double[] source) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = source[i];
        }

        int nullCount = 0, posCount = 0, negCount = 0;

        for (double number :
                array) {
            if (number > 0) posCount++;
            if (number < 0) negCount++;
            if (number == 0) nullCount++;
        }
        return String.format("Количество положительных элементов: %d\nКоличество отрицательных элементов: %d\nКоличество нулевых элементов: %d", posCount, negCount, nullCount);
    }

    public static void main(String[] args) {
        System.out.println(thirdTask(5, new double[]{0,2,-3,4,5}));
    }
}
