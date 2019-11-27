package module5BasicOfOOP.task5;


import static module5BasicOfOOP.Service.*;

/**
 * Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 * Составляющими целого подарка являются сладости и упаковка
 */

public class Main {

    public static void main(String[] args) {


        Present present;

        String infoMenu = "\nInput the number:\n" +
                "   1-add a sweetness\n" +
                "   2-update packing\n" +
                "   3-get cost the present\n" +
                "   other- exit";

        int choice;

        present = new Present(getStringLine("Input the name of present"));

        while (true) {

            choice = getIntValue(infoMenu);
            switch (choice) {
                case 1:

                    boolean isAdd = present.addSweetness(new Sweetness.Builder(getStringLine("Input the name of sweetness"))
                            .setCompany(getStringLine("Input the company of the sweetness"))
                            .setColor(getStringLine("Input the color of the sweetness"))
                            .setWeight(getDoublePositiveValue("Input weight of the sweetness"))
                            .setCost(getDoublePositiveValue("Input cost of the sweetness"))
                            .build());

                    System.out.println(isAdd ? "Sweetness was added" : "Sweetness wasn't added");
                    break;

                case 2:

                    boolean isPack = present.pack(new Packing(
                            getStringLine("Input name of the packing"),
                            getDoublePositiveValue("Input cost of the packing")
                    ));

                    System.out.println(isPack ? "Packing was updated" : "Packing wasn't updated");


                    break;

                case 3:

                    System.out.println("Cost of the present= " + present.getCost());

                    break;

                default:

                    System.exit(0);
                    break;


            }

        }


    }


}
