package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class EleventhTask {
    private static void eleventhTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (getArrayLength(a) > getArrayLength(b)) System.out.println("There are more digits in the first number");
        else if (getArrayLength(a) < getArrayLength(b)) System.out.println("There are more digits in the second number");
        else System.out.println("The same count of digits");
    }

    private static int getArrayLength(double n) {
        int counter = 0;
        while (n > 1){
            n /= 10;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        eleventhTask();
    }
}
