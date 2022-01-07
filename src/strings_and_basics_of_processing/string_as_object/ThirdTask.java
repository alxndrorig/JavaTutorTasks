package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task Проверить, является ли заданное слово палиндромом.
 */

public class ThirdTask {
    private static void thirdTask() {
        String phrase = "Dogma I am God";
        System.out.println(isPalindrome(phrase));
    }

    private static boolean isPalindrome(String phrase) {
        phrase = phrase.toLowerCase();
        for (int i = 0, j = phrase.length()-1; i < phrase.length();) {
            if (phrase.charAt(i) == ' ') i++;
            if (phrase.charAt(j) == ' ') j--;
            if (phrase.charAt(i) != phrase.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        thirdTask();
    }
}
