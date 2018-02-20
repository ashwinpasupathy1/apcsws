import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;


/**
 * Test for the complex number class.
 * 
 * testConstructor1Param - test the 1 parameter constructor
 * testConstructor2Param - test the 2 parameter constructor
 * testAddRealAndComplexNum - addition of a complex number with a real number
 * testAdd2ComplexNums - addition of two complex numbers
 * testMultiply2ComplexNums - multiplication of two complex numbers
 * testMultiplyRealAndComplexNum - multiplication of a complex number with a
 * real number testAbsoluteValue - absolute value of a complex number
 *
 * @author Ashwin Pasupathy
 * @version 9/28/17
 * @author Period: 1
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: none
 */
public class ComplexJUTest extends junit.framework.TestCase
{
    @Test
    public void testConstructor1Param()
    {
        Complex c1 = new Complex( 2 );
        assertEquals( "2.0 + 0.0i", c1.toString() );
        System.out.println( "c1 = " + c1 );

    }


    @Test
    public void testConstructor2Param()
    {
        Complex c2 = new Complex( 4, 5.1 );
        assertEquals( "4.0 + 5.1i", c2.toString() );
        System.out.println( "c2 = " + c2 );
    }


    @Test
    public void testAddRealAndComplexNum()
    {
        Complex c6 = new Complex( 8.1, 15.1 );
        Complex c7 = c6.add( 5.0 );
        assertEquals( "13.1 + 15.1i", c7.toString() );
        System.out.println( "c6 + 5.0 = " + c7 );
    }


    @Test
    public void testAdd2ComplexNums()
    {
        Complex c3 = new Complex( 4, 5 );
        Complex c4 = new Complex( 3.3, 8.2 );
        Complex c5 = c3.add( c4 );
        assertEquals( "7.3 + 13.2i", c5.toString() );
        System.out.println( "(4.0 + 5.1i) + (3.0 + 8.2i)" + c5 );
    }


    @Test
    public void testMultiply2ComplexNums()
    {
        Complex c1 = new Complex( 1, 2 );
        Complex c2 = new Complex( 3, 4 );
        Complex c3 = c1.multiply( c2 );
        assertEquals( "-5.0 + 10.0i", c3.toString() );
        System.out.println( "c3 = " + c3 );

    }


    @Test
    public void testMultiplyRealAndComplexNum()
    {
        Complex c5 = new Complex( 4.1, 4 );
        Complex c6 = c5.multiply( 2 );
        assertEquals( "8.2 + 8.0i", c6.toString() );
        System.out.println( "2 * (4.1 + 4.0i) = " + c6 );
    }


    @Test
    public void testAbsoluteValue()
    {
        Complex c1 = new Complex( 1.5, 3.5 );
        assertEquals( "3.8078865529319543", c1.abs() + "" );
        System.out.println( "|c1| =  " + c1.abs() );
    }


    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( ComplexJUTest.class );
    }


    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "ComplexJUTest" );
    }
}
