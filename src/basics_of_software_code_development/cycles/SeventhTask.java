package basics_of_software_code_development.cycles;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n
 * вводятся с клавиатуры.
 */

public class SeventhTask {
    private static void seventhTask(double m, double n) {
        for (double i = m; i < n; i++) {
            int divisor = 2;
            System.out.print("divisors of a number " + i + ": ");
            while (divisor != i ){
                if (i % divisor == 0) {
                    System.out.print(divisor + " ");
                }
                divisor++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        seventhTask(scanner.nextDouble(), scanner.nextDouble());
    }
}
