package ioop.lab3;

public class CreditAccount extends BankAccount {
    private double overdraft;

    public CreditAccount(String bank, String accountHolderName, String accountHolderTitle, double balance, double overdraft) 
    {
        super(bank, accountHolderName, accountHolderTitle, balance);
        this.overdraft = overdraft;
    }
     
    public double processTransaction(char type, double amount) {
        if ((type == 'd') && ((balance - amount) < -(overdraft))) {
                System.out.println("Transaction declined - overdraft limit reached");
                return balance;
         }
        return super.processTransaction(type, amount);
    }

}
