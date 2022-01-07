package strings_and_basics_of_processing.string_as_an_array;

/**
 * @author Aliaksandr Yamrom
 * @task Замените в строке все вхождения 'word' на 'letter'.
 */

public class SecondTask {
    private static void secondTask() {
        String string = "Hello word other word boom word";

        for (int i = 0; i < string.length() - 3; i++) {
            if (isWord(string.charAt(i), string.charAt(i + 1), string.charAt(i + 2), string.charAt(i + 3))){
                string = string.substring(0, i) + "letter" + string.substring(i + 4);
            }
        }

        System.out.println(string);
    }

    private static boolean isWord(char w, char o, char r, char d) {
        return w == 'w' && o == 'o' && r == 'r' && d == 'd';
    }

    public static void main(String[] args) {
        secondTask();
    }
}
