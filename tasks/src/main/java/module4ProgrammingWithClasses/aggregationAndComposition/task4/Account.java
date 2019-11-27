package module4ProgrammingWithClasses.aggregationAndComposition.task4;

public class Account {
    private static long idGenerate=0;

    private long id=idGenerate++;
    private double balance;
    private boolean lock;

    public Account(double balance, boolean lock) {
        this.balance = balance;
        this.lock = lock;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", lock=" + lock +
                '}';
    }
}
