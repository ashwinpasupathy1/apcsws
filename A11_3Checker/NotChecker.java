
/**
 * Checks if a string has a substring
 *
 * @author apasupathy939
 * @version Oct 13, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources: none
 */
public class NotChecker implements Checker
{
    private Checker check;


    /**
     * sets check to a
     * 
     * @param a
     *            sets check to a
     */
    public NotChecker( Checker a )
    {
        check = a;
    }


    /**
     * Tests a string
     * 
     * @param text
     *            text to test
     * @return whether it was part of the string
     */
    public boolean accept( String text )
    {

        return !check.accept( text );
    }

}
