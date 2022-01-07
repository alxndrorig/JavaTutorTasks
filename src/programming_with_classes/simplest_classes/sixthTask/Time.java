package programming_with_classes.simplest_classes.sixthTask;

/**
 * Составьте описание класса для представления времени. Предусмотрите возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) this.hour = 0;
        else this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) this.minutes = 0;
        else this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) this.seconds = 0;
        else this.seconds = seconds;
    }

    private int checkHours(int hours) {
        if (hours > 23) return hours % 24;
        else if (hours < 0) return (hours % 24) + 24;
        else return hours;
    }

    private int checkMinutesOrSeconds(int changeTime) {
        if (changeTime > 59) return changeTime % 60;
        else if (changeTime < 0) return (changeTime % 60) + 60;
        else return changeTime;
    }

    public void addHours(int changeHours) {
        this.hour = checkHours(this.hour + changeHours);
    }

    public void addMinutes(int changeMinutes) {
        this.minutes = checkMinutesOrSeconds(this.minutes + changeMinutes);
    }

    public void addSeconds(int changeSeconds) {
        this.seconds = checkMinutesOrSeconds(this.seconds + changeSeconds);
    }

    public void subtractHours(int changeHours) {
        this.hour = checkHours(this.hour - changeHours);
    }

    public void subtractMinutes(int changeMinutes) {
        this.minutes = checkMinutesOrSeconds(this.minutes - changeMinutes);
    }

    public void subtractSeconds(int changeSeconds) {
        this.seconds = checkMinutesOrSeconds(this.seconds - changeSeconds);
    }
}
