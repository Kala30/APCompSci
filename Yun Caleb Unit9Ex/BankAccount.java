
/**
 * Bank Account Example
 * 
 * @author Caleb Yun
 * @version 4/19/2018
 */
public abstract class BankAccount
{
    private double balance;
    
    public BankAccount() {
        balance = 0;
    }
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        //if (amount < 0)
        //    throw new Exception("Amount cannot be less than 0");
        balance += amount;
    }
    
    public void withdraw(double amount) {
        //if (amount < 0)
        //    throw new Exception("Amount cannot be less than 0");
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void transfer(double amount, BankAccount account) {
        withdraw(amount);
        account.deposit(amount);
    }
    
    public abstract void endOfMonth();
}
