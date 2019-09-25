package module4ProgrammingWithClasses.elementaryClassesAndObjects.task4;

import java.util.Arrays;
import java.util.Comparator;

public class TrainUtils {
    public static void sortByTrainNumber(Train[] trains) {
        Arrays.sort(trains, Comparator.comparingInt(a -> a.getTrainNumber()));
    }

    public static void sortByDestination(Train[] trains) {
        Arrays.sort(trains, Comparator.comparing(a -> a.getNameOfTheDestination()));

        Train[] sortingTrains = new Train[trains.length];
        for (int i = 0; i < trains.length; i++) {
            int j = i;
            while (j < trains.length && trains[i].getNameOfTheDestination().equals(trains[j].getNameOfTheDestination())) {
                j++;
            }
            if (j - i > 1) {
                Train[] trainsInner = new Train[j - i];
                for (int k = i, p = 0; k < j; k++, p++) {
                    trainsInner[p] = trains[k];
                }
                Arrays.sort(trainsInner, Comparator.comparing(a -> a.getTimeDeparture()));

                for (int k = i, p = 0; k < j; k++, p++) {
                    sortingTrains[k] = trainsInner[p];
                }
                i = j - 1;
            } else {
                sortingTrains[i] = trains[i];
            }


        }

        for (int i = 0; i < sortingTrains.length; i++) {
            trains[i] = sortingTrains[i];
        }

    }

}
