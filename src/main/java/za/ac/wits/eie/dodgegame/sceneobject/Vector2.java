package za.ac.wits.eie.dodgegame.sceneobject;

/**
 * A mathematical representation of a vector object
 * 
 * @author Thierry Mbelli
 * @since 15 April 2014
 * @version 1.0
 * 
 */
public class Vector2 {

	public double x;
	public double y;

	public static Vector2 ZERO = Vector2.newInstance(0, 0);

	/**
	 * Vector2 object constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Create new vector instance
	 * @param x
	 * @param y
	 * @return
	 */
	public static Vector2 newInstance(double x, double y) {
		Vector2 vector = new Vector2(x, y);
		return vector;
	}
}
