

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int bottomPos;
    private int leftPos;
    private int numFloors;
    /**
     * Default constructor for objects of class Building
     */
    public Building(int inBottom, int inLeft, int inFloors)
    {
        // initialise instance variables
        this.bottomPos = inBottom;
        this.leftPos = inLeft;
        this.numFloors = inFloors;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y=2;
    }

}
