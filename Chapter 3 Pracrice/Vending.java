

/**
 * Write a description of class Vending here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending
{
    /** description of instance variable x (add comment for each instance variable) */
    private int can;
    
    private int token;

    /**
     * Default constructor for objects of class Vending
     */
    public Vending()
    {
        // initialise instance variables
        this.can=can;
        this.token=0;
    }
    public int getToken()
    {
        // put your code here
        return token;
    }
    public int getCan()
    {
        // put your code here
        return can;
    }
    public void addToken(int tokensIn)
    {
        // put your code here
        this.token+=tokensIn;
        can-=1;
    }
    public void addCan(int cansIn)
    {
        // put your code here
        this.can+=cansIn;
    }
    

}