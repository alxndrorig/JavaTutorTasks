package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task На плоскости заданы координаты n точек. Написать метод (методы), определяющие, между какими из пар точек самое
 * большое расстояние.
 * Указание. Координаты точек занести в массив.
 */

public class FourthTask {
    private static void fourthTask(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Invalid value!");
            return;
        }
        double[][] array = getArrayOfDots(n);
        double max_distance = getDistance(array[0][0], array[0][1], array[array.length-1][0], array[array.length-1][1]);

        int maxI = 0;
        int maxJ = array.length-1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (getDistance(array[i][0], array[i][1], array[j][0], array[j][1]) > max_distance) {
                    max_distance = getDistance(array[i][0], array[i][1], array[j][0], array[j][1]);
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.printf("Max distance = %.3f, between %d and %d dots\n", max_distance, maxI, maxJ);
    }

    private static double[][] getArrayOfDots(int n){
        Scanner scanner = new Scanner(System.in);

        double[][] dots = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter X and Y coordinate the point of number " + i);
            dots[i][0] = scanner.nextDouble();
            dots[i][1] = scanner.nextDouble();
        }
        return dots;
    }

    private static double getDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        fourthTask();
    }
}
