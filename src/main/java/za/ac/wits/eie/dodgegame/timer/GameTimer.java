package za.ac.wits.eie.dodgegame.timer;

import java.util.Timer;



/**
 * GameTimer, provides game timer functionalities and lapse events
 * 
 * @author Thierry Mbelli
 * @since 15 April 2014
 * @version 1.0
 *
 */
public class GameTimer {
	
	public Timer gameTime;
	
	public GameTimer(){
		gameTime = new Timer();
	}
	
	/**
	 * Schedule task to run at specified period interval after a delay
	 * 
	 * @param delay
	 * @param period
	 * @param gameTimedEvent
	 */
	public void scheduleAtFixedRate(long delay, long period , GameTimedEvent gameTimedEvent){
		gameTime.scheduleAtFixedRate(gameTimedEvent, delay, period);
	}
	
	/**
	 * Schedule task to run only once at specified period after a delay
	 * 
	 * @param delay
	 * @param period
	 * @param gameTimedEvent
	 */
	public void scheduleOneShot(long delay, long period , GameTimedEvent gameTimedEvent){
		gameTime.scheduleAtFixedRate(gameTimedEvent, delay, period);
		gameTime.cancel();
	}
}