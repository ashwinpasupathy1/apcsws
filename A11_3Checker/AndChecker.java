/**
 * Tests 2 SubstringCheckers and returns && for both of them
 * 
 * @author apasupathy939
 * @version Oct 13, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources: none
 */
public class AndChecker implements Checker
{
    private Checker first;

    private Checker second;


    /**
     * Creates AndChecker object
     * 
     * @param a
     *            first Checker
     * @param b
     *            second Checker
     */
    public AndChecker( Checker a, Checker b )
    {
        first = a;
        second = b;
    }


    /**
     * Tests a string with 2 SubstringCheckers
     * 
     * @param text
     *            text to test
     * @return whether it was part of the string
     */
    public boolean accept( String text )
    {
        return first.accept( text ) && second.accept( text );

    }

}
