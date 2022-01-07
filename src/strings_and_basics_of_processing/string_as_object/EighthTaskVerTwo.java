package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */


public class EighthTaskVerTwo {
    private static void eighthTaskV2() {

        String s = "Fortune favors the blablabla bold";
        if (s.charAt(s.length() - 1 ) != ' ') s = s + " ";

        String largestWord = "";
        int maximumLength = 0;

        int i = 0;
        while (i < s.length()) {
            String temp = s;
            temp = temp.substring(i, temp.indexOf(' '));
            if (temp.length() > maximumLength) {
                largestWord = temp;
                maximumLength = temp.length();
            }
            s = s.substring(s.indexOf(' ') + 1);
        }
        System.out.println(largestWord + " " + maximumLength);
    }

    public static void main(String[] args) {
        eighthTaskV2();
    }
}
