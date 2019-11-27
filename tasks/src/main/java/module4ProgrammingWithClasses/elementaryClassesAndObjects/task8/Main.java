package module4ProgrammingWithClasses.elementaryClassesAndObjects.task8;

import static module4ProgrammingWithClasses.Service.getLongValue;
import static module4ProgrammingWithClasses.Service.getStringValueWithoutNumbers;


/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и
 * get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с
 * подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {

    public static void main(String[] args) {

        int choice;

        CustomerUtils customerUtils = new CustomerUtils();

        String infoChoice = "\nInput number:\n" +
                "1- create and add new customer\n" +
                "2- get all customers\n" +
                "3- sort customers in alphabetical order\n" +
                "4- filter customers by number of credit card\n" +
                "other- exit";

        String infoBeginningRange = "Input beginning of the range to filter";
        String infoEndRange = "Input end of the range to filter";


        while (true) {

            choice = (int) getLongValue(infoChoice);

            switch (choice) {
                case 1:
                    String paramFirstName = getStringValueWithoutNumbers("Input first name customer");
                    String paramLastName = getStringValueWithoutNumbers("Input last name customer");
                    String paramPatronymic = getStringValueWithoutNumbers("Input patronymic customer");
                    String paramAddress = getStringValueWithoutNumbers("Input address customer");
                    long paramCreditCardNumber = getLongValue("Input credit card number customer");
                    long paramBankAccountNumber = getLongValue("Input bank account number customer");

                    customerUtils.add(paramFirstName, paramLastName, paramPatronymic
                            , paramAddress, paramCreditCardNumber, paramBankAccountNumber);

                    break;

                case 2:
                    System.out.println("All customers:");
                    CustomerUtils.print(customerUtils.getCustomers());

                    break;

                case 3:
                    customerUtils.sortInAlphabetical();
                    System.out.println("Sorted");
                    break;

                case 4:
                    long beginningRange = getLongValue(infoBeginningRange);
                    long endRange = getLongValue(infoEndRange);

                    while (beginningRange > endRange) {
                        System.out.println("ERROR: beginning > end\n " +
                                "input right numbers");
                        beginningRange = getLongValue(infoBeginningRange);
                        endRange = getLongValue(infoEndRange);
                    }

                    System.out.println("sort customers in alphabetical order");

                    CustomerUtils.print(customerUtils.filterAtRange(beginningRange, endRange));
                    break;

                default:

                    System.exit(0);
                    break;


            }
        }


    }


}
