package module5BasicOfOOP.task4;

import java.util.List;

import static module5BasicOfOOP.task4.Consoles.getIntValue;

/**
 * Создать програму, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, сабора самого дорогого по стоимости сокровища и выбора сокравищ на заданную сумму.
 */

public class Main {

    public static void main(String[] args) {

        TreasuresUtil treasuresUtil = new TreasuresUtil();
        Consoles consoles = new Consoles(treasuresUtil);


        String infoMenu = "\nInput the number:\n" +
                "   1-see all the treasuresUtil\n" +
                "   2-see the most expensive treasure\n" +
                "   3-choice the treasuresUtil for amount\n" +
                "   other- exit";

        int choice;

        while (true) {

            choice = getIntValue(infoMenu);
            switch (choice) {
                case 1:

                    treasuresUtil.print();
                    break;

                case 2:

                    System.out.println("The most expensive= " + treasuresUtil.max());

                    break;

                case 3:

                    List<Treasure> treasuresOrder = consoles.selectAmountOfTreasure(
                            getIntValue("Input amount for choice treasuresUtil", 0, Integer.MAX_VALUE));

                    System.out.println("your choice treasures");
                    TreasuresUtil.print(treasuresOrder);

                    break;

                default:

                    System.exit(0);
                    break;


            }
        }

    }

}
