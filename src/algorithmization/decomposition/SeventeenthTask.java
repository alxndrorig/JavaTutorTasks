package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
 * надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class SeventeenthTask {
    private static void seventeenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        System.out.printf("You should make %d operations", getCountOfOperations(number));
    }

    private static int getCountOfOperations(int number) {
        int counter = 0;
        while (number != 0) {
            number-= getSumOfNumerals(number);
            counter++;
        }
        return counter;
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

    public static void main(String[] args) {
        seventeenthTask();
    }
}
