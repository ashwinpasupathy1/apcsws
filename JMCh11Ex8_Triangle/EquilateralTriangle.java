/**
 * Calculates the area and the perimeter of an equilateral triangle as specified
 * by the abstract Triangle superclass.
 * 
 * @author Ashwin Pasupathy
 * @version 10/5/17
 * 
 * @author Period: 1
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - none
 */
public class EquilateralTriangle extends AbstractTriangle
{
    /**
     * Constructs equilateral triangle with specified sideLength
     * 
     * @param sideLength creates triangle with given size
     */
    public EquilateralTriangle( double sideLength )
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
        return 3 * getSide();
    }


    /**
     * Calculates area of triangle
     * 
     * @return area of triangle
     */
    public double getArea()
    {
        return Math.sqrt( 3 ) * 0.25 * getSide() * getSide();
    }
    
    /**
     * Creates Equilateral Traingle;
     */
    public EquilateralTriangle() 
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
