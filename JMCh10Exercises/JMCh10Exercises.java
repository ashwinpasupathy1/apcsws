import java.util.*;


/**
 * Java Methods Chapter 10 Exercises 2, 6 - 11, 14 - 15, 20 & 22
 * 
 * @author Ashwin Pasupathy
 * @version 9/29/17
 * 
 * @author Period - 1
 * 
 * @author Assignment - Ch10Exercises
 * 
 * @author Sources - none
 */
public class JMCh10Exercises
{
    Scanner scan;


    /**
     * Constructs a Scanner for input from the console.
     */
    public JMCh10Exercises()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public JMCh10Exercises( String str )
    {
        scan = new Scanner( str );
    }


    // 10-2(a)
    /**
     * test if ends with star.
     * 
     * @param s
     *            string to test
     * @return true or false
     */
    public boolean endsWithStar( String s )
    {
        if ( s.charAt( s.length() - 1 ) == '*' && s.length() > 0 )
        {

            return true;

        }

        return false; // FIX THIS!!!
    }


    // 10-2(b)
    /**
     * tests if ends with two starts
     * 
     * @param s
     *            string to test
     * @return true or false if ends with two stars
     */
    public boolean endsWith2Stars( String s )
    {
        if ( s.charAt( s.length() - 1 ) == '*' 
                        && s.charAt( s.length() - 2 ) == '*'
            && s.length() > 1 )
        {
            return true;
        }

        return false; // FIX THIS!!!
    }


    // 10-6
    /**
     * replaces last string with first character.
     * 
     * @param s
     *            string to replace
     * @return replaced string
     */
    public String scroll( String s )
    {
        char firstChar = s.charAt( 0 );
        String solution;// = s;
        solution = s.substring( 1 ) + firstChar;

        return solution;
    }


    // 10-7
    /**
     * switches last, first name to first last name.
     * 
     * @param name
     *            name to switch
     * @return converted name
     */
    public String convertName( String name )
    {
        int comma = name.indexOf( ',' );

        String finalone = name.substring( comma + 1 )
                        + " " + name.substring( 0, comma );

        return finalone.trim(); // FIX THIS!!!
    }


    // 10-8
    /**
     * replaces 0s with ones and vice versa.
     * 
     * @param str
     *            string of 0s and 1s to replace
     * @return new replaced string
     */
    public String negate( String str )
    {
        str = str.replace( '0', 't' );
        str = str.replace( '1', '0' );
        str = str.replace( 't', '1' );

        return str; // FIX THIS!!!
    }


    // 10-9
    /**
     * tests if all characters are the same.
     * 
     * @param s
     *            string to test
     * @return whether all characters are the same
     */
    public boolean isConstant( String s )
    {
        return s.equals( s.replaceAll( ".", s.charAt( 0 ) + "" ) );

    }


    // 10-10
    /**
     * Removes comment from a string
     * 
     * @param str
     *            string to remove comment from
     * 
     * @return string with removed comment
     */
    public String removeComment( String str )
    {
        int comment = str.indexOf( "/*" );
        int close = str.indexOf( "*/" );
        // str.in
        if ( close == -1 || comment == -1 )
            return str;
        return str.substring( 0, comment ) 
                        + str.substring( close + 2 ); 
                                                                        
    }


    // 10-11
    /**
     * cuts out specific string from other string.
     * 
     * @param s
     *            original string
     * @param s2
     *            string to be cut out
     * @return string with s2 cut out
     */
    public String cutOut( String s, String s2 )
    {
        int indexOfString = s.indexOf( s2 );
        if ( indexOfString == -1 )
        {
            return s;
        }

        return s.substring( 0, indexOfString ) + 
                        s.substring( indexOfString + s2.length() ); 
    }


    // 10-14
    /**
     * removes html tags from string.
     * 
     * @param str
     * @return string without html tags
     */
    public String removeHtmlTags( String str )
    {
        int first = str.indexOf( '<' );
        int last = str.indexOf( "</" );
        if ( first == -1 || last == -1 )
            return str;

        return str.substring( 0, first ) + str.substring( first + 3, last )
            + str.substring( last + 4 );

    }


    // 10-15
    /**
     * tests if number is only decimal digits.
     * 
     * @param s
     *            string to test
     * @return if string is only numbers
     */
    public boolean onlyDigits( String s )
    {
        String newString = s.replaceAll( ".", "9" );
        s = s.replace( '0', '9' );
        s = s.replace( '1', '9' );
        s = s.replace( '2', '9' );
        s = s.replace( '3', '9' );
        s = s.replace( '4', '9' );
        s = s.replace( '5', '9' );
        s = s.replace( '6', '9' );
        s = s.replace( '7', '9' );
        s = s.replace( '8', '9' );
        
        return s.equals( newString );
        
    }


    // 10-20
    /**
     * determines if string is valid isbn.
     * 
     * @param isbn
     *            string of isbn
     * @return if string is valid isbn
     */
    public static boolean isValidISBN( String isbn )
    {
        int sum = 0;
        for ( int i = 2; i < isbn.length(); i++ )
        {
            sum += Character.digit( isbn.charAt( 
                isbn.length() - i ), 10 ) * Math.pow( 10, i );

        }
        if ( sum % 11 == 1 )
            return isbn.charAt( isbn.length() - 1 ) == 'X';
        return sum % 11 == 11 - Character.digit( 
            isbn.charAt( isbn.length() - 1 ), 10 );
    }


    // 10-22
    /**
     * Shuffles all letters in a string.
     * 
     * @param s
     *            string to shuffle
     * @return shuffled string
     */
    public String shuffle( String s )
    {
        StringBuffer str = new StringBuffer( s );

        int n = str.length() - 1;

        while ( n > 1 )
        {
            int randomIndex = (int)( Math.random() * n );
            
            char temp = str.charAt( randomIndex );
            str.setCharAt( randomIndex, str.charAt( n ) );
            str.setCharAt( n, temp );
            n--;
        }
        s = str.toString();
        return s; // FIX THIS!!!
    }


    /**
     * Testing method: instantiates a Ch18Ex1to5 
     * object and then invokes each
     * method.
     * 
     * @param args
     *            command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        JMCh10Exercises exercise = new JMCh10Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) 10-2(a) endsWithStar( String s )" );
            System.out.println( "   (2) 10-2(b) endsWith2Stars( String s )" );
            System.out.println( "   (3) 10-6 scroll( String s )" );
            System.out.println( "   (4) 10-7 convertName( String name )" );
            System.out.println( "   (5) 10-8 negate( String str )" );
            System.out.println( "   (6) 10-9 isConstant( String s )" );
            System.out.println( "   (7) 10-10 removeComment( String str )" );
            System.out.println( "   (8) 10-11 cutOut( String s, String s2 )" );
            System.out.println( "   (9) 10-14 removeHtmlTags( String str )" );
            System.out.println( "   (A) 10-15 onlyDigits( String s )" );
            System.out.println( "   (B) 10-20 isValidISBN( String isbn )" );
            System.out.println( "   (C) 10-22 shuffle( String s )" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();
           
            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        String end1Star = "**endsWith**Star*";
                        System.out.println( "endsWithStar(" + end1Star + ") = "
                            + exercise.endsWithStar( end1Star ) );
                        String ends0Star = "**endsWith**Star*No";
                        System.out.println( "endsWithStar(" + ends0Star + ") = "
                            + exercise.endsWithStar( ends0Star ) );
                        break;
                    case '2':
                        String end2Str = "**endsWith**2Stars**";
                        System.out.println( "endsWith2Stars(" + end2Str + ") = "
                            + exercise.endsWith2Stars( end2Str ) );
                        String endsWith1Star = "**endsWith**2Stars*";
                        System.out.println( "endsWith2Stars(" + endsWith1Star + ") = "
                            + exercise.endsWith2Stars( endsWith1Star ) );
                        break;
                    case '3':
                        String scrollStr = "bdfhjlnprtvxz";
                        System.out.println( "scroll(\"" + scrollStr + "\") --> " + "\""
                            + exercise.scroll( scrollStr ) + "\"" );
                        break;
                    case '4':
                        String convStr = "von Neumann, John";
                        System.out.println( "convertName(\"" + convStr + "\") --> " + "\""
                            + exercise.convertName( convStr ) + "\"" );
                        break;
                    case '5':
                        String negStr = "1001110001010101110";
                        System.out.println( "negate(\"" + negStr + "\") --> " + "\""
                            + exercise.negate( negStr ) + "\"" );
                        break;
                    case '6':
                        String constStr1 = "0000000000000000000";
                        String constStr2 = "1001110001010101110";
                        System.out.println( "isConstant(\"" + constStr1 + "\") = "
                            + exercise.isConstant( constStr1 ) );
                        System.out.println( "isConstant(\"" + constStr2 + "\") = "
                            + exercise.isConstant( constStr2 ) );
                        break;
                    case '7':
                        String comment = "/* this should be gone */ int a = 0;";
                        String notComment = "/* this should stay /* int a = 0;";
                        System.out.println( "removeComment(\"" 
                        + comment + "\") --> " + "\""
                            + exercise.removeComment( comment ) + "\"" );
                        System.out.println( "removeComment(\"" 
                            + notComment + "\") --> " + "\""
                            + exercise.removeComment( notComment ) + "\"" );
                        break;
                    case '8':
                        String cutstr = "Hi-ho, hi-ho";
                        String cutOutstr = "-ho";
                        System.out.println( "cutOut(\"" + cutstr 
                            + "\", \"" + cutOutstr + "\") --> "
                            + "\"" + exercise.cutOut( 
                                cutstr, cutOutstr ) + "\"" );
                        break;
                    case '9':
                        String htmlStr = "Strings are <b>immutable</b>";
                        System.out.println( "removeHtmlTags(\""
                        + htmlStr + "\") --> " + "\""
                            + exercise.removeHtmlTags( htmlStr ) + "\"" );
                        break;
                    case 'A':
                    case 'a':
                        String digitStr = "123456789";
                        String dStr = "1234V5678";
                        System.out.println( "onlyDigits(\"" +
                        digitStr + "\") = "
                            + exercise.onlyDigits( digitStr ) );
                        System.out.println(
                            "onlyDigits(\"" + dStr + "\") = " 
                        + exercise.onlyDigits( dStr ) );
                        break;
                    case 'B':
                    case 'b':
                        String validISBN = "096548534X";
                        String invalidISBN = "1234567890";
                        System.out.println( "isValidISBN(\"" 
                        + validISBN + "\") = "
                            + exercise.isValidISBN( validISBN ) );
                        System.out.println( "isValidISBN(\"" + 
                            invalidISBN + "\") = "
                            + exercise.isValidISBN( invalidISBN ) );
                        break;
                    case 'C':
                    case 'c':
                        String str = "The quick brown fox";
                        System.out.println( "shuffle(\"" + 
                        str + "\") --> " + "\""
                            + exercise.shuffle( str ) + "\"" );
                        System.out.println( "shuffle(\"" +
                            str + "\") --> " + "\""
                            + exercise.shuffle( str ) + "\"" );
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
