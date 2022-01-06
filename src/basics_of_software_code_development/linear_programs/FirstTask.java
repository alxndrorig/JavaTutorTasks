package basics_of_software_code_development.linear_programs;

/**
 * @author Aliaksandr Yamrom
 * @task Найдите значение функции: z = ((a-3)*b/2)+c.
 */

public class FirstTask {
    private static double firstTask(double a, double b, double c) {
        return ((a-3) * b/2) + c;
    }

    public static void main(String[] args) {
        System.out.println(firstTask(1, 2, 3));
    }
}
