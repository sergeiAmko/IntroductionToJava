package module4ProgrammingWithClasses.elementaryClassesAndObjects.task8;

import module4ProgrammingWithClasses.elementaryClassesAndObjects.task7.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice, inner;

        CustomerUtils customerUtils = new CustomerUtils();

        String infoChoice = "\nInput number:\n" +
                "1- create and add new customer\n" +
                "2- get all customers\n" +
                "3- sort customers in alphabetical order\n" +
                "4- filter customers by number of credit card\n" +
                "other- exit";

        String infoFirstName = "Input first name customer";
        String infoLastName = "Input last name customer";
        String infoPatronymic = "Input patronymic customer";
        String infoAddress = "Input address customer";
        String infoCreditCardNumber = "Input credit card number customer";
        String infoBankAccountNumber = "Input bank account number customer";
        String infoBeginningRange = "Input beginning of the range to filter";
        String infoEndRange = "Input end of the range to filter";


        while (true) {

            choice = (int) getLongValue(infoChoice);

            switch (choice) {
                case 1:
                    String paramFirstName = getStringValue(infoFirstName);
                    String paramLastName = getStringValue(infoLastName);
                    String paramPatronymic = getStringValue(infoPatronymic);
                    String paramAddress = getStringValue(infoAddress);
                    Long paramCreditCardNumber = getLongValue(infoCreditCardNumber);
                    Long paramBankAccountNumber = getLongValue(infoBankAccountNumber);

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

    private static long getLongValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while (true) {
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
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

}
