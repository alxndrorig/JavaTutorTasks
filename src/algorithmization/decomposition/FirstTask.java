package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных
 * чисел: НОК(А, В) = (А * В / НОД(А, В))
 */

public class FirstTask {
    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.printf("a = %d, b = %d\n", a, b);

        if (a < 1 || b < 1) {
            System.out.println("Invalid values");
            return;
        }


        System.out.printf("NOD = %d\nNOK = %d\n", getNOD(a, b), getNOK(a, b));
    }

    private static long getNOD(long a, long b) {
        return b == 0 ? a : getNOD(b, a % b);
    }

    private static long getNOK(long a, long b) {
        return a * b / getNOD(a, b);
    }

    public static void main(String[] args) {
        firstTask();
    }
}
