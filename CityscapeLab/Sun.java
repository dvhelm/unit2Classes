import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/**
 * A sun shape that is positioned at the top right or left side of screen
 */
public class Sun
{
    private int xLeft;
    private int yTop;
    
    /**
     * Constructs a sun with a given upper corner
     * @param x  the x-coordinate of the upper corner
     * @param y  the y-coordinate of the upper corner
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * Draws the Sun
     * @param g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Float circle = new Ellipse2D.Float(-30.0f,-30.0f,0.0f,0.0f);
        g2.draw(circle);
        g2.setPaint(Color.yellow);
        g2.fill(circle);
    }













}