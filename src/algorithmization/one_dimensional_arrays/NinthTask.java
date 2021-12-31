package algorithmization.one_dimensional_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
 * несколько, то определить наименьшее из них.
 */

public class NinthTask {
    private static int ninthTask(int n, int[] source){
        /*

         */
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = source[i];
        }

        int[] appearCounter = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int number : numbers) {
                if (numbers[i] == number) appearCounter[i]++;
            }
        }

        int maxAppearCount = appearCounter[0];
        int maxAppearNumber = numbers[0];

        for (int i = 0; i < appearCounter.length; i++) {
            if (appearCounter[i] > maxAppearCount) {
                maxAppearCount = appearCounter[i];
                maxAppearNumber = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (maxAppearCount == appearCounter[i]) {
                if (numbers[i] < maxAppearNumber) maxAppearNumber = numbers[i];
            }
        }

        return maxAppearNumber;
    }

    public static void main(String[] args) {
        System.out.println(ninthTask(5, new int[]{7, 1, 1, 7, 9}));
    }
}
