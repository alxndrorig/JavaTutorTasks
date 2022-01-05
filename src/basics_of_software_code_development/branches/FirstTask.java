package basics_of_software_code_development.branches;


/**
 * @author Aliaksandr Yamrom
 * @task Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class FirstTask {
    private static boolean firstTask(double a, double b) {
        if (a + b >= 180) return false;
        if (a + b == 90 || a == 90 || b == 90) {
            System.out.println("the triangle is rectangular");
        } else {
            System.out.println("the triangle is non-rectangular");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(firstTask(100, 2));
    }
}
