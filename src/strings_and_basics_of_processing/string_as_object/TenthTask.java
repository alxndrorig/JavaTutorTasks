package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */

public class TenthTask {
    private static void tenthTask() {
        String string = "Люблю ли я гулять? Конечно! Странный вопрос, ведь мы видимся с вами на улице.";

        System.out.println("Sentences count = " + howManySentences(string));
    }

    private static int howManySentences(String s) {
        String[] array = s.split("[.!?]");
        return array.length;
    }

    public static void main(String[] args) {
        tenthTask();
    }
}
