import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import gpdraw.*;


/**
 * Draws some polygons
 * 
 * @author Ashwin Pasupathy
 * @version 10/26/17
 *
 * @author Period - 1
 * @author Assignment - A15_1IrregularPolygon
 * 
 * @author Sources - none
 */
public class IrregularPolygon
{
    private DrawingTool pen = new 
                    DrawingTool( new SketchPad( 300, 300, 0 ) );

    private ArrayList<Point2D.Double> myPolygon;


    // constuctors

    /**
     * Creates Polygon
     */
    public IrregularPolygon()
    {
        myPolygon = new ArrayList<Point2D.Double>();
    }


    // public methods

    /**
     * Adds point
     * 
     * @param aPoint
     *            point to add
     */
    public void add( Point2D.Double aPoint )
    {
        myPolygon.add( aPoint );
    }


    /**
     * Gets perimeter.
     * 
     * @return perimter of object
     */
    public double perimeter()
    {
        double perim = 0;
        if ( myPolygon.size() <= 0 )
        {
            return perim;
        }
        Point2D.Double prev = myPolygon.get( 0 );
        for ( Point2D.Double i : myPolygon )
        {

            perim += i.distance( prev );
            prev = i;

        }
        perim += myPolygon.get( 0 ).distance( myPolygon.get
            ( myPolygon.size() - 1 ) );
        return perim;
    }


    /**
     * Gets area
     * 
     * @return area of object
     */
    public double area()
    {
        double area = 0;
        if ( myPolygon.size() <= 0 )
        {
            return area;
        }
        Point2D.Double prev = myPolygon.get( myPolygon.size() - 1 );
        for ( Point2D.Double i : myPolygon )
        {
            area += prev.x * i.y;
            area -= prev.y * i.x;
            prev = i;
        }
        if ( area < 0 )
        {
            area = -area;
        }
        return 0.5 * area;
    }


    /**
     * Draws polygon.
     */
    public void draw()
    {
        if ( myPolygon.size() <= 0 )
        {
            // System.out.println( "bogus polygon" );
            return;

        }

        Point2D.Double prev = myPolygon.get( 0 );
        pen.setColor( Color.WHITE );
        pen.move( prev.x, prev.y );
        pen.setColor( Color.BLACK );
        for ( Point2D.Double i : myPolygon )
        {
            pen.move( i.x, i.y );

        }
        pen.move( prev.x, prev.y );
    }
}
