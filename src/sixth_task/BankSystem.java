package sixth_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankSystem {
    private static List<BankAccount> accounts = new ArrayList<>(); // Bütün hesablara nəzarət etmək üçün siyahı
    private static Scanner scanner = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Please entered accountNumber : ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine(); // for buffer problem

        System.out.print("Please entered accountHolderName : ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Please entered initial balance : ");
        double initialBalance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);
        accounts.add(bankAccount);
        System.out.println("Account Created Successfully!");
    }

    public void deposit() {
        System.out.println("Entered account number");
        long accountNumber = scanner.nextLong();

        BankAccount bankAccount = findAccount(accountNumber);
        if (bankAccount == null) {
            System.out.println("Bank acoount not found");
            return;
        }
        System.out.print("Enter Amount to Deposit: ");
        double amount = scanner.nextDouble();

        bankAccount.deposit(amount);
        System.out.println("Deposit successful!");

    }

    public void withdraw() {
        System.out.println("Entered account number");
        long accountNumber = scanner.nextLong();
        BankAccount bankAccount = findAccount(accountNumber);
        if (bankAccount == null) {
            System.out.println("Bank acoount not found");
            return;
        }
        System.out.print("Enter Amount to withdraw: ");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
        System.out.println("Withdraw successful!");
    }

    public void viewBalance() {
        System.out.println("Entered account number");
        long accountNumber = scanner.nextLong();
        BankAccount bankAccount = findAccount(accountNumber);

        if (bankAccount == null) {
            System.out.println("Bank acoount not found");
            return;
        }
        System.out.println("Balance for account " + accountNumber + "--> " + bankAccount.getBalance() + " AZN");
    }

    public void transactionHistory() {
        System.out.print("Enter Account Number: ");
        long accountNumber = scanner.nextLong();

        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        List<String> history = account.getTransactionHistory();
        if (history.isEmpty()) {
            System.out.println("No transactions found for this account.");
        } else {
            System.out.println("Transaction History for Account " + accountNumber + ":");
            for (String transaction : history) {
                System.out.println(transaction);
            }
        }
    }

    public static void menu() {
        String menu = "1.Create account\n" +
                "2.Deposit\n" +
                "3.Withdraw\n" +
                "4.View Balance\n" +
                "5.Transaction History\n" +
                "6.Exit\n";
        System.out.println(menu);
    }


    public BankAccount findAccount(long accountNumber) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                return bankAccount;
            }
        }
        return null;
    }
}