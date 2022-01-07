package strings_and_basics_of_processing.string_as_an_array;

import java.util.Arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class FirstTask {
    private static void firstTask() {
        String[] names = new String[]{"firstTask", "secondTask", "thirdTask"};

        System.out.println("camelCases: " + Arrays.toString(names));
        System.out.println("snake_cases: " + Arrays.toString(arrayToSnakeCase(names)));
    }

    private static String[] arrayToSnakeCase(String[] array) {
        String[] temp = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            temp[i] = converting(array[i]);
        }
        return temp;
    }

    private static String converting(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                string =  string.replace(String.valueOf(string.charAt(i)),'_' + String.valueOf(Character.toLowerCase(string.charAt(i))));
            }
        }
        return string;
    }

    public static void main(String[] args) {
        firstTask();
    }
}
