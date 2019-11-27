package module4ProgrammingWithClasses.elementaryClassesAndObjects.task6;


import static module4ProgrammingWithClasses.Service.getIntValue;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки
 * времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости
 * вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
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

        if (howSetClock == 1) {
            int hours = getIntValue(strHours);
            int minutes = getIntValue(strMinutes);
            int seconds = getIntValue(strSeconds);

            clock = new Clock(hours, minutes, seconds);
        } else {
            clock = new Clock();
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
                        intervalSeconds = getIntValue("Input interval seconds>0");

                    }

                    clock.changeToSecondsInterval(intervalSeconds);
                    clock.printClock();
                    break;

                case 4:
                    System.exit(0);
            }
        }


    }


}
