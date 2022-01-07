package strings_and_basics_of_processing.string_as_an_array;

/**
 * @author Aliaksandr Yamrom
 * @task В строке найти количество цифр.
 */

public class ThirdTask {
    private static void thirdTask()  {
        String string = "Around the world in 80 days";

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isNumber(string.charAt(i))) counter++;
        }
        System.out.println(counter);
    }

    private static boolean isNumber(char ch) {
        return ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9';
    }

    public static void main(String[] args) {
        thirdTask();
    }
}
