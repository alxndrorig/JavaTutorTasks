package basics_of_software_code_development.branches;

/**
 * @author Aliaksandr Yamrom
 * @task Даны три точки А(х1, у1), B(x2, y2), C(x3, y3). Определить, будут ли они расположены на одной прямой.
 */

public class ThirdTask {
    private static boolean thirdTask(double x1, double y1, double x2, double y2, double x3, double y3) {
        return ((y3 - y1) / (y1 - y2)) == ((x3 - x1) / (x1 - x2));
    }

    public static void main(String[] args) {
        System.out.println(thirdTask(1, 0, 0, -2, 4, 2));
    }
}
