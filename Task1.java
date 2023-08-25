import java.util.ArrayList;

class BankAccount {
    private double balance;
    private ArrayList<String> transactions;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        transactions = new ArrayList<String>();
        transactions.add("Initial balance: " + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposit: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add("Withdrawal: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);
        myAccount.deposit(505.22);
        myAccount.withdraw(100);
        System.out.println("Current balance: " + myAccount.getBalance());
        System.out.println("Transaction history:");
        myAccount.printTransactions();
    }
}
