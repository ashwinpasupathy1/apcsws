/**
 * A class to solve various loop problems
 *
 * @author apasupathy939
 * @version Sep 15, 2017
 * @author Period: 1
 * @author Assignment: A12_1FunLoops
 *
 * @author Sources: none
 */
public class FunLoops
{
    /**
     * finds n magic squares.
     * 
     * @param n
     *            number of magic squares to find
     */
    public void magicsquare( int n )
    {
        System.out.println( "Magic Squares" );
        long sum = 0;
        long square = 1;
        long summation = 1;
        int perfectSquareAmount = 0;
        while ( perfectSquareAmount < n )
        {
            sum += summation;
            if ( square * square == sum )
            {
                perfectSquareAmount++;
                System.out.println( perfectSquareAmount + ": " + sum );
                square++;
                summation++;
            }

            else if ( square * square < sum )
            {
                square++;
                summation++;
            }
            else
            {
                summation++;
            }

        }
    }


    /**
     * finds the lowest common multiple.
     * 
     * @param a
     *            the first number
     * @param b
     *            the second number
     * @return lcm the lowest common multiple
     */
    public int lcm( int a, int b )
    {
        int lcm = 0;
        for ( int i = 1; i <= b; i++ )
        {
            for ( int j = 1; j <= a; j++ )
            {
                if ( a * i == b * j )
                {
                    return a * i;
                }
            }
        }

        return lcm; // Fix this
    }


    /**
     * Creates fun loop object and calls magicsquare and lcm methods.
     * 
     * @param args
     *            is not used
     */
    public static void main( String[] args )
    {
        FunLoops fun = new FunLoops();

        fun.magicsquare( 4 );
        System.out.println();

        System.out.println( "LCM (15, 18) = " + fun.lcm( 15, 18 ) );
        System.out.println( "LCM (40, 12) = " + fun.lcm( 40, 12 ) );
        System.out.println( "LCM (2, 7) = " + fun.lcm( 2, 7 ) );
        System.out.println( "LCM (100, 5) = " + fun.lcm( 100, 5 ) );
        System.out.println();

        fun.magicsquare( 10 );
    }
}
