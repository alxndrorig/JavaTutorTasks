package strings_and_basics_of_processing.string_as_an_array;

/**
 * @author Aliaksandr Yamrom
 * @task Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

public class FifthTask {
    private static void fifthTask() {
        String string = "More   spaces    again         ";
        char[] array = string.toCharArray();
        char[] result = new char[array.length - extraSpaces(array)];

        for (int i = 0, j = 0; i < array.length - 1; ) {
            if (array[i] == ' ' && array[i + 1] == ' ') i++;
            else {
                result[j] = array[i];
                i++;
                j++;
            }
        }
        System.out.println(new String(result));
    }


    private static int extraSpaces(char[] array) {
        int counter = 0;
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] == ' ' && array[i + 1] == ' ') {
                i++;
                counter++;
            } else i++;
        }
        if (array[array.length - 1] == ' ') counter++;
        return counter;
    }

    public static void main(String[] args) {
        fifthTask();
    }
}
