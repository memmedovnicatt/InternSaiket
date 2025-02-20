package sixth_task;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory = new ArrayList<>();

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        balance += money;
        transactionHistory.add("Deposited: " + money);
        System.out.println("New balance : " + balance);
    }

    public void withdraw(double money) {
        if (money > balance) {
            System.out.println("You do not have enough funds in your balance");
        } else {
            balance -= money;
            transactionHistory.add("Withdrawn: " + money);
            System.out.println("New balance :" + balance);
        }
    }

    public void transactionHistory() {
        System.out.println("Transaction History");

        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}