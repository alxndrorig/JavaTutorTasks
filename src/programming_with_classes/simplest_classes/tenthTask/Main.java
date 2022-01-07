package programming_with_classes.simplest_classes.tenthTask;

public class Main {
    public static void main(String[] args) {
        AirlineArrays baseAirlines = new AirlineArrays(new Airline[]{
                new Airline("Moscow", 580, "Passenger", "09:40", "Thursday"),
                new Airline("London", 431, "Passenger", "12:00", "Wednesday"),
                new Airline("Istanbul", 286, "Passenger", "23:40", "Sunday")
        });
        baseAirlines.showAirlinesInDay("Sunday");
        baseAirlines.showAirlinesByDestination("Moscow");
        baseAirlines.showAirlinesInDayAfterTime("Wednesday", "10:00");
    }
}
