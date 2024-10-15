package ioop.lab3;

public class ChildrensAccount extends DebitAccount {
    private double maximumAmount;

    public ChildrensAccount(String bank, String accountHolderName, String accountHolderTitle, double balance, double maximumAmount) {
        super(bank, accountHolderName, accountHolderTitle, balance);
        this.maximumAmount = maximumAmount;
    }

    public double processTransaction(char type, double amount) {
        if ((type == 'c') && ((balance + amount) > maximumAmount)) {
                System.out.println("Maximum amount will be reached. Transaction ignored.");
                return balance;
            }
        return super.processTransaction(type, amount);
    }
    
}
