package basics_of_software_code_development.branches;

/**
 * @author Aliaksandr Yamrom
 * @task Вычислить значение функции:
 * x^2-3x+9, если x <= 3
 * 1/(x^3 + 6), если x > 3
 */

public class FifthTask {
    private static int fifthTask(int x) {
        if (x <= 3) return (int) Math.pow(x, 2) - 3 * x + 9;
        else return (int) (1 / ((Math.pow(x, 3) + 6)));
    }

    public static void main(String[] args) {
        System.out.println(fifthTask(5));
    }
}
