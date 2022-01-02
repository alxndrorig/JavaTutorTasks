package algorithmization.decomposition;

import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */

public class ThirdTask {
    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter А");
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Invalid values");
            return;
        }

        double triangle_area = Math.pow(a, 2) * Math.sqrt(3) / 4;
        double hexagon_area = 6 * triangle_area;

        System.out.printf("District of a triangle = %.3f\nDistrict of a hexagon = %.3f", triangle_area, hexagon_area);
    }

    public static void main(String[] args) {
        thirdTask();
    }
}
