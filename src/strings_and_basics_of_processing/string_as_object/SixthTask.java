package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Из заданной строки получить новую, повторив каждый символ дважды
 */

public class SixthTask {
    private static void sixthTask() {
        String string = "Fortune favors the bold";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            result.append(string.charAt(i));
            result.append(string.charAt(i));
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        sixthTask();
    }
}
