package basics_of_software_code_development.cycles;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа
 * от 1 до введенного пользователем числа.
 */

public class FirstTask {
    private static int firstTask(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstTask(scanner.nextInt()));
    }
}
