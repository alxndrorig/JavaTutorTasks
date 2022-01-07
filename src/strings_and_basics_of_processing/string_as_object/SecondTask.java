package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task В строке вставить после каждого символа 'a' символ 'b'
 */

public class SecondTask {
    private static void secondTask() {
        String string = "Java slogan: write Once, run Anywhere";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(string.charAt(i));
            if (string.charAt(i) == 'a')
                stringBuilder.append('b');
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        secondTask();
    }
}
