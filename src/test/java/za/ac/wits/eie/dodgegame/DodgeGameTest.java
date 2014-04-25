package za.ac.wits.eie.dodgegame;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import junit.framework.Test;
import junit.framework.TestSuite;

public class DodgeGameTest extends TestCase
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
	public void testPlayer()    
	{        
		assertNotNull(new Player() );    
	}
	/**     
	 * Rigourous Test :-)     
	 */    
	public void testRaindrop()    
	{        
		assertNotNull(new Raindrop() );    
	}
	
	/**     
	 * Rigourous Test :-)     
	 */    
	public void testCollision()    
	{        
		assertTrue(new Player().collider.isHit(new Raindrop().collider));    
	}
}
