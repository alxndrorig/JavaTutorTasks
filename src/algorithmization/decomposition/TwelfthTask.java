package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
 * сумма цифр которых равна К и которые не большее N.
 */

public class TwelfthTask {
    private static void twelfthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter K. K must be less than 10");
        int k;
        while (true) {
            k = scanner.nextInt();
            if (k > 10 || k < 0) System.out.println("Error! Try again!");
            else break;
        }
        System.out.println("Enter N");
        int n = Math.abs(scanner.nextInt());

        int[] array = getArrayOfNumbers(k, n);
        System.out.println("Arrays of numbers" + Arrays.toString(array));
    }

    private static int getArraySize(int k, int n) {
        int counter = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += getNumeralForSum(temp);
                temp /= 10;
            }
            if (sum == k) counter++;
        }
        return counter;
    }

    private static int getNumeralForSum(int n) {
        if (n > 0 && n < 10) return n;
        else return n % 10;
    }

    private static int[] getArrayOfNumbers(int k, int n){
        int[] array = new int[getArraySize(k, n)];
        for (int i = 0, j = 0; i < n; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += getNumeralForSum(temp);
                temp /= 10;
            }
            if (sum == k) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        twelfthTask();
    }
}
