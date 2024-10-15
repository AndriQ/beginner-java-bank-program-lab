package ioop.lab3;

public class Bank {
    private BankAccount[] bankAccounts = new BankAccount[5];

    public Bank() {
        bankAccounts[0] = new BankAccount("Batwest", "John Smith", "Mr", 0);
        bankAccounts[1] = new BankAccount("Batwest", "Johnny Smith", "Mrs", 0);
        bankAccounts[2] = new BankAccount("Batwest", "Jonathan Smith", "Dr", 0);
        bankAccounts[3] = new BankAccount("Boyds", "Joe Smith", "Dr", 0);
        bankAccounts[4] = new BankAccount("Batwest", "Jack Smith", "Mr", 0);
    }



    public void addBankAccount(BankAccount newAccount) {
        BankAccount[] newBankAccounts = new BankAccount[bankAccounts.length + 1];
   
        for (int i = 0; i < bankAccounts.length; i++) {
            newBankAccounts[i] = bankAccounts[i];
        }
        newBankAccounts[newBankAccounts.length-1] = newAccount;
        bankAccounts = newBankAccounts;
    }

    public int findIndexOfAccount(BankAccount accountToFind) {
        int index = 0;
        for (int i = 0; i < bankAccounts.length; i++) { 
            System.out.println(bankAccounts[i]);
            if (bankAccounts[i].checkBank(accountToFind.getBank()) == true) {
                if (bankAccounts[i].checkName(accountToFind.getAccountHolderName()) == true) {
                    if (bankAccounts[i].checkTitle(accountToFind.getAccountHolderTitle()) == true) {
                        return index;
                    }
                }
            }
            index += 1;
        }
        return -1; // not found
    }

    public void removeBankAccount(BankAccount removeAccount) {
        BankAccount[] newB_Accounts = new BankAccount[bankAccounts.length - 1];

        int index = findIndexOfAccount(removeAccount);

        for (int i = 0, k = 0; i < bankAccounts.length; i++) {  
            if (i == index) {
                continue;
            }
            newB_Accounts[k++] = bankAccounts[i];       
        }
        bankAccounts = newB_Accounts;
    }

    public void handleTransaction(BankAccount target, double amount, char type) {
        target.processTransaction(type, amount);
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public static void main(String[] args) {

        
    }

}
