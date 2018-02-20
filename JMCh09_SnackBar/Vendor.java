import java.lang.reflect.*;

/**
   This class implements a vendor that sells one kind of item.
   A vendor carries out sales transactions.

   @author  Ashwin Pasupathy
   @version 9/19/17

   @author Period - 1
   @author Assignment - Java Methods Ch09 - SnackBar

   @author Sources - none
 */
public class Vendor
{
    // Fields:
    /**
     *int stock the stock
     *int price the price for stock
     *int deposit total deposit
     *int change change to give
     *double totalSales amount of sales from all vendors 
     */
    private int stock;
    private int price;
    private int deposit;
    private int change;
    private static double totalSales;

    //  Constructor
    //  Parameters:
    //    int price of a single item in cents
    //    int number of items to place in stock
    /**
     * Creates vendor object
     * @param price price to charge
     * @param stock stock of items
     */
    public Vendor (int price, int stock)
    {
        this.stock = stock;
        this.price = price;
        deposit = 0;
        change = 0;
    }

    //  Sets the quantity of items in stock.
    //  Parameters:
    //    int number of items to place in stock
    //  Return:
    //    None
    /**
     * sets stock.
     * @param newStock new stock to set
     */
    public void setStock( int newStock )
    {
        stock = newStock;
    }

    //  Returns the number of items currently in stock.
    //  Parameters:
    //    None
    //  Return:
    //    int number of items currently in stock
    /**
     * Returns stock.
     * @return stock
     */
    public int getStock()
    {
        return stock;
    }

    //  Adds a specified amount (in cents) to the deposited amount.
    //  Parameters:
    //    int number of cents to add to the deposit
    //  Return:
    //    None
    /**
     * adds money to cents.
     * @param cents cents to add
     */
    public void addMoney( int cents)
    {
        if( stock != 0 )
        {
            deposit += cents;
        }
    }

    //  Returns the currently deposited amount (in cents).
    //  Parameters:
    //    None
    //  Return:
    //    int number of cents in the current deposit
    /**
     * Returns deposit.
     * @return deposit the deposit to return
     */
    public int getDeposit()
    {
        return deposit;
    }

    //  Implements a sale.  If there are items in stock and
    //  the deposited amount is greater than or equal to
    //  the single item price, then adjusts the stock
    //  and calculates and sets change and returns true;
    //  otherwise refunds the whole deposit (moves it into change)
    //  and returns false.
    //  Parameters:
    //    None
    //  Return:
    //    boolean successful sale (true) or failure (false)
    /**
     * Makes a sale
     * @return whether the sale was successful
     */
    public boolean makeSale()
    {
        if( stock > 0 && deposit >= price ) 
        {
            
            stock--;
            totalSales += price / 100.0; 
            change = deposit - price;
            deposit = 0;
            return true;
        }
        change = deposit;
        deposit = 0;
        return false;
    }

    //  Returns and zeroes out the amount of change (from the last
    //  sale or refund).
    //  Parameters:
    //    None
    //  Return:
    //    int number of cents in the current change
    /**
     * Returns change.
     * @return temp change to return
     */
    public int getChange()
    {
        int temp = change;
        change = 0;
        return temp;
    }
    /**
     * Returns total sales and sets it to zero.
     * @return temp is the sales 
     */
    public static double getTotalSales() 
    {
        double temp = totalSales;
        totalSales = 0;
        return temp;
    }

    /**
        Intended only for debugging.
        
        <p>A generic toString implementation that uses reflection to print
        names and values of all fields <em>declared in this class</em>.
        Note that superclass fields are left out of this implementation.</p>
        
        @return  a string representation of this Vendor.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }

            separator = ", ";
        }

        return str + "]";
    }
}
