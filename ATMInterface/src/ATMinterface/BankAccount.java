package ATMinterface;

public class BankAccount {
    private double balance;

    // Constructor to initialize balance
    
    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    // Method to deposit amount
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nDeposit successful!\n New balance: " + balance);
        } else {
            System.out.println("\nInvalid deposit amount!");
        }
    }

    // Method to withdraw amount
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawal successful! \n New balance: " + balance);
            return true;
        } else {
            System.out.println("\nInsufficient balance or invalid amount!");
            return false;
        }
    }

    // Method to check balance
    
    public double checkBalance() {
        return balance;
    }
}
