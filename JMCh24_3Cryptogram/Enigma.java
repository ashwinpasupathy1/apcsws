import java.util.Arrays;


/**
 * Decodes text
 * 
 * @author Ashwin Pasupathy
 * @version 2/5/18
 * 
 * @author Period - 1
 * @author Assignment - JM 24.3 Lab: Cryptogram Solver
 * 
 * @author Sources -
 */
public class Enigma
{
    private char[] lookupTable;


    public Enigma( int numLetters )
    {
        lookupTable = new char[numLetters];

        for ( int i = 0; i < numLetters; i++ )
        {
            lookupTable[i] = '-';
        }
    }


    public void setSubstitution( int index, char ch )
    {
        lookupTable[index] = ch;
    }


    public String decode( String text )
    {
        StringBuffer buffer = new StringBuffer( text.length() );

        for ( int i = 0; i < text.length(); i++ )
        {
            boolean upperCase = false;
            if ( Character.isLetter( text.charAt( i ) ) )
            {
                if ( Character.isUpperCase( text.charAt( i ) ) )
                {
                    upperCase = true;
                }
                int index = Character.getNumericValue( text.charAt( i ) )
                    - Character.getNumericValue( 'A' );
                if ( upperCase )
                    buffer.append( Character.toUpperCase( lookupTable[index] ) );
                else
                {
                    buffer.append( Character.toLowerCase( lookupTable[index] ) );
                }

            }
            else
            {
                buffer.append( text.charAt( i ) );
            }
        }
        return buffer.toString();
    }


    public String getHints( String text, String lettersByFrequency )
    {
        int[] counts = countLetters( text );
        char[] hints = new char[counts.length];

        for ( int i = 0; i < counts.length; i++ )
        {
            int rank = 0;
            for ( int j = 0; j < counts.length; j++ )
            {
                if ( ( counts[j] == counts[i] && j < i ) || counts[j] < counts[i] )
                {
                    rank++;
                }
            }
            hints[i] = lettersByFrequency.charAt( rank );
        }
        String theHints = "";
        for ( char hint : hints )
        {
            theHints += hint;
        }
        return theHints;
    }


    private int[] countLetters( String text )
    {
        int[] counts = new int[lookupTable.length];

        for ( int i = 0; i < text.length(); i++ )
        {
            if ( Character.isLetter( text.charAt( i ) ) )
            {
                int index = Character.getNumericValue( text.charAt( i ) )
                    - Character.getNumericValue( 'A' );
                counts[index]++;
            }
        }

        return counts;
    }


    // *************************************************************
    // For test purposes only
    // not to be used in solution implementation

    public char[] getLookupTable()
    {
        return lookupTable;
    }


    public int[] getCountLetters( String text )
    {
        return countLetters( text );
    }

}