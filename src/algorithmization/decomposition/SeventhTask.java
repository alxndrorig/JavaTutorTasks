package algorithmization.decomposition;

/**
 * @author Aliaksandr Yamrom
 * @task Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class SeventhTask {
    private static void seventhTask() {
        long sum = 0;
        for (int i = 1; i < 10; i += 2) {
            sum += factorial(i);
        }

        System.out.println("Sum = " + sum);
    }

    private static int factorial(int n) {
        int sum = n;
        for (int i = 1; i < n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        seventhTask();
    }
}
