package basics_of_software_code_development.cycles;

import java.util.HashSet;

/**
 * @author Aliaksandr Yamrom
 * @task Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.
 */

public class EighthTask {
    private static String eighthTask(double a, double b) {
        HashSet<Character> numbers = new HashSet<>();
        String first = String.valueOf(a);
        String second = String.valueOf(b);
        for (int i = 0; i < first.length(); i++) {
            if (second.contains(String.valueOf(first.charAt(i)))) {
                numbers.add(first.charAt(i));
            }
        }
        return numbers.toString();
    }

    public static void main(String[] args) {
        System.out.println(eighthTask(3272, 789));
    }
}
