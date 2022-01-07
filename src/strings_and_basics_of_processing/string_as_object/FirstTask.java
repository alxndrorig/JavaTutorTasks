package strings_and_basics_of_processing.string_as_object;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class FirstTask {
    private static void firstTask() {
        String text = "A  little    text   with a          lot   of   spaces";
        System.out.println(Arrays.toString(text.toCharArray()));

        int max = 0;
        for (int i = 0; i < text.length() - 1;) {
            int counter = 0;
            if (text.charAt(i) == ' ') {
                while (text.charAt(i) == ' ') {
                    counter++;
                    i++;
                }
                if (counter > max) max = counter;
            } else i++;
        }
        System.out.println("Maximum spaces in a row: " + max);
    }

    public static void main(String[] args) {
        firstTask();
    }
}
