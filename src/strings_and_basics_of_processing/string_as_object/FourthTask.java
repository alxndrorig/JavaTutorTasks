package strings_and_basics_of_processing.string_as_object;

/**
 * @author Aliaksandr Yamrom
 * @task С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class FourthTask {
    private static void fourthTask() {
        String string = "информатика";
        String result = string.substring(7, 8).concat(string.substring(3, 5)).concat(string.substring(7 ,8));
        System.out.println(result);
    }

    public static void main(String[] args) {
        fourthTask();
    }
}
