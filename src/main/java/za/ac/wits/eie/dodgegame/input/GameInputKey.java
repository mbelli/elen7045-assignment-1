package za.ac.wits.eie.dodgegame.input;

import za.ac.wits.eie.dodgegame.sceneobject.Vector2;


/**
 * GameInputKey, represent a keyboard key, and keeps track of which key is being pressed
 * 
 * @author Thierry Mbelli
 * @since 19 April 2014
 * @version 1.0
 *
 */
public class GameInputKey {
	
	public int keyCode;
        public static boolean mouseActive = false;
	public static GameInputKey keyPressed;
        public static GameInputKey mouseButtonPressed;
        public static Vector2 mousePosition;

	public static GameInputKey LEFT = GameInputKey.newInstance(37);
	public static GameInputKey RIGHT = GameInputKey.newInstance(39);
	
	public GameInputKey(int keyCode) {
		this.keyCode = keyCode;
	}

	/**
	 * Create new GameInputKey instance
	 * @param keyCode
	 * @return
	 */
	public static GameInputKey newInstance(int keyCode){
		GameInputKey KeyboardInputKey = new GameInputKey(keyCode);
		return KeyboardInputKey;
	}
}
