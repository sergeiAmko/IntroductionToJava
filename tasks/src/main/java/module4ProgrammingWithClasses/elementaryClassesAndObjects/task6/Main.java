package module4ProgrammingWithClasses.elementaryClassesAndObjects.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inner;
        int howSetClock;
        Clock clock;
        String createTime = "Input time:\n" +
                "1- set time\n" +
                "other number - defaults time";
        String infoActive = "Input number:\n" +
                "1-change hours\n" +
                "2-change minutes\n" +
                "3-change seconds\n" +
                "4-exit";
        String strHours = "Input hours ";
        String strMinutes = "Input minutes";
        String strSeconds = "Input seconds";

        howSetClock = getIntValue(createTime);

        switch (howSetClock) {
            case 1:
                int hours = getIntValue(strHours);
                int minutes = getIntValue(strMinutes);
                int seconds = getIntValue(strSeconds);

                clock = new Clock(hours, minutes, seconds);
                break;

            default:
                clock = new Clock();
                break;

        }

        clock.printClock();


        while ((inner = getIntValue(infoActive)) >= 1 && inner <= 4) {
            switch (inner) {
                case 1:
                    int intervalHours = getIntValue("Input interval hours >0");

                    while (intervalHours < 0) {
                        intervalHours = getIntValue("Input interval hours >0");
                    }

                    clock.changeToHoursInterval(intervalHours);
                    clock.printClock();
                    break;

                case 2:
                    int intervalMinutes = getIntValue("Input interval minutes>0");

                    while (intervalMinutes < 0) {
                        intervalMinutes = getIntValue("Input interval minutes>0");

                    }

                    clock.changeToMinutesInterval(intervalMinutes);
                    clock.printClock();
                    break;

                case 3:
                    int intervalSeconds = getIntValue("Input interval seconds>0");

                    while (intervalSeconds < 0) {
                        intervalSeconds= getIntValue("Input interval seconds>0");

                    }

                    clock.changeToSecondsInterval(intervalSeconds);
                    clock.printClock();
                    break;

                case 4:
                    System.exit(0);
            }
        }


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


}
