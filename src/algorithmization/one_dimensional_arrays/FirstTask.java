package algorithmization.one_dimensional_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class FirstTask {
    private static int firstTask(int[] array, double k) {
        int sum = 0;
        for (int number : array) {
            if (number % k == 0) sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(firstTask(new int[] {1, 5, 6, 4}, 1));
    }
}
