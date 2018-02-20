/**
 * Calculates the area and the perimeter of a right triangle as specified by the
 * abstract Triangle superclass.
 * 
 * @author Ashwin Pasupathy
 * @version 10/5/17
 * 
 * @author Period: 1
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - none
 */
public class RightTriangle extends AbstractTriangle
{

    /**
     * Constructs right triangle
     * 
     * @param sideLength
     *            with given side length
     */
    public RightTriangle( double sideLength )
    {
        super( sideLength );
    }


    /**
     * Calculates perimeter of triangle.
     * 
     * @return perimeter of triangle
     */
    public double getPerimeter()
    {
        return getSide() * 2 + Math.sqrt( 2 * getSide() * getSide() );
    }


    /**
     * Calculates area of triangle
     * 
     * @return area of triangle
     */
    public double getArea()
    {
        return 0.5 * getSide() * getSide();
    }
    
    /**
     * Creates right triangle
     */
    public RightTriangle() 
    {
        super();
    }
    /**
     * Returns side.
     * 
     * @return side Length of triangle
     */
    public double getSide()
    {
        return super.getSide();
    }
}
