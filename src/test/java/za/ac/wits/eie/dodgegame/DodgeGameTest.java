package za.ac.wits.eie.dodgegame;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DodgeGameTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DodgeGameTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DodgeGameTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGameBoard()
    {
        assertNotNull(new DodgeGameBoard() );
    }
}
