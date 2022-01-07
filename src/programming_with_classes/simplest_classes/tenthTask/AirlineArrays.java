package programming_with_classes.simplest_classes.tenthTask;

import java.time.LocalTime;

public class AirlineArrays {
    private Airline[] airlines;

    public AirlineArrays(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline getByFlightNumber(int number) {
        for (Airline airline :
                airlines) {
            if (number == airline.getFlightNumber()) return airline;
        }
        System.out.println("Matches not found!");
        return null;
    }

    public void showAirlinesByDestination(String aim) {
        StringBuilder builder = new StringBuilder();
        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(aim)) builder.append(airline).append("\n");
        }
        if (builder.length() == 0) System.out.println("Error! Matches not found!");
        else System.out.println(builder);
    }

    public void showAirlinesInDay(String day) {
        StringBuilder builder = new StringBuilder();
        for (Airline airline : airlines) {
            if (airline.getDayOfWeek().equalsIgnoreCase(day)) builder.append(airline).append("\n");
        }
        if (builder.length() == 0) System.out.println("Error! Matches not found!");
        else System.out.println(builder);
    }

    public void showAirlinesInDayAfterTime(String day, String time) {
        StringBuilder builder = new StringBuilder();
        for (Airline airline : airlines) {
            if (airline.getDayOfWeek().equalsIgnoreCase(day)) {
                if (airline.getDepartureTime().getHour() > LocalTime.parse(time).getHour()) builder.append(airline).append("\n");
                else if ((airline.getDepartureTime().getHour() == airline.getDepartureTime().getHour()) &&
                        (airline.getDepartureTime().getMinute() > LocalTime.parse(time).getMinute())) builder.append(airline).append("\n");
            }
        }
        if (builder.length() == 0) System.out.println("Matches not found!");
        else System.out.println(builder);
    }
}
