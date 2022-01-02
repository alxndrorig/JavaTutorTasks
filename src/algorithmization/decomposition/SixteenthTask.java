package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class SixteenthTask {
    private static void sixteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Math.abs(scanner.nextInt());

        int sum = 0;
        for (int i = (int) Math.pow(10, n); i < (int) Math.pow(10, n + 1); i++) {
            if (isOnlyOddNumerals(i)) sum += i;
        }
        System.out.printf("Sum of numbers of power n = %d with only odd numerals is %d, which have %d even numerals\n", n, sum, howManyEvenNumerals(sum));
    }

    private static boolean isOnlyOddNumerals(int number) {
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                number /= 10;
            } else return false;
        }
        return true;
    }

    private static int howManyEvenNumerals(int number) {
        int counter = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) counter++;
            number /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        sixteenthTask();
    }
}
