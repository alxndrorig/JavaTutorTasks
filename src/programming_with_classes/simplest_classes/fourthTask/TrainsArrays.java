package programming_with_classes.simplest_classes.fourthTask;

import java.util.Arrays;
import java.util.Scanner;

public class TrainsArrays {

    public static Train[] sortByNumber(Train[] trains){
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].getNumber() > trains[j].getNumber()) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
        return trains;
    }


    public static void findByNumber(Train[] trains){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Available numbers: ");
        for (Train train : trains) {
            System.out.print(train.getNumber() + " ");
        }
        System.out.println("\nEnter train's number: ");
        int number = scanner.nextInt();

        for (Train train : trains) {
            if (train.getNumber() == number) {
                System.out.printf("Train number %d\nDestination: %s\nDeparture time: %s", train.getNumber(), train.getDestination(), train.getTime());
                break;
            }
        }
    }

    public static Train[] sortByDestination(Train[] trains) {
        String[] destinations = new String[trains.length];
        for (int i = 0; i < destinations.length; i++) {
            destinations[i] = trains[i].getDestination();
        }
        Arrays.sort(destinations);
        for (int i = 0; i < destinations.length; i++) {
            for (int j = 0; j < destinations.length; j++) {
                if (destinations[i].equals(trains[j].getDestination())) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
        for (int i = 0; i < trains.length - 1; i++) {
            if (trains[i].getDestination().equals(trains[i + 1].getDestination())){
                if (trains[i].getTime().getHour() == trains[i + 1].getTime().getHour()) {
                    if (trains[i].getTime().getMinute() > trains[i + 1].getTime().getMinute()) {
                        Train temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                    }
                } else {
                    if (trains[i].getTime().getHour() > trains[i + 1].getTime().getHour()) {
                        Train temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                    }
                }
            }
        }
        return trains;
    }
}
