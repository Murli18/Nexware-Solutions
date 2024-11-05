package ATMinterface;

import java.util.Scanner;

public class AtmInterface {
    private BankAccount account;

    // Constructor to connect AtmInterface with a Bank Account
    
    public AtmInterface(BankAccount account) {
        this.account = account;
    }

    // Method to show AtmInterface options
    
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Welcome to the ATM ---");
            System.out.println("\n1. Check Balance");
            System.out.println("\n2. Deposit Money");
            System.out.println("\n3. Withdraw Money");
            System.out.println("\n4. Exit");
            System.out.print("\nChoose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Method to check balance
    
    private void checkBalance() {
        System.out.println("\nCurrent Balance: " + account.checkBalance());
    }

    // Method to deposit money
    
    private void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    // Method to withdraw money
    
    private void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Please collect your cash.");
        }
    }
}
