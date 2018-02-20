import java.util.Stack;


/**
 * Browses page.
 *
 * @author ashwinpasupathy
 * @version Jan 12, 2018
 * @author Period: 1
 * @author Assignment: JMCh21_3Browsing
 *
 * @author Sources: none
 */
public class BrowserModel
{
    private BrowserView view;

    private Stack<Integer> backStk;
    private Stack<Integer> forwardStk;

    private int topLine;


    /**
     * @param view
     *            BrowserView constructs browser model
     */
    public BrowserModel( BrowserView view )
    {
        this.view = view;
        view.update( 0 );
        topLine = 0;
        backStk = new Stack<Integer>();
        forwardStk = new Stack<Integer>();
    }


    /**
     * Goes back.
     */
    public void back()
    {
        if ( backStk.isEmpty() )
        {
            return;
        }
        forwardStk.push( topLine );
        int line = backStk.pop();
        view.update( line );
        topLine = line;
    }


    /**
     * goes forward.
     */
    public void forward()
    {
        if ( forwardStk.isEmpty() )
        {
            return;
        }
        backStk.push( topLine );
        int line = forwardStk.pop();
        System.out.println( line );
        view.update( line );
        topLine = line;
    }


    /**
     * Goes to line zero
     */
    public void home()
    {
        backStk.push( topLine );
        view.update( 0 );
        topLine = 0;
    }


    /**
     * Goes to link specified.
     * 
     * @param n
     *            link to follow
     */
    public void followLink( int n )
    {
        backStk.push( topLine );
        System.out.println( topLine );
        view.update( n );
        topLine = n;
    }


    /**
     * tests if back is empty.
     * 
     * @return back is empty
     */
    public boolean hasBack()
    {
        return !backStk.isEmpty();
    }


    /**
     * sees if forward stack is empty.
     * 
     * @return forward stack is empty
     */
    public boolean hasForward()
    {
        return !forwardStk.isEmpty();
    }


    /**
     * returns back stack.
     * 
     * @return back stack
     */
    public Stack<Integer> getBackStk()
    {
        return backStk;
    }


    /**
     * gets forward stack.
     * 
     * @return forward stack
     */
    public Stack<Integer> getForwardStk()
    {
        return forwardStk;
    }


    /**
     * gets top line.
     * 
     * @return top line
     */
    public int getTopLine()
    {
        return topLine;
    }
}
