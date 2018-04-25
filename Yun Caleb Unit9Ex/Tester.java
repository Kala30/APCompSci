
/**
 * Testers for Bank Accounts
 * 
 * @author Caleb Yun
 * @version 4/19/2018
 */
public class Tester
{
    public static void main(String[] args) throws Exception
    {
        // Test BankAccount
        BankAccount acct1 = new BankAccount(500);
        acct1.deposit(55);
        System.out.println("$" + acct1.getBalance());

        // Test SavingsAccount
        SavingsAccount acct2 = new SavingsAccount(500, 0.01);
        acct2.deposit(50);
        acct2.endOfMonth();
        System.out.println("$" + acct2.getBalance());

        // Test CheckingAccount
        CheckingAccount acct3 = new CheckingAccount(500, 0, 0.5);
        acct3.deposit(50);
        acct3.endOfMonth();
        System.out.println("$" + acct3.getBalance());

        BankAccount acct4 = new CheckingAccount(500, 8, 5);
        acct4.deposit(35); //CheckingAccount deposit is used
    }
}
