import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int Sun;
    private int Building;
    private int Car;
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(int yBuilding)
    { 
        this.Sun = Sun;
        this.Building = yBuilding;
        this.Car = Car;
    }
         
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        Car car1 = new Car(70,0);
        Building building1 = new Building(30,0);
        Sun sun = new Sun (0,0);
        car1.draw(g2);
        building1.draw(g2);
        sun.draw(g2);
        
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
//     public void nextFrame()
//     {
//         // update the objects in the cityscape so they are animated
//         // ...
//         repaint = car1
//         
//         
//         // request that the Java Runtime repaints this component by invoking its paintComponent method
//         repaint();
//     }

}
