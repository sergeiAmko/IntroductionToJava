package module4ProgrammingWithClasses.aggregationAndComposition.task2;

import java.time.LocalTime;

import static module4ProgrammingWithClasses.Service.*;


/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */
public class Main {
    public static void main(String[] args) {

        int choice;
        Car car;

        String infoMenu = "\nInput the number:\n" +
                "1-drive\n" +
                "2-refuel\n" +
                "3-replace wheel\n" +
                "4-get brand the car\n" +
                "5-get the car\n" +
                "other- exit";


        String parCarName = getStringValueWithoutNumbers("Input name of car");
        String parCarBrand = getStringValueWithoutNumbers("Input brand of car");
        CarType parCarBody = getCarBody("Input body of car");
        int parCarCountOfDoors = getIntValue("Input count of doors of car");
        double parCarVolumeOfTanks = getDoubleValue("Input volume of tanks of car");
        double parCarLitersInTanks = getDoubleValue("Input liters in tanks of car less then volume of tanks");

        String parEngineName = getStringValueWithoutNumbers("Input name of engine");
        double parEngineVolume = getDoubleValue("Input volume of engine");
        int parEnginePower = getIntValue("Input power of engine");
        int parEngineNumberOfCylinders = getIntValue("Input number of cylinders of engine");
        double parEngineFuelConsumption = getDoubleValue("Input number fuel consumption of engine");

        String paramFrontLeftWheelName = getStringValueWithoutNumbers("Input name of front left of wheel");
        String paramFrontLeftWheelBrand = getStringValueWithoutNumbers("Input brand of front left of wheel");
        double paramFrontLeftWheelDiameter = getDoubleValue("Input diameter of front left of wheel");
        String paramFrontLeftWheelUnit = getStringValueWithoutNumbers("Input unit of front left of wheel");

        String paramFrontRightWheelName = getStringValueWithoutNumbers("Input name of front right of wheel");
        String paramFrontRightWheelBrand = getStringValueWithoutNumbers("Input brand of front right of wheel");
        double paramFrontRightWheelDiameter = getDoubleValue("Input diameter of front right of wheel");
        String paramFrontRightWheelUnit = getStringValueWithoutNumbers("Input unit of front right of wheel");

        String paramRearLeftWheelName = getStringValueWithoutNumbers("Input name of rear left of wheel");
        String paramRearLeftWheelBrand = getStringValueWithoutNumbers("Input brand of rear left of wheel");
        double paramRearLeftWheelDiameter = getDoubleValue("Input diameter of rear left of wheel");
        String paramRearLeftWheelUnit = getStringValueWithoutNumbers("Input unit of rear left of wheel");

        String paramRearRightWheelName = getStringValueWithoutNumbers("Input name of rear right of wheel");
        String paramRearRightWheelBrand = getStringValueWithoutNumbers("Input brand of rear right of wheel");
        double paramRearRightWheelDiameter = getDoubleValue("Input diameter of rear right of wheel");
        String paramRearRightWheelUnit = getStringValueWithoutNumbers("Input unit of rear right of wheel");


        car = new Car(parCarName, parCarBrand, parCarBody, parCarCountOfDoors, parCarVolumeOfTanks, parCarLitersInTanks,
                new Engine(parEngineName, parEngineVolume, parEnginePower, parEngineNumberOfCylinders, parEngineFuelConsumption),
                new Wheel(paramFrontLeftWheelName, paramFrontLeftWheelBrand, paramFrontLeftWheelDiameter, paramFrontLeftWheelUnit),
                new Wheel(paramFrontRightWheelName, paramFrontRightWheelBrand, paramFrontRightWheelDiameter, paramFrontRightWheelUnit),
                new Wheel(paramRearLeftWheelName, paramRearLeftWheelBrand, paramRearLeftWheelDiameter, paramRearLeftWheelUnit),
                new Wheel(paramRearRightWheelName, paramRearRightWheelBrand, paramRearRightWheelDiameter, paramRearRightWheelUnit));


        while (true) {

            choice = getIntValue(infoMenu);

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

                    int replacingWheel = getIntValue(infoReplacing);

                    String paramWheelName = getStringValueWithoutNumbers("Input name of wheel");
                    String paramWheelBrand = getStringValueWithoutNumbers("Input brand of wheel");
                    double paramWheelDiameter = getDoubleValue("Input diameter of wheel");
                    String paramWheelUnit = getStringValueWithoutNumbers("Input unit of wheel");

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


    private static CarType getCarBody(String message) {

        int choice, number = 1;
        System.out.println(message);


        for (CarType type : CarType.values()) {

            System.out.println("    " + number++ + "- " + type);

        }

        choice = getIntValue("Choice");

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


}
