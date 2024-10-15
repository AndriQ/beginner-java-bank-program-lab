package ioop.lab3;

public class DebitAccount extends BankAccount {

    public DebitAccount(String bank, String accountHolderName, String accountHolderTitle, double balance) {
        super(bank, accountHolderName, accountHolderTitle, balance);
    }

    public double processTransaction(char type, double amount) {
        if ((type == 'd') && ((balance - amount) < 0)) {
                System.out.println("Insufficient funds.");
                return balance;
            }
        return super.processTransaction(type, amount);
    }

}
