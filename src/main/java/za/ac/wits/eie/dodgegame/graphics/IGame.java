package za.ac.wits.eie.dodgegame.graphics;

/**
 * IGame, interface for game type object
 * 
*  @author Thierry Mbelli
 * @since 12 April 2014
 * @version 1.0
 *
 */
public interface IGame {
	
	public void initialise();
	public void loadContent();
	public void onStart();
	public void onUpdate();
	public void runGame();

}
