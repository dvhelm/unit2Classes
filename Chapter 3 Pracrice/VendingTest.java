
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingTest
     */
    public VendingTest()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testaddToken()
    {
        Vending vending = new Vending(10);
        vending.addToken(1);
        assertEquals (1,vending.getToken(), 1e-6);
        assertEquals (9,vending.getCan(), 1e-6);
        vending.addToken(4);
        assertEquals (5,vending.getToken(), 1e-6);
        assertEquals (5,vending.getCan(), 1e-6);
    }

    @Test
    public void testgetToken()
    {
        Vending vending = new Vending(10);
        assertEquals(0.0,vending.getToken(),1e-6);
        assertEquals(10.0,vending.getCan(),1e-6);
        vending.addToken(6);
        assertEquals(6.0,vending.getToken(),1e-6);
        assertEquals(4.0,vending.getCan(),1e-6);

    }
    @Test
    public void testaddCan()
    {
        Vending vending = new Vending(10);
        vending.addCan(15);
        assertEquals(0,vending.getToken(),1e-6);
        assertEquals(25,vending.getCan());
        
    }
    @Test
    public void testgetCan()
    {
        Vending vending = new Vending(10);
        vending.addCan(23);
        assertEquals(33,vending.getCan());
        vending.addToken(19);
        assertEquals(19,vending.getToken());
        assertEquals(14,vending.getCan());
    }
}
