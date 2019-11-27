package module4ProgrammingWithClasses.elementaryClassesAndObjects.task4;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
 * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
 * должны быть упорядочены по времени отправления.
 */
public class Main {
    public static void main(String[] args) {

        String strInputNumber = "Input number of train";
        int searching;
        int countTrains=20;

        Random random = new Random();
        Train[] trains = new Train[countTrains];

        for (int i = 0; i < trains.length; i++) {

            trains[i] = new Train("" + random.nextInt(10), random.nextInt(100_000),
                    LocalTime.of(random.nextInt(24), random.nextInt(60)));
        }

        System.out.println("Source array trains:");
        System.out.println(Arrays.toString(trains)+"\n");
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Sorted by destination array trains:");
        TrainUtils.sortByDestination(trains);
        System.out.println(Arrays.toString(trains));
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Sorted by train number array trains:");
        TrainUtils.sortByTrainNumber(trains);
        System.out.println(Arrays.toString(trains));
        System.out.println("_________________________________________________________________________________________");

        searching = getIntValue(strInputNumber);
        System.out.println("\n" + searchByTrainNumber(trains, searching));


    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    public static Train searchByTrainNumber(Train[] trains, int trainNumber) {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                return trains[i];
            }
        }
        return null;
    }


}
