package algorithmization.decomposition;


import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class SecondTask {
    private static void secondTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);

        if (a < 1 || b < 1 || c < 1 || d < 1) {
            System.out.println("Invalid values");
            return;
        }
        System.out.printf("NOD = %d\n", getNOD(getNOD(a, b), getNOD(c, d)));
    }

    private static long getNOD(long a, long b) {
        return b == 0 ? a : getNOD(b, a % b);
    }

    private static long getNOK(long a, long b) {
        return a * b / getNOD(a, b);
    }

    public static void main(String[] args) {
        secondTask();
    }
}
