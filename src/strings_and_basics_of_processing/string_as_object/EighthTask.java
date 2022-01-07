package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */

public class EighthTask {
    private static void eighthTask() {
        String string = "Fortune favors the blablabla bold";

        String largestWord = string.substring(0, string.indexOf(' '));
        int maximum = largestWord.length();
        int i = 0;
        StringBuilder builder = new StringBuilder();
        while (i < string.length()) {
            if (string.charAt(i) == ' ' || i == string.length()) {
                System.out.println(builder);
                if (builder.length() > maximum) {
                    maximum = builder.length();
                    largestWord = builder.toString();
                }
                builder.delete(0, builder.length());
                i++;
            }
            builder.append(string.charAt(i));
            i++;
        }

        System.out.println(maximum + " " + largestWord);
    }

    public static void main(String[] args) {
        eighthTask();
    }
}
