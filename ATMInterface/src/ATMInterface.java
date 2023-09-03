public class ATMInterface {
    public static void main(String[] args) {
AccountBalance userAccount = new AccountBalance(1000.0); // Initial balance

        ATMMachine atm = new ATMMachine(userAccount);
        atm.run();
    }
}