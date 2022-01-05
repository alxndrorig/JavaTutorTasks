package basics_of_software_code_development.cycles;

/**
 * @author Aliaksandr Yamrom
 * @task Найти сумму квадратов первых ста чисел.
 */

public class ThirdTask {
    private static int thirdTask() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += Math.pow((i+1), 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(thirdTask());
    }
}
