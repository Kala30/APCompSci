
/**
 * Checking Account
 * 
 * @author Caleb Yun
 * @version 4/19/2018
 */
public class CheckingAccount extends BankAccount
{
    int transactionCount;
    final int FREE_TRANSACTIONS;
    final double TRANSACTION_FEE;
    
    public CheckingAccount(double balance, int freeTransactions, double transactionFee) {
        super(balance);
        FREE_TRANSACTIONS = freeTransactions;
        TRANSACTION_FEE = transactionFee;
    }
    
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }
    
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }
    
    public void endOfMonth() {
        if (FREE_TRANSACTIONS < transactionCount)
            super.withdraw(TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS));
    }
}

