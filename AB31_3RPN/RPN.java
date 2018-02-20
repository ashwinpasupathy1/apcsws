import java.util.*;


/**
 * RPN Calculator
 *
 * @author Ashwin Pasupathy
 * @version 1/4/18
 * @author Period: 1
 * @author Assignment: AB31RPN Calculator
 *
 * @author Sources: none
 */
public class RPN
{
    Scanner scan = new Scanner( System.in );

    private Stack<Integer> myStack;

    private Queue<String> myQ;


    /**
     * Constructs an RPN Calculator
     */
    public RPN()
    {
        myStack = new Stack<Integer>();
        myQ = new LinkedList<String>();
    }


    /**
     * **** Used for testing - Do Not Remove ***
     * 
     * Constructs an RPN Calculator and then redirects the Scanner input to the
     * supplied string.
     * 
     * @param console
     *            replaces console input
     */
    public RPN( String console )
    {
        this();
        scan = new Scanner( console );
    }


    /**
     * calculates each RPN line.
     */
    public void calculate()
    {
        while ( scan.hasNext() )
        {
            String s = scan.next();
            for ( int i = 0; i < s.length(); i++ )
            {
                char c = s.charAt( i );
                if ( c == 'Q' || c == 'q' )
                {
                    calculateQueue( s );
                    break;
                }
                if ( s.charAt( i ) == ' ' )
                {
                    continue;
                }
                if ( s.charAt( i ) == '+' )
                {
                    add();
                }
                else if ( s.charAt( i ) == '-' )
                {
                    subtract();
                }
                else if ( s.charAt( i ) == '*' )
                {
                    multiply();
                }
                else if ( s.charAt( i ) == '/' )
                {
                    divide();
                }
                else
                {
                    myStack.push( Integer.parseInt( s.charAt( i ) + "" ) );

                }
                myQ.add( c + "" );

            }

        }

    }


    public void calculateQueue( String s )
    {
        while ( !myQ.isEmpty() )
        {
            System.out.print( myQ.remove() + " " );

        }
        System.out.print( "= " + myStack.pop() );
    }


    public void multiply()
    {
        if ( myStack.isEmpty() )
        {
            return;
        }
        int first = myStack.pop();
        int second = myStack.pop();
        myStack.push( first * second );
    }


    public void add()
    {
        if ( myStack.isEmpty() )
        {
            return;
        }
        int first = myStack.pop();
        int second = myStack.pop();
        myStack.push( first + second );
    }


    public void subtract()
    {
        if ( myStack.isEmpty() )
        {
            return;
        }
        int first = myStack.pop();
        int second = myStack.pop();
        myStack.push( second - first );
    }


    public void divide()
    {
        if ( myStack.isEmpty() )
        {
            return;
        }
        int first = myStack.pop();
        int second = myStack.pop();
        myStack.push( second / first );
    }


    /**
     * Instantiates an RPN Calculator and invokes it calculate method
     * 
     * @param args
     *            command-line arguments (not used)
     */
    public static void main( String[] args )
    {
        RPN rpn = new RPN();
        rpn.calculate();
    }
}