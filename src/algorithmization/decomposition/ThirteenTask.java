package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти и
 * напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 */

public class ThirteenTask {
    private static void thirteenthTask() {
        int n = getNumberN();

        System.out.println("Congratulation! Your array:");
        printArray(n);
    }

    private static int getNumberN(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter N. N > 2!");
        while (true) {
            n = scanner.nextInt();
            if (n < 2) System.out.println("Error! Try again!");
            else break;
        }
        return n;
    }

    private static void printArray (int n) {
        for (int i = n; i < 2 * n - 2; i++) {
            System.out.print(i + " " + (i + 2));
            System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        thirteenthTask();
    }
}
