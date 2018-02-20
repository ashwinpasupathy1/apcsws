import java.util.Scanner;
import java.io.*;


/**
 * Creates file with java syntax.
 * 
 * @author Ashwin Pasupathy
 * @version 11/9/17
 * 
 * @author Period - 1
 * @author Assignment - JM Ch14 - DictionaryMaker
 * 
 * @author Sources - none
 */
public class DictionaryMaker
{
    private static final int MINLENGTH = 3, MAXLENGTH = 5;

    public static Scanner fileIn; // public for test purposes

    public static PrintWriter fileOut; // public for test purposes


    public static void main( String[] args ) throws IOException
    {
        Scanner kboard = new Scanner( System.in );

        System.out.println();
        System.out.print( "Enter input file name: " );
        String fileName = kboard.next();

        openInputFile( fileName );
        if ( fileIn == null )
        {
            System.out.println( "*** Can't open " 
                            + fileName + " ***" );
            return;
        }

        createOutputFile( "RamblecsDictionary.java" );
        if ( fileOut == null )
        {
            fileIn.close();
            System.out.println( 
                "*** Can't create RamblecsDictionary.java ***" );
            return;
        }

        int count = copyWords();
        System.out.println( "Done: " + count + " words." );

        fileIn.close();
        fileOut.close();
    }


    /**
     * Opens a file fileName (in the current folder) and places a reference to
     * it into fileIn
     */
    public static void openInputFile( String fileName )
    {
        File file = new File( fileName );
        try
        {
            fileIn = new Scanner( file );
        }
        catch ( Exception e )
        {
            System.out.print( "failure" );
        }
    }


    /**
     * Creates a new file fileName (in the current folder) and places a
     * reference to it into fileOut
     */
    public static void createOutputFile( String fileName )
    {
        File file = new File( fileName );
        try
        {
            fileOut = new PrintWriter( file );
        }
        catch ( Exception e )
        {
            System.out.print( "failure" );
        }

    }


    /**
     * Reads all words from fileIn, selects the words that have from MINLENGTH
     * to MAXLENGTH letters, converts them into upper case and writes the words
     * into fileOut in Java syntax
     * 
     * @return number of words processed
     */
    public static int copyWords()
    {
        int numOfWords = 0;
        fileOut.println( "public class RamblecsDictionary" );
        fileOut.println( "{" );
        fileOut.println( "   public String words[] =" );
        fileOut.println( "   {" );
        while ( fileIn.hasNext() )
        {
            String s = fileIn.nextLine();

            if ( s.length() >= MINLENGTH && s.length() <= MAXLENGTH )
            {
                numOfWords++;
                fileOut.print( "\t\t\"" );
                fileOut.print( s.toUpperCase() );
                fileOut.println( "\"," );
            }
        }
        fileOut.println( "   };" );
        fileOut.println( "}" );

        return numOfWords; // fix this!!!
    }
}
