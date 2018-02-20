import java.util.Scanner;
import java.io.*;


/**
 * A class for calculating Statistics on a set of numbers.
 *
 * @author Ashwin Pasupathy
 * @version 10/22/17
 * @author Period: 1
 * 
 * @author Assignment: Lab Activity 16.1 - Statistics
 * 
 * @author Sources: none
 */
public class Statistics
{
    private final static int MAX_VALUE = 100;

    private int[] statsData = new int[1000];

    private int howMany;


    /**
     * Constructs this object with an array of integers for use with statistical
     * calculation
     * 
     * @param fileName
     *            name of file containing numbers for stat istical evaluation
     */
    public Statistics( String fileName )
    {
        howMany = 0;
        loadFile( fileName );
    }


    /**
     * Loads text file into array data. Values are stor ed from positions
     * 0..howMany-1. Returns the number of data values as howMany
     * 
     * @param fileName
     *            file or string containing numbers to read
     */
    public void loadFile( String fileName )
    {
        int index = 0;
        Scanner inFile;

        try
        {
            if ( new File( fileName ).isFile() )
            {
                inFile = new Scanner( new File( fileName ) );
            }
            else
            {
                inFile = new Scanner( fileName );
            }

            while ( inFile.hasNext() )
            {
                statsData[index] = inFile.nextInt();
                
                index++;
            }
        }
        catch ( IOException i )
        {
            System.out.println( "Error: " + i.getMessage() );
        }
        howMany = index;
    }


    /**
     * Returns average of values in vector data.
     * 
     * @return average of this objects data collection
     */
    public double average()
    {
        long sum = 0;
        for ( int i = 0; i < howMany; i++ )
        {

            sum += statsData[i];
        }
        double howMany1 = howMany;

        return (double) sum / howMany1;
    }


    /**
     * Finds standard deviation of values in vector data.
     * 
     * @return the standard deviation of the vector data
     */
    public double stdDev()
    {
        double average = average();
        double sum = 0.0;

        for ( int i = 0; i < howMany; i++ )
        {
            sum += ( average - statsData[i] ) * ( average - statsData[i] );
        }

        return Math.sqrt( sum / ( howMany - 1 ) );
    }


    /**
     * finds the largest integer in the array scores. This array is sized from
     * 0..MAX_VALUE, with each element storing the q uantity of each number from
     * 0..MAX_VALUE.
     * 
     * @param scores
     *            integer array sized at MAX_VALUE+1 with each element storing
     *            the quantity of each number from 0 ..MAX_VALUE
     */
    public int findLargest( int[] scores )
    {
        int largest = 0;
        for ( int i = 0; i < scores.length; i++ )
        {
            if ( scores[i] > largest )
            {
                largest = scores[i];
            }
        }
        return largest;
    }


    /**
     * The array data is analyzed and transferred in to a smaller array
     * smallList (0..MAX_VALUE). For each occurrence of n in th e array data,
     * smallList[n] is incremented +1. findLargest is then called to find the
     * largest quantity in the array smallList. The mode(s) is/are returned in
     * an array.
     * 
     * @return array of mode(s)
     */
    public int[] findMode()
    {
        int max = 0;
        int count = 0;
        int k = 0;
        int[] mode = new int[MAX_VALUE];
        for ( int i = 0; i < howMany; i++ )
        {
            mode[statsData[i] - 1]++;
        }
        max = findLargest( mode );
        for ( int j = 0; j < mode.length; j++ )
        {
            if ( mode[j] == max )
            {
                count++;
            }
        }
        int[] result = new int[count];
        for ( int j = 0; j < mode.length; j++ )
        {
            if ( mode[j] == max )
            {
                result[k] = j + 1;
                k++;
            }
        }
        return result;
    }


    /**
     * Tests statistics.
     * 
     * @param args
     *            is not used
     */
    public static void main( String[] args )
    {
        Statistics fileStats = new Statistics( "numbers.txt" );
        System.out.printf( "The average = %6.2f", fileStats.average() );
        System.out.println();
        System.out.printf( "Standard deviation = %6.2f", fileStats.stdDev() );
        System.out.println();
        int[] mode = fileStats.findMode();
        System.out.print( "The mode is(are) --> " );
        for ( int m : mode )
        {
            System.out.print( m + "  " );
        }
    }
}
