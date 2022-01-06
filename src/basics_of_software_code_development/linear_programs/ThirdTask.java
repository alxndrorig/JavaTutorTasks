package basics_of_software_code_development.linear_programs;

/**
 * @author Aliaksandr Yamrom
 * @task Вычислить значение выражения по формуле (все переменные принимают только действительные значения):
 * ((sin x + cos y) / (cos x - sin y)) * tg xy
 */

public class ThirdTask {
    private static double thirdTask(double x, double y) {
        return (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.sin(x * y) / Math.cos(y)));
    }

    public static void main(String[] args) {
        System.out.println(thirdTask(1, 2));
    }
}
