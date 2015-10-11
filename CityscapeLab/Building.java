import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/**
 * A building shape thats x coordinate can be positioned anywhere on a set rail
 */
public class Building
{
    private int xLeft;
    private int yTop;
    
    /**
     * Constructs the building with a given top left corner
     * @param x  the x-coordinate of the top-left corner
     * @param y  the y-coordinate of the top-left corner
     */
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    /** 
     * Draws the building
     * @param g2  the graphics context
     */
    public void draw (Graphics2D g2)
    {
        Rectangle building1 = new Rectangle (xLeft, yTop +30,10,30);
        //Rectangle building2 = new Rectangle (xLeft, yTop +23,6,23);
        //Rectangle building3 = new Rectangle (xLeft, yTop +32,12,42);
        
        g2.draw(building1);
        //g2.draw(building2);
        //g2.draw(building3);
    }
}
        
        