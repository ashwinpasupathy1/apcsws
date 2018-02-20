/**
 * The abstract class <code>Triangle</code> requires methods for calculating the
 * area and the perimeter as specified the type of triangle. A method to
 * calculate the ratio of the area to the perimeter is provided. The class works
 * for equilateral triangles and for right isosceles triangles; which can be
 * specified with the length of a side.
 * 
 * @author Ashwin Pasupathy
 * @version 10/4/17
 * 
 * @author Period: 1
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - none
 */
public abstract class AbstractTriangle
{
    private double side;


    /**
     * Calculates perimeter of triangle.
     * 
     * @return perimeter of triangle
     */
    public abstract double getPerimeter();


    /**
     * Calculates area of triangle
     * 
     * @return area of triangle
     */
    public abstract double getArea();


    /**
     * Gets Ratio of area to perimeter
     * 
     * @return getArea/getPerimeter
     */
    public double getRatio()
    {
        return getArea() / getPerimeter();
    }


    /**
     * Creates Triangle
     * 
     * @param sideLength
     *            sideLength of s
     */
    public AbstractTriangle( double sideLength )
    {

        side = sideLength;
    }

    /**
     * Creates AbstractTriangle
     */
    public AbstractTriangle() 
    {
        side = 0;
    }
    /**
     * Returns side.
     * 
     * @return side Length of triangle
     */
    public double getSide()
    {
        return side;
    }

}
