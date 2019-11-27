package module4ProgrammingWithClasses.aggregationAndComposition.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static module4ProgrammingWithClasses.Service.getLongValue;


/**
 * . Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {
    public static void main(String[] args) {
        Path pathSource = Paths.get("E:\\java\\projects\\IntroductionToJava\\tasks\\src\\main\\java\\" +
                "module4ProgrammingWithClasses\\aggregationAndComposition\\task4\\source.txt");


        try (BufferedReader bufferedReader = Files.newBufferedReader(pathSource)) {

            String s, firstName, lastName;
            long balance;
            boolean lock;
            List<Customer> customers = new ArrayList<>();

            while ((s = bufferedReader.readLine()) != null) {

                String[] sSplit = s.split(" ");

                lastName = sSplit[0];
                firstName = sSplit[1];
                balance = Long.valueOf(sSplit[2]);
                if (sSplit.length < 4) {
                    lock = false;
                } else lock = !sSplit[3].equals("false");

                int index = getIndexContainCustomer(customers, firstName, lastName);

                if (index >= 0) {
                    customers.get(index).addAccount(new Account(balance, lock));
                } else {
                    Customer customer = new Customer(firstName, lastName);
                    customer.addAccount(new Account(balance, lock));
                    customers.add(customer);

                }


            }


            for (Customer customer : customers) {
                System.err.println("\n" + customer.getLastName() + " " + customer.getFirstName());

                customer.sortById();

                System.out.println("General sum- " + customer.sumGeneral());
                System.out.println("Positive sum- " + customer.sumPositive());
                System.out.println("Negative sum- " + customer.sumNegative());

                System.out.println("Sorted by id");
                System.out.println("Is it search?-" + customer.searchById(getLongValue("Input number for searching on ID")));
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("ERROR opening of file");
        }

    }

    public static int getIndexContainCustomer(List<Customer> customers, String firstName, String lastName) {
        int p = 0;
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(firstName) && customer.getLastName().equals(lastName)) {
                return p;
            }
            p++;
        }
        return -1;

    }


}
