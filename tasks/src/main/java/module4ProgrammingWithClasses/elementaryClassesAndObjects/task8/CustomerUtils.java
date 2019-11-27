package module4ProgrammingWithClasses.elementaryClassesAndObjects.task8;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerUtils {


    private Customer[] customers;
    private int startLength = 16;
    private int count = 0;

    public CustomerUtils() {
        this.customers = new Customer[startLength];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void add(Customer customer) {
        if (count == customers.length) {
            Customer[] middleCustomers = new Customer[customers.length * 2];

            for (int i = 0; i < customers.length; i++) {
                middleCustomers[i] = customers[i];
            }

            customers = middleCustomers;

        }

        customers[count++] = customer;
    }

    public void add(String firstName, String lastName, String patronymic,
                    String address, long creditCardNumber, long bankAccauntNumber) {
        this.add(new Customer(firstName, lastName, patronymic, address, creditCardNumber, bankAccauntNumber));
    }


    public void sortInAlphabetical() {
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName)
                .thenComparing(Customer::getFirstName)
                .thenComparing(Customer::getPatronymic)
                .thenComparing(Customer::getBankAccountNumber)
        );
    }

    public Customer[] filterAtRange(long startIncluding, long endNotIncluding) {

        Customer[] filterCustomers = new Customer[customers.length];
        Customer[] outCustomer = null;

        int i = 0;

        if (startIncluding > endNotIncluding) {
            long l = startIncluding;
            startIncluding = endNotIncluding;
            endNotIncluding = l;
        }

        for (int p = 0; p < count; p++) {

            if (customers[p].getCreditCardNumber() >= startIncluding &&
                    customers[p].getCreditCardNumber() < endNotIncluding) {
                filterCustomers[i++] = customers[p];
            }
        }

        if (i != 0) {
            i--;
            outCustomer = new Customer[i];

            for (int j = 0; j < i; j++) {
                outCustomer[j] = filterCustomers[j];
            }
        }

        return outCustomer;

    }

    public static void print(Customer[] customers) {
        if (customers != null) {

            for (Customer customer : customers) {
                if (customers[0] == null) {
                    System.out.println("List is empty");
                    return;
                } else if (customer == null) {
                    return;
                } else {
                    System.out.println(customer);
                }
            }
        }else {
            System.out.println("List customers is empty\n");
        }
    }
}
