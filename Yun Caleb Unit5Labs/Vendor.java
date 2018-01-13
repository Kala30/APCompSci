

/**
 * This class implements a vendor that sells one kind
 * of item. A vendor carries out sales transactions.
 */
public class Vendor
{
    //Vendor fields go here:  
    int stock;
    int price;
    int deposit;
    int change;
    static double totalSales;

    /**
     * Construct a Vendor
     *    price is the price of a single item in cents (int)
     *    stock is the number of items to place in stock (int)
     */
    public Vendor(int price, int stock)
    {
        this.price = price;
        this.stock = stock;
    }

    /**
     *   Set the quantity of items in stock to the incoming value.
     *   stock is the number of items to place in stock (int)
     */
    public void setStock(int stock)
    {
        this.stock = stock;
    }

    /**
     * Report the number of items that are currently in stock.
     *    return value is (int)
     */
    public int getStock()
    {
        return this.stock;
    }



    /**
     * Add an amount of money (in cents) to the buyer's deposited 
     * money total to keep track of what they deposit for this sale.
     *    d is the number of cents to add to the current deposit (int)
     */
    public void addMoney(int d)
    {
        deposit += d;
    }

    /**
     * Return the currently deposited amount of money by the buyer (in cents).
     *     return value is (int)
     */
    public int getDeposit()
    {
        return deposit;
    }

    /**
     * Implement a sale.  
     * If there are items currently in stock and the deposited amount
     * is greater than or equal to the price for one item,
     * then adjust the stock down by one item and calculate the change.
     *   return true for a successful sale
     * otherwise refund the whole deposit amount(moves it into change)
     *   return false for sale not successful
     * return value is (boolean)
     */
    public boolean makeSale()
    {
        if (stock > 0 && deposit >= price) {
            stock--;
            totalSales += price / 100.0;
            change = deposit - price;
            deposit = 0;
            return true;
        } else {
            change = deposit;
            deposit = 0;
            return false;
        }
    }

    /**
     * Identify the amount of change in the current change value and return,
     * then zero out this amount (the change from the last sale or refund).
     * return value is (int)
     */
    public int getChange()
    {
        int value = change;
        change = 0;
        return value;
    }
    
    /**
     * Get the amount of money in the total sales value to return, then zero out this counter.
     *    return value is (double)
     */
    public static double getTotalSales()
    {
        double value = totalSales;
        totalSales = 0;
        return value;
    }
}