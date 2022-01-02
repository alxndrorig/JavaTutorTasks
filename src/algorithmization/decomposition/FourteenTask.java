package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
 * в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class FourteenTask {
    private static void fourteenthTask() {
        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.println("Enter k (k > 2)");
        while (true) {
            k = scanner.nextInt();
            if (k < 2) System.out.println("Error! Try again!");
            else break;
        }

        for (int i = 1; i < k; i++) {
            if (isArmstrongNumber(i)) System.out.print(i + " ");
        }
    }

    private static boolean isArmstrongNumber(int number) {
        return number == Math.pow(getSumOfNumerals(number), getNForPower(number));
    }

    private static int getSumOfNumerals(int n) {
        int sum = 0;
        while (n >= 10) {
            sum += n % 10;
            n /= 10;
        }
        sum += n;
        return sum;
    }

    private static int getNForPower(int n) {
        int power = 0;
        while (n >= 10) {
            power++;
            n /= 10;
        }
        power++;
        return power;
    }

    public static void main(String[] args) {
        fourteenthTask();
    }
}
