

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

    public Vending(int can)
    {
        // initialise instance variables
        this.can=10;
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
        can-=tokensIn;
    }
    public void addCan(int cansIn)
    {
        // put your code here
        this.can+=cansIn;
    }
    

}