
/**
 * Time Deposit Account
 *
 * @author Caleb Yun
 * @version 4/26/2018
 */
public class TimeDepositAccount extends BankAccount
{
    private double interestRate;
    private int months;
    private double penalty;
    
    public TimeDepositAccount() {
        super();
        interestRate = 0;
    }
    
    public TimeDepositAccount(double interestRate, int months, double penalty)
    {
        this.interestRate = interestRate;
        this.months = months;
        this.penalty = penalty;
    }
    
    public void withdraw(double amount)
    {
        if (months > 0)
            super.withdraw(penalty);
        super.withdraw(amount);
    }
    
    public void endOfMonth()
    {
        months--;
        double interest = super.getBalance() * interestRate / 100;
        super.deposit(interest);
    }
}
