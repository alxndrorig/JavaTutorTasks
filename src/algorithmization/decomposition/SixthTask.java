package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class SixthTask {
    private static boolean sixthTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        return isPrimeNumber(a, b) && isPrimeNumber(a, c) && isPrimeNumber(b, c);
    }

    private static boolean isPrimeNumber(double a, double b) {
        if (a > b) {
            while (b > 0) {
                double temp = a % b;
                a = b;
                b = temp;
            }
            return a == 1;
        } else return isPrimeNumber(b, a);
    }

    public static void main(String[] args) {
        System.out.println(sixthTask());
    }
}
