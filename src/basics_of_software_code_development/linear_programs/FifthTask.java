package basics_of_software_code_development.linear_programs;

/**
 * @author Aliaksandr Yamrom
 * @task Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
 * длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSс.
 */

public class FifthTask {
    private static String fifthTask(int t) {
        int hours = t / 3600;
        int minutes = (t - hours*3600) / 60;
        int seconds = t - hours*3600 - minutes*60;
        return (hours + "ч " + minutes + "мин " + seconds + "с");
    }

    public static void main(String[] args) {
        System.out.println(fifthTask(7681));
    }
}
