import java.util.Scanner;
public class ATMMachine{
    AccountBalance account;

    public ATMMachine(AccountBalance account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("--------------------------------------");
        System.out.println("Welcome to the ATM Machine");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.print("Insufficient funds or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public void checkBalance() {
        System.out.println("Your balance is: " + account.checkBalance());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Transactions done successfully!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}