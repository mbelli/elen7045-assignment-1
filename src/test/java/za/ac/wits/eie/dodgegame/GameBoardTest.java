package za.ac.wits.eie.dodgegame;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GameBoardTest extends TestCase
{    
	/**     
	 * Create the test case     
	 *     
	 * @param testName name of the test case     
	 */    
	public GameBoardTest( String testName )   
	{        
		super( testName );    
	}    
	/**     
	 * @return the suite of tests being tested     
	 */    
	public static Test suite()    
	{        
		return new TestSuite( GameBoardTest.class );    
	}    
	/**     
	 * Rigourous Test :-)     
	 */    
	public void testGameBoard()    
	{        
		assertNotNull(new DodgeGame() );    
	}
}
