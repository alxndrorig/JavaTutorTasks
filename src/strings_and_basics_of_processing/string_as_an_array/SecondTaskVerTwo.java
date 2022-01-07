package strings_and_basics_of_processing.string_as_an_array;

/**
 * @author Aliaksandr Yamrom
 * @task Замените в строке все вхождения 'word' на 'letter'.
 */

public class SecondTaskVerTwo {
    private static void secondTaskV2() {
        String string = "Hello word other word boom word";
        char[] array = string.toCharArray();
        int counter = 0;
        for (int i = 0; i < array.length - 3; i++) {
            if (isWord(array[i], array[i + 1], array[i + 2], array[i + 3])) counter++;
        }
        char[] result = new char[array.length + 2 * counter];
        char[] letterArray = new char[]{'l', 'e', 't', 't', 'e', 'r'};
        int i = 0;
        int j = 0;
        while (j < array.length - 3) {
            if (isWord(array[j], array[j + 1], array[j + 2], array[j + 3])) {
                for (int k = 0; k < letterArray.length; k++) {
                    result[i + k] = letterArray[k];
                }
                i += 6;
                j += 4;
            } else {
                result[i] = array[j];
                i++;
                j++;
            }
        }
        System.out.println(new String(result));
    }

    private static boolean isWord(char w, char o, char r, char d) {
        return w == 'w' && o == 'o' && r == 'r' && d == 'd';
    }

    public static void main(String[] args) {
        secondTaskV2();
    }
}
