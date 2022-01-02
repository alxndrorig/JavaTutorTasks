package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
 * сумма цифр которых равна К и которые не большее N.
 */

public class TwelfthTaskVersionTwo {
    private static void twelfthTaskV2() {
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

        int[] array = getArray(k, n);
        System.out.println("Arrays of numbers" + Arrays.toString(array));
    }

    private static int getSize(int k, int n) {
        int counter = 0;
        for (int i = k; i < n; i += 9) {
            counter++;
        }
        return counter;
    }

    private static int[] getArray (int k, int n) {
        int[] array = new int[getSize(k, n)];
        for (int i = k, j = 0; i < n; i += 9) {
            array[j] = i;
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
        twelfthTaskV2();
    }
}
