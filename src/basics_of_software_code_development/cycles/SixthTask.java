package basics_of_software_code_development.cycles;

/**
 * @author Aliaksandr Yamrom
 * @task Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class SixthTask {
    private static void sixthTask() {
        for (char i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println("Char value: " + i + " int value: " + (int) i);
        }
    }

    public static void main(String[] args) {
        sixthTask();
    }
}
