package module4ProgrammingWithClasses.aggregationAndComposition.task2;

import module4ProgrammingWithClasses.aggregationAndComposition.task1.Sentence;
import module4ProgrammingWithClasses.aggregationAndComposition.task1.Word;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        Car car;


        String infoCarName = "Input name of car";
        String infoCarBrand = "Input brand of car";
        String infoCarBody = "Input body of car";
        String infoCarCountOfDoors = "Input count of doors of car";
        String infoCarVolumeOfTanks = "Input volume of tanks of car";
        String infoCarLitersInTanks = "Input liters in tanks of car less then volume of tanks";

        String infoEngineName = "Input name of engine";
        String infoEngineVolume = "Input volume of engine";
        String infoEnginePower = "Input power of engine";
        String infoEngineNumberOfCylinders = "Input number of cylinders of engine";
        String infoEngineFuelConsumption = "Input number fuel consumption of engine";

        String infoFrontLeftWheelName = "Input name of front left of wheel";
        String infoFrontLeftWheelBrand = "Input brand of front left of wheel";
        String infoFrontLeftWheelDiameter = "Input diameter of front left of wheel";
        String infoFrontLeftWheelUnit = "Input unit of front left of wheel";

        String infoFrontRightWheelName = "Input name of front right of wheel";
        String infoFrontRightWheelBrand = "Input brand of front right of wheel";
        String infoFrontRightWheelDiameter = "Input diameter of front right of wheel";
        String infoFrontRightWheelUnit = "Input unit of front right of wheel";

        String infoRearLeftWheelName = "Input name of rear left of wheel";
        String infoRearLeftWheelBrand = "Input brand of rear left of wheel";
        String infoRearLeftWheelDiameter = "Input diameter of rear left of wheel";
        String infoRearLeftWheelUnit = "Input unit of rear left of wheel";

        String infoRearRightWheelName = "Input name of rear right of wheel";
        String infoRearRightWheelBrand = "Input brand of rear right of wheel";
        String infoRearRightWheelDiameter = "Input diameter of rear right of wheel";
        String infoRearRightWheelUnit = "Input unit of rear right of wheel";

        String infoMenu = "\nInput the number:\n" +
                "1-drive\n" +
                "2-refuel\n" +
                "3-replace wheel\n" +
                "4-get brand the car\n" +
                "5-get the car\n" +
                "other- exit";


        String parCarName = getStringValue(infoCarName);
        String parCarBrand = getStringValue(infoCarBrand);
        CarType parCarBody = getCarBody(infoCarBody);
        int parCarCountOfDoors = (int) getLongValue(infoCarCountOfDoors);
        double parCarVolumeOfTanks = getDoubleValue(infoCarVolumeOfTanks);
        double parCarLitersInTanks = getDoubleValue(infoCarLitersInTanks);

        String parEngineName = getStringValue(infoEngineName);
        double parEngineVolume = getDoubleValue(infoEngineVolume);
        int parEnginePower = (int) getLongValue(infoEnginePower);
        int parEngineNumberOfCylinders = (int) getLongValue(infoEngineNumberOfCylinders);
        double parEngineFuelConsumption = getDoubleValue(infoEngineFuelConsumption);

        String paramFrontLeftWheelName = getStringValue(infoFrontLeftWheelName);
        String paramFrontLeftWheelBrand = getStringValue(infoFrontLeftWheelBrand);
        double paramFrontLeftWheelDiameter = getDoubleValue(infoFrontLeftWheelDiameter);
        String paramFrontLeftWheelUnit = getStringValue(infoFrontLeftWheelUnit);

        String paramFrontRightWheelName = getStringValue(infoFrontRightWheelBrand);
        String paramFrontRightWheelBrand = getStringValue(infoFrontRightWheelBrand);
        double paramFrontRightWheelDiameter = getDoubleValue(infoFrontRightWheelDiameter);
        String paramFrontRightWheelUnit = getStringValue(infoFrontRightWheelUnit);

        String paramRearLeftWheelName = getStringValue(infoRearLeftWheelName);
        String paramRearLeftWheelBrand = getStringValue(infoRearLeftWheelBrand);
        double paramRearLeftWheelDiameter = getDoubleValue(infoRearLeftWheelDiameter);
        String paramRearLeftWheelUnit = getStringValue(infoRearLeftWheelUnit);

        String paramRearRightWheelName = getStringValue(infoRearRightWheelName);
        String paramRearRightWheelBrand = getStringValue(infoRearRightWheelBrand);
        double paramRearRightWheelDiameter = getDoubleValue(infoRearRightWheelDiameter);
        String paramRearRightWheelUnit = getStringValue(infoRearRightWheelUnit);


        car = new Car(parCarName, parCarBrand, parCarBody, parCarCountOfDoors, parCarVolumeOfTanks, parCarLitersInTanks,
                new Engine(parEngineName, parEngineVolume, parEnginePower, parEngineNumberOfCylinders, parEngineFuelConsumption),
                new Wheel(paramFrontLeftWheelName, paramFrontLeftWheelBrand, paramFrontLeftWheelDiameter, paramFrontLeftWheelUnit),
                new Wheel(paramFrontRightWheelName, paramFrontRightWheelBrand, paramFrontRightWheelDiameter, paramFrontRightWheelUnit),
                new Wheel(paramRearLeftWheelName, paramRearLeftWheelBrand, paramRearLeftWheelDiameter, paramRearLeftWheelUnit),
                new Wheel(paramRearRightWheelName, paramRearRightWheelBrand, paramRearRightWheelDiameter, paramRearRightWheelUnit));


        while (true) {

            choice = (int) getLongValue(infoMenu);

            switch (choice) {
                case 1:
                    double speed = getDoubleValue("Input speed the car");
                    LocalTime time = getLocalTime("Input time drive the car");

                    System.out.println("Car drive " + car.drive(speed, time) + " km");
                    System.out.println("Fuel in the car left= " + car.getLitersInTank() + "l");

                    break;

                case 2:
                    double refuel = getDoubleValue("Input number liters of fuel for refuel");

                    car.refuel(refuel);
                    System.out.println("Refueled");
                    System.out.println("Fuel in the car= " + car.getLitersInTank() + "l");

                    break;

                case 3:

                    String infoReplacing = "\nInput the number:\n" +
                            "1-front left wheel\n" +
                            "2-front right wheel\n" +
                            "3-rear left wheel\n" +
                            "other- rear right";

                    int replacingWheel = (int) getLongValue(infoReplacing);

                    String paramWheelName = getStringValue("Input name of wheel");
                    String paramWheelBrand = getStringValue("Input brand of wheel");
                    double paramWheelDiameter = getDoubleValue("Input diameter of wheel");
                    String paramWheelUnit = getStringValue("Input unit of wheel");

                    car.replaceWheel(replacingWheel, new Wheel(paramWheelName, paramWheelBrand, paramWheelDiameter, paramWheelUnit));

                    System.out.println("Replacing");

                    break;
                case 4:

                    System.out.println(car.getBrand());
                    break;
                case 5:
                    System.out.println(car);
                    break;

                default:

                    System.exit(0);
                    break;


            }
        }

    }

    private static long getLongValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while (true) {
            long a;
            if (scanner.hasNextLong()) {
                a = scanner.nextLong();
                return a;
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static String getStringValue(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        while (true) {
            if (scanner.hasNext("\\D+")) {
                return scanner.next("\\D+");
            } else {
                System.out.println("You have entered an invalid string, input string only letters");
                scanner.next();
            }
        }
    }

    private static CarType getCarBody(String message) {

        int choice, number = 1;
        System.out.println(message);


        for (CarType type : CarType.values()) {

            System.out.println("    " + number++ + "- " + type);

        }

        choice = (int) getLongValue("");

        switch (choice) {
            case 1:
                return CarType.CABRIOLET;
            case 2:
                return CarType.COUPE;
            case 3:
                return CarType.SEDAN;
            case 4:
                return CarType.UNIVERSAL;
            case 5:
                return CarType.LIFTBACK;
            default:
                return CarType.DEFAULT;
        }


    }

    private static double getDoubleValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while (true) {
            double a;
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                return a;
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static LocalTime getLocalTime(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message + " hour");

        int hour = -1, minute = -1;

        boolean flagHour = false;
        while (hour < 0 || hour > 23) {
            if (flagHour) {
                System.out.println("You have entered an invalid number, input 0 <= number < 24");

            }
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
                flagHour = true;

            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input 0 <= number < 24");
                scanner.next();
            }

        }


        System.out.println(message + " minute");

        boolean flagMinute = false;
        while (minute < 0 || minute > 59) {
            if (flagMinute) {
                System.out.println("You have entered an invalid number, input 0 <= number < 60 ");
            }
            if (scanner.hasNextInt()) {
                minute = scanner.nextInt();
                flagMinute = true;

            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input 0 <= number < 60 ");
                scanner.next();
            }

        }
        return LocalTime.of(hour, minute);
    }


}
