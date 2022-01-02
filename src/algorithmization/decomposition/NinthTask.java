package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол
 * между сторонами длиной X и Y — прямой.
 */

public class NinthTask {
    private static void ninthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X, Y, Z, T. (X perpendicular Y)");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double t;

        while (true) {
            System.out.println("T must be > " + minT(x, y, z));
            t = scanner.nextDouble();
            if (t > minT(x, y, z)) break;
            else System.out.println("Error! Try again");
        }

        System.out.println("Square = " + square(x, y, z, t));
    }

    private static double minT (double x, double y, double z) {
        double h = hypotenuse(x, y);
        return h - z < 0 ? 0 : h - z;
    }

    private static double square(double x, double y, double z, double t)  {
        double half_perimeter = hypotenuse(x, y) + z + t / 2;
        return x * y / 2 + Math.sqrt(half_perimeter*(half_perimeter - hypotenuse(x, y))*(half_perimeter - z) * (half_perimeter - t));
    }

    private static double hypotenuse(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        ninthTask();
    }
}
