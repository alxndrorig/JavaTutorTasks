package basics_of_oop.thirdTask;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar.Holiday newYear = new Calendar.Holiday("New Year", new GregorianCalendar(2022, 0, 1));
        System.out.println(newYear);
        Calendar.addHoliday(newYear);
        Calendar.Holiday christmas = new Calendar.Holiday("Christmas", new GregorianCalendar(2022, 0, 7));
        Calendar.addHoliday(christmas);

        Calendar.Weekend sunday = new Calendar.Weekend(new GregorianCalendar(2021, 8, 5));
        System.out.println(sunday);
        Calendar.addWeekend(sunday);
        Calendar.Weekend saturday = new Calendar.Weekend(new GregorianCalendar(2021, 8, 4));
        Calendar.addWeekend(saturday);

        Calendar.printAllHolidays();
        Calendar.printAllWeekends();
    }
}
