/**
 * Tests if a string is a substring of another string
 *
 * @author apasupathy939
 * @version Oct 13, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources: none
 */
public class SubstringChecker implements Checker
{
    private String toCheck;


    /**
     * sets text to substring to check
     * 
     * @param text
     *            text to set
     * 
     */
    public SubstringChecker( String text )
    {
        toCheck = text;
    }


    /**
     * Checks if text contains the substring
     * 
     * @param text
     *            textTocheck
     * @return whether it contains text
     */
    public boolean accept( String text )
    {

        return text.contains( toCheck );
    }

}
