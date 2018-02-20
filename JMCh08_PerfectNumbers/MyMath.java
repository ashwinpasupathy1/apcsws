/**
 * Calculates various math problems
 *
 * @author Ashwin Pasupathy
 * @version 9/15/17
 * @author Period: 1
 * @author Assignment: JMCh08_PerfectNumbers
 *
 * @author Sources: none
 */
public class MyMath
{
    /**
     * Returns true if n is a prime; otherwise returns false.
     * 
     * @param n
     *            number to check if prime
     * @return true if n is a prime; otherwise returns false
     */
    public static boolean isPrime( long n )
    {
        if ( n == 2 )
        {
            return true;
        }
        else if ( n < 2 || n % 2 == 0 )
        {
            return false;
        }

        int finalNum = (int)( Math.sqrt( n ) + 0.5 );
        for ( int i = 3; i <= finalNum; i += 2 )
        {
            if ( n % i == 0 )
            {
                return false;
            }
        }
        return true;
    }


    /**
     * Question 8-15 Returns the n-th Fibonacci number
     * 
     * Find and read a few informative websites dedicated to Fibonacci numbers.
     * The following recursive method returns the n-th Fibonacci number:
     * 
     * // Returns the n-th Fibonacci number. // Precondition : n >= 1 public
     * static long fibonacci(int n) { if (n == 1 || n == 2) return 1; else
     * return fibonacci(n - 1) + fibonacci(n - 2); } Rewrite it without
     * recursion, using one loop.
     *
     * @param n
     *            Fibonacci number to find
     * @return n-th Fibonacci number
     */
    public static long fibonacci( int n )
    {
        int fibSum = 1;
        int prevFibSum = 1;
        int temp;
        for ( int i = 2; i < n; i++ )
        {
            temp = fibSum;
            fibSum = fibSum + prevFibSum;
            prevFibSum = temp;
        }

        return fibSum;
    }


    /**
     * Returns true if n is a perfect number, false otherwise.
     * 
     * @param n
     *            number to test
     * @return true if n is a perfect number, false otherwise.
     */
    public static boolean isPerfect( int n )
    {
        int sum = 0;
        for ( int i = 1; i <= n / 2; i++ )
        {
            if ( n % i == 0 )
            {
                sum += i;
            }

        }

        return sum == n;
    }


    /**
     * Prints the first n perfect numbers
     * 
     * @param n
     *            number of perfect numbers to print
     */
    public static void printPerfectNums( int n )
    {
        System.out.println( "Perfect numbers: " );
        int count = 0;
        for ( int k = 1; count < n; k++ )
        {
            if ( isPerfect( k ) )
            {
                System.out.print( k + " " );
                count++;
            }
        }
        System.out.println();
    }


    /**
     * Prints the first n Mersenne primes
     * 
     * @param n
     *            number of Mersenne primes to print
     */
    public static void printMersennePrimes( int n )
    {
        System.out.println( "Mersenne primes: " );
        int counter = 0;
        long pow = 2;
        while ( counter <= n )
        {
            pow *= 2;
            if ( isPrime( pow - 1 ) )
            {

                System.out.print( ( pow - 1 ) + " " );
                counter++;
            }

        }
        System.out.println();
    }


    /**
     * Prints the first n even perfect numbers
     * 
     * @param n
     *            number of numbers to print
     */
    public static void printEvenPerfectNums( int n )
    {

        System.out.println( "Even perfect numbers: " );
        long counter = 0;
        long pow = 2;
        while ( counter < n )
        {
            pow *= 2;
            if ( isPrime( pow - 1 ) )
            {

                System.out.print( pow / 2 * ( pow - 1 ) + " " );
                counter++;

            }
        }

        System.out.println();
    }


    /**
     * Prints out various prime numbers
     * 
     * @param args
     *            is not used
     */

    public static void main( String[] args )
    {
        int n = 19;
        System.out.println( n + "-th Fibonacci number = " + fibonacci( n ) );
        printPerfectNums( 4 );
        printMersennePrimes( 6 );
        printEvenPerfectNums( 6 );
    }
}
/*
 * 19-th Fibonacci number = 4181 Perfect numbers: 6 28 496 8128 Mersenne primes:
 * 3 7 31 127 8191 131071 524287 Even perfect numbers: 6 28 496 8128 33550336
 * 8589869056 137438691328
 */