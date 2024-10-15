package ioop.lab3;

public class AccountManagement {
    static String bankLine = "| Bank: ";
    static String accountHolderLine = "| Account Holder: ";
    static String balanceLine = "| Balance: ";

    public static void printFormattedAccount(BankAccount account) {
        bankLine = "| Bank: " + account.getBank();
        accountHolderLine ="| Account Holder: " + account.getAccountHolderTitle() + " "
                + account.getAccountHolderName();
        balanceLine = "| Balance: " + account.getBalance();
        int maxLength = Math.max(bankLine.length(), Math.max(accountHolderLine.length(), balanceLine.length()));
        int separatorLength = maxLength + 4;
        int barPosition = separatorLength;
        String separator = "+";
        String rep = "";
        for(int i=0;i<separatorLength-2;i++) {
            rep += "-";
            }
        separator = separator + rep + "+";
        // I have a problem with the below line so I just did what it does without the repeat method.
       // String separator = "+" + "-".repeat(separatorLength - 2) + "+";
        bankLine = padLine(bankLine, barPosition);
        accountHolderLine = padLine(accountHolderLine, barPosition);
        balanceLine = padLine(balanceLine, barPosition);
        System.out.println(separator);
        System.out.println(bankLine);
        System.out.println(separator);
        System.out.println(accountHolderLine);
        System.out.println(separator);
        System.out.println(balanceLine);
        System.out.println(separator);
    }

    private static String padLine(String line, int barPosition) {
        StringBuilder paddedLine = new StringBuilder(line);
        while (paddedLine.length() < barPosition - 1) {
            paddedLine.append(" ");
        }
        return paddedLine.toString() + "|";
    }


    public static boolean fraudDetected(BankAccount suspisciousAccount, double amount) {
        if (amount > (suspisciousAccount.highestStoredAmount/2)) {
            return true;
        }
        return false;
    }

}
