package sixth_task;

import java.util.Scanner;

public class BasicBankingSystem {
    public static void UserInput() {
        Scanner scanner = new Scanner(System.in);
        BankSystem bankSystem = new BankSystem();
        System.out.println("Welcome to Banking System\n");
        while (true) {
            BankSystem.menu();
            System.out.println("Please choose one operation : ");
            int operation = scanner.nextInt();
            if (operation == 6) {
                System.out.println("System exited");
                break;
            }
            switch (operation) {
                case 1:
                    bankSystem.createAccount();
                    break;
                case 2:
                    bankSystem.deposit();
                    break;
                case 3:
                    bankSystem.withdraw();
                    break;
                case 4:
                    bankSystem.viewBalance();
                    break;
                case 5:
                    bankSystem.transactionHistory();
                    break;
                default:
                    System.out.println("Wrong choose,please tyr again!");

            }
        }
    }
}
