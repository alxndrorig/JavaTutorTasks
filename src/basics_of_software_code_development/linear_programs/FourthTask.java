package basics_of_software_code_development.linear_programs;

/**
 * @author Aliaksandr Yamrom
 * @task Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class FourthTask {
    private static double fourthTask(double x) {
        return ((x * 1000) % 1000) + (int) x / 1000.0;
    }

    public static void main(String[] args) {
        System.out.println(fourthTask(123.4560));
    }
}
