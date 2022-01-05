package basics_of_software_code_development.branches;

/**
 * @author Aliaksandr Yamrom
 * @task Найти max{min(a, b), min (c, d)}
 */

public class SecondTask {
    private static double secondTask(double a, double b, double c, double d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    public static void main(String[] args) {
        System.out.println(secondTask(100, 24, 48, 14));
    }
}
