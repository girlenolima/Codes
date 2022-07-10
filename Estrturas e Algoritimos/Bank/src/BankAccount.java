public class BankAccount {

    private double balance;

    public BankAccount(double balance) {

        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "BankAccount{" + "balance=" + balance + '}';
    }

    public void deposit(double amount) {

        balance = balance + amount;

    }

    public void withdraw(double amount) {

        balance = balance - amount;

    }

}
