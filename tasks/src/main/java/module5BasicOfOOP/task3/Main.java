package module5BasicOfOOP.task3;


import static module5BasicOfOOP.Service.getBoolean;
import static module5BasicOfOOP.Service.getIntValue;

/**
 * Создать класс Календарь с внутренним классом, с помощью которого можно хранить информацию о
 * выходных и праздничных днях
 */

public class Main {
    public static void main(String[] args) {

        String infoMenu = "\nInput the number:\n" +
                "   1-update holiday\n" +
                "   2-print the month\n" +
                "   other- exit";

        int choice;
        int year = getIntValue("Input year for calendar");
        int dayOfOneJanuary = getIntValue("Input the day of the week for January 1", 1, 7);

        Calendar calendar = new Calendar(year, dayOfOneJanuary);

        while (true) {

            choice = getIntValue(infoMenu);
            switch (choice) {
                case 1:

                    System.err.println("Update the holiday- " + calendar.setHoliday(
                            getIntValue("Input the day of the month"),
                            getIntValue("Input number of the month", 1, 12),
                            getBoolean("Input the boolean is the day a holiday")));
                    break;

                case 2:

                    calendar.printMonth(getIntValue("Input the month", 1, 12) - 1);

                    break;


                default:

                    System.exit(0);
                    break;


            }
        }


    }


}
