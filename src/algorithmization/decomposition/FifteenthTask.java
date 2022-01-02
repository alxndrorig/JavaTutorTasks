package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class FifteenthTask {
    private static void fifteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        int n = Math.abs(scanner.nextInt());

        System.out.print("Numbers with numeral's sequence: ");
        for (int i = (int) Math.pow(10, n); i < (int) Math.pow(10, n+1); i++) {
            if (isSequence(i)) System.out.print(i + " ");
        }
    }

    private static boolean isSequence(int n) {
        int temp = n;
        while (n > 0){
            if (temp > n%10) {
                temp %= 10;
                n /= 10;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        fifteenthTask();
    }
}
