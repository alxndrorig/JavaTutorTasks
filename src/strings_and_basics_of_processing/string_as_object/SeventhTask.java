package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 */

public class SeventhTask {
    private static void seventhTask() {
        String string = "abc cde def";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (!result.toString().contains(string.substring(i, i+1)))
                if (string.charAt(i) != ' ') {
                    result.append(string.charAt(i));
                }
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        seventhTask();
    }
}
