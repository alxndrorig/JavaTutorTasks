package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class FifthTask {
    private static void fifthTask() {
        String string = "JAVA slogan: write Once, run Anywhere";

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A') counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        fifthTask();
    }
}
