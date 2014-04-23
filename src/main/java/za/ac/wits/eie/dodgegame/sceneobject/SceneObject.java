package za.ac.wits.eie.dodgegame.sceneobject;

import java.awt.Graphics2D;

import za.ac.wits.eie.dodgegame.sceneobject.colliders.Collider;

/**
 * Abstract class for all scene objects, represent any object that can be added to the game scene
 * 
 * @author Thierry Mbelli
 * @since 18 April 2014
 * @version 1.0
 *
 */
public abstract class SceneObject {

	public String name;
	public String className;
	public boolean visible;
	public Transform transform;
	public int layerId;
	public Collider collider;
	public int width;
	public int height;
	
	public SceneObject(){
		name = "sceneObject";
		className = "SceneObject";
		transform = Transform.newInstance();
	}

	public abstract void draw(Graphics2D graphics);
	public abstract void onUpdate();
	
}
