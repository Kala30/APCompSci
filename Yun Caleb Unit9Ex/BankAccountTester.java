public class BankAccountTester extends junit.framework.TestCase
{
    private BankAccount accountTest;
    private TimeDepositAccount account;

    protected void setUp()
    // Set up the objects before the tests are run
    {
        account = new TimeDepositAccount(5.0, 12, 50);
        account.deposit(1000);
    }

    public void testTimeDepositAccount1()
    {
        assertEquals(1000.0, account.getBalance());
        assertEquals(1000.0, account.getBalance());
    }

    public void testTimeDepositAccount2()
    {
        assertEquals(1000.0, account.getBalance());
        account.withdraw(100);
        account.withdraw(300);
        account.deposit(100);
        assertEquals(600.0, account.getBalance());
    }

    public void testTimeDepositAccount3()
    {
        assertEquals(1000.0, account.getBalance());
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.withdraw(100);
        assertEquals(Math.round(1785.649142), Math.round(account.getBalance()));
    }
    
    public void testTimeDepositAccount4()
    {
        assertEquals(1000.0, account.getBalance());
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.endOfMonth();
        account.withdraw(100);
        assertEquals(Math.round(1560.339358), Math.round(account.getBalance()));
    }

}