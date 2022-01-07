package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы.
 */

public class NinthTask {
    private static void ninthTask() {
        String string = "JAVA slogan: write Once, run Anywhere";

        int upperLetters = 0;
        int lowerLetters = 0;

        for (int i = 0; i < string.length(); i++) {
            if ((int) string.charAt(i) >= 65 && (int) string.charAt(i) <= 90) upperLetters++;
            if ((int) string.charAt(i) >= 97 && (int) string.charAt(i) <= 122) lowerLetters++;
        }

        System.out.printf("Upper letters count = %d\nLower letters count = %d", upperLetters, lowerLetters);
    }

    public static void main(String[] args) {
        ninthTask();
    }
}
