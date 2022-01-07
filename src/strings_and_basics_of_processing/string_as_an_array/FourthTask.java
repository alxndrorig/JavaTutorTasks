package strings_and_basics_of_processing.string_as_an_array;

/**
 * @author Aliaksandr Yamrom
 * @task В строке найти количество чисел.
 */

public class FourthTask {
    private static void fourthTask() {
        String string = "365 days, 12 months in a year";
        int counter = 0;

        for (int i = 0; i < string.length();) {
            if (isNumber(string.charAt(i))) {
                counter++;
                while (isNumber(string.charAt(i))) {
                    i++;
                }
            } else i++;
        }
        System.out.println(counter);
    }

    private static boolean isNumber(char ch) {
        return ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9';
    }

    public static void main(String[] args) {
        fourthTask();
    }
}
