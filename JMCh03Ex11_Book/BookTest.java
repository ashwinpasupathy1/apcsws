/**
 * This is a class that tests the Book class.
 *
 * @author Ashwin Pasupathy
 * @version 8/22/17
 * @author Period: 1
 * @author Assignment: JMCh03Ex11_Book
 *
 * @author Sources: none
 */

public class BookTest
{
    /**
     * The main method in this class checks the Book operations for consistency.
     * 
     * @param args
     *            is not used.
     */

    public static void main( String[] args )
    {
        Book aBook = new Book( 3 );
        System.out.println( aBook.getNumPages() );
        System.out.println( aBook.getCurrentPage() );
        for ( int i = 0; i < aBook.getNumPages(); i++ )
        {
            aBook.nextPage();
            System.out.println( aBook.getCurrentPage() );
        }

    }
}
