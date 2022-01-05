package basics_of_software_code_development.cycles;

/**
 * @author Aliaksandr Yamrom
 * @task Вычислить значения функции на отрезке [a,b] с шагом h:
 */

public class SecondTask {
    private static void secondTask(double a, double b, double h){
        for (double x = a; x <= b; x += h) {
            if (x > 2){
                System.out.printf("y = %.3f ", x);
            } else {
                System.out.printf("y = %.3f ", -x);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        secondTask(0, 6, 2);
    }
}
