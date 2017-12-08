
/**
 * APCS: Soda Machine Class
 * 
 * @author Caleb Yun
 * @version Created on 12/6/2017
 */
public class SodaMachine
{
    // -- Field Variables --
    private int sodaPrice;
    private int numberOfSodas;
    private int totalMoney;
    private int balance; //money customer has inserted into machine
    
    private final int MACHINE_CAPACITY = 300;

    
    // -- Constructors --
    public SodaMachine()
    {
        sodaPrice = 75;
        numberOfSodas = 200;
        totalMoney = 0;
        balance = 0;
    }

    
    // Overload
    public SodaMachine(int price, int num)
    {
        sodaPrice = price;
        if (num > 0 && num <= MACHINE_CAPACITY)
            numberOfSodas = num;
        else {
            numberOfSodas = MACHINE_CAPACITY;
            System.out.println("Maximum capacity is " + MACHINE_CAPACITY + " sodas!");
        }
        totalMoney = 0;
        balance = 0;
    }

    
    // -- Methods --

    // Mutater/setter methods
    public void insertMoney(int amt)
    { 
        balance += amt;
    }

    public boolean buySoda()
    {
        if (numberOfSodas <= 0)
        {
            System.out.println("Sold Out!");
            return false;
        }
        else {
            if (balance >= sodaPrice)
            {
                System.out.println("###SODA###");
                numberOfSodas--;
                balance -= sodaPrice;
                totalMoney += sodaPrice;
                return true;
            }
            else
            {
                System.out.println("You have not inserted enough money.");
                System.out.println("Please insert " + (sodaPrice - balance) + " cents.");
                return false;
            }
        }
    }

    public int refundBalance()
    {
        int amtToRefund = balance;
        balance = 0;
        return amtToRefund;
    }

    // Getter/Accessor methods
    public int getPrice()
    {
        return sodaPrice;
    }

    public int getBalance()
    {
        return balance;
    }

    public int getTotalMoney()
    {
        return totalMoney;
    }

    public int getNumberOfSodas()
    {
        return numberOfSodas;
    }
    
    public boolean refillMachine()
    {
        if (numberOfSodas == MACHINE_CAPACITY) {
            return false;
        } else {
            numberOfSodas = MACHINE_CAPACITY;
            return true;
        }
    }
    
    public int getMaxCapacity()
    {
        return MACHINE_CAPACITY;
    }
}
