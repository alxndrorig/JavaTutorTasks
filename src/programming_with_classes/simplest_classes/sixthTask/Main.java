package programming_with_classes.simplest_classes.sixthTask;

public class Main {

    public static void main(String[] args) {
        Time time = new Time(12, 38, 40);
        time.addHours(4); //hours = 16
        time.addMinutes(20); //minutes = 58
        time.addSeconds(12); //seconds = 52

        time.subtractHours(15); //hours = 1
        time.subtractMinutes(16); //minutes = 42
        time.subtractSeconds(40); //seconds = 12

        /*
        Если значения часов/минут/секунд выходят за пределы часовой шкалы (24 часа, 60 минут или секунд), то стрелка часов начинает оборот заново.
         */
    }
}
