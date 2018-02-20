/**
 * This class stores the current page and number of pages and can increment the
 * number of pages.
 * 
 * It contains a method that can increment the number of pages and it has getter
 * and setter methods.
 *
 * @author Ashwin Pasupathy
 * @version 8/24/17
 * @author Period: 1
 * @author Assignment: JMCh03Ex11_Book
 *
 * @author Sources: none
 */

public class Book
{

    /**
     * 
     */
    private int numPages;
    private int currentPage;


    /**
     * @param _numPages
     *            constructor implementation
     */
    public Book( int numPages )
    {

        this.numPages = numPages;
        currentPage = 1;

    }


    /**
     * returns numPages
     * 
     * @return
     */
    public int getNumPages()
    {

        return numPages;
    }


    /**
     * Returns current page
     * 
     * @return
     */
    public int getCurrentPage()
    {

        return currentPage;
    }


    /**
     * increases currentPage by 1 if less than numPages
     */
    public void nextPage()
    {

        if ( currentPage < numPages )
        {
            currentPage++;
        }

    }

}
