package basics_of_oop.thirdTask;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Calendar {

    private static ArrayList<Holiday> holidays = new ArrayList<>();
    private static ArrayList<Weekend> weekends = new ArrayList<>();

    public static void addHoliday(Holiday day) {
        holidays.add(day);
    }

    public static void addWeekend(Weekend day) {
        weekends.add(day);
    }

    public static void printAllHolidays() {
        System.out.println(holidays.toString());
    }

    public static void printAllWeekends() {
        System.out.println(weekends.toString());
    }

    static class Holiday {
        private String name;
        private GregorianCalendar date;

        public Holiday(String name, GregorianCalendar date) {
            this.name = name;
            this.date = date;
        }

        @Override
        public String toString() {
            return name +
                    ", date = " + date.getTime();
        }
    }

    static class Weekend {
        private GregorianCalendar date;

        public Weekend(GregorianCalendar date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "date = " + date.getTime();
        }
    }
}
