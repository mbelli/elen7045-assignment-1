package za.ac.wits.eie.dodgegame.sceneobject;

/**
 * A game object transform object, hold scene object position and rotation
 * values
 * 
 * @author Thierry Mbelli
 * @since 20 April 2014
 * @version 1.0
 * 
 */
public class Transform {
	
	public Vector2 position;
	public Vector2 rotation;

	public Transform(Vector2 position, Vector2 rotation) {
		this.position = position;
		this.rotation = rotation;
	}

	public static Transform newInstance() {
		Transform transform = new Transform(Vector2.ZERO, Vector2.ZERO);
		return transform;
	}
}
