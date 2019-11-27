package module4ProgrammingWithClasses.aggregationAndComposition.task4;

import javax.print.DocFlavor;
import javax.xml.stream.events.EntityReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customer {
    private static long idGenerate;

    private long id = idGenerate++;
    private String firstName;
    private String lastName;
    List<Account> accounts = new ArrayList<>();


    public long addAccount(Account account) {

        accounts.add(account);
        return account.getId();
    }

    public double sumGeneral() {
        double sum = 0;

        for (Account account : accounts) {
            if (!account.isLock()) {
                sum += account.getBalance();
            }
        }

        return sum;
    }

    public double sumPositive() {
        double sum = 0;

        for (Account account : accounts) {
            if (!account.isLock() && account.getBalance() > 0) {
                sum += account.getBalance();
            }
        }

        return sum;

    }

    public double sumNegative() {
        double sum = 0;

        for (Account account : accounts) {
            if (!account.isLock() && account.getBalance() < 0) {
                sum += account.getBalance();
            }
        }

        return sum;

    }

    public boolean searchById(long id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void sortById() {
        accounts.sort(Comparator.comparing(Account::getId));

    }


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
