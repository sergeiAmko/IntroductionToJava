package module5BasicOfOOP.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static module5BasicOfOOP.Service.getIntValue;
import static module5BasicOfOOP.Service.getStringLine;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нексольких товаров
 */
public class Main {
    public static void main(String[] args) {

        List<Payment> payments = new ArrayList<>();
        int choice;

        String infoMenu = "\nInput the number:\n" +
                "1-add the payment\n" +
                "2-add the product to the payment\n" +
                "3-print the payment\n" +
                "other- exit";


        while (true) {

            choice = getIntValue(infoMenu);
            switch (choice) {
                case 1:

                    payments.add(new Payment(getStringLine("Input the name of payment")));

                    break;

                case 2:

                    choicePayment(payments, "Choice payment")
                            .addProduct(getStringLine("Input name of the product"),
                                    getIntValue("Input the cost of the product more 0", 0, Integer.MAX_VALUE));

                    break;

                case 3:

                    choicePayment(payments, "Choice the payment for print").print();
                    break;

                default:

                    System.exit(0);
                    break;


            }
        }


    }





    private static Payment choicePayment(List<Payment> payments, String message) {

        System.out.println(message);

        int i = 0;
        for (Payment payment : payments) {
            System.out.println((++i) + "- " + payment.getName());
        }

        int choice = getIntValue("Choice the payment", 1, payments.size());

        return payments.get(choice - 1);

    }


}
