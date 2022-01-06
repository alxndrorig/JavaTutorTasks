package basics_of_software_code_development.linear_programs;

/**
 * @author Aliaksandr Yamrom
 * @task Вычислить значение выражения по формуле(все переменные принимают действительные значения):
 * (b + sqrt(b^2 + 4*a*c))/2*a - a^3*c+b^(-2).
 */

public class SecondTask {
    private static double secondTask(double a, double b, double c) {
        if (a == 0 || b == 0) return 0; else {
            double fraction = (b + ((Math.sqrt(Math.pow(b, 2) + (4 * a * c))) + b)) / (2 * a);
            double numbers =  (Math.pow(a, 3)) * c - Math.pow(b, -2);
            return fraction - numbers;
        }
    }

    public static void main(String[] args) {
        System.out.println(secondTask(1, 2 ,3));
    }
}
