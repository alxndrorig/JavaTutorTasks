package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

public class TenthTask {
    private static void tenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        long number = Math.abs(scanner.nextLong());
        int[] arrayOfNumerals = new int[getArrayLength(number)];

        for (int i = 0; i < arrayOfNumerals.length; i++) {
            arrayOfNumerals[arrayOfNumerals.length - 1 -i] = getNumeral(number);
            number /= 10;
        }
        System.out.println(Arrays.toString(arrayOfNumerals));
    }

    private static int getArrayLength(double n) {
        int counter = 0;
        while (n > 1){
            n /= 10;
            counter++;
        }
        return counter;
    }

    private static int getNumeral(long n) {
        n %= 10;
        return (int) n;
    }

    public static void main(String[] args) {
        tenthTask();
    }
}
