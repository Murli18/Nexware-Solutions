package ATMinterface;

public class ATM {
    public static void main(String[] args) {
    	
        // Create a Bank Account with an starting balance of 1000
        BankAccount account = new BankAccount(1000);

        // Create an AtmInterface instance connected to the account
        
        AtmInterface atm = new AtmInterface(account);

        // Show AtmInterface menu
        
        atm.showMenu();
    }
}
