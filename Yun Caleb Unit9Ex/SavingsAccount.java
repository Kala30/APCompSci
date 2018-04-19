
/**
 * Savings Account Example
 * 
 * @author Caleb Yun
 * @version 4/19/2018
 */
public class SavingsAccount extends BankAccount
{
    double interestRate;
    
    public SavingsAccount() {
        super();
        interestRate = 0;
    }
    
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    
    public void endOfMonth() {
        // Can't use balance field variable because it is private
        // so you must use the super class' methods to access and
        // change balance
        double interest = super.getBalance() * interestRate / 100;
        super.deposit(interest);
    }
}
