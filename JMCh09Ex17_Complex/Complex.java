/**
 * Represents a complex number of the form a + bi. Provides methods for adding,
 * multiplying and calculating the absolute value.
 *
 * @author Ashwin Pasupathy
 * @version 9/28/17
 * @author Period: 1
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: none
 */
public class Complex
{
    private double a = 0;

    private double b = 0;


    /**
     * Creates complex
     * 
     * @param a
     *            a value
     */
    public Complex( double a )
    {

        this.a = a;
        b = 0.0;

    }


    /**
     * Creates complex
     * 
     * @param a
     *            a value
     * @param b
     *            b value
     */
    public Complex( double a, double b )
    {

        this.a = a;
        this.b = b;

    }


    /**
     * Finds absolute value of complex.
     * 
     * @return absolute value
     */
    public double abs()
    {
        return Math.sqrt( a * a + b * b );
    }


    /**
     * Returns addition of two complex numbers
     * 
     * @param other
     *            other complex object
     * @return result of addition
     */
    public Complex add( Complex other )
    {
        double real = this.a + other.a;
        double imag = this.b + other.b;
        return new Complex( real, imag );
    }


    /**
     * Returns multiplication of two complex numbers
     * 
     * @param other
     *            other complex
     * @return new complex
     */
    public Complex multiply( Complex other )
    {
        double real = this.a * other.a - this.b * other.b;
        double imag = this.a * other.b + this.b * other.a;
        return new Complex( real, imag );

    }


    /**
     * Multiplies complex and real
     * 
     * @param other
     *            other real to multiply
     * @return new complex scaled
     */
    public Complex multiply( double other )
    {
        double real = a * other;
        double imag = b * other;
        return new Complex( real, imag );
    }


    /**
     * Adds complex to real
     * 
     * @param num
     *            real to add
     * @return complex object
     */
    public Complex add( double num )
    {
        this.a += num;

        return this;
    }


    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return a + " + " + b + "i";
    }

}
