package za.ac.wits.eie.dodgegame.sceneobject.colliders;

import java.awt.Shape;

import za.ac.wits.eie.dodgegame.sceneobject.SceneObject;



/**
 * A super class for all collision type objects
 * 
 * @author Thierry Mbelli
 * @since 22 April 2014
 * @version 1.0
 * 
 */
public abstract class Collider {

	public Shape collider;
	public SceneObject sceneObject;

	/**
	 * Constructor
	 * 
	 * @param transform
	 */
	public Collider(SceneObject sceneObject) {
		this.sceneObject = sceneObject;
		this.createCollider();
	}

	/**
	 * Create shape for the collider
	 */
	protected abstract void createCollider();
	
	/**
	 * Recreate collider with position that always match the sceneObject 
	 * @param sceneObject
	 */
	public void updateCollider(SceneObject sceneObject){
		this.createCollider();
	}

	/**
	 * Check if this collider has collided with another collider
	 * 
	 * @param otherCollider
	 * @return
	 */
	public boolean isHit(Collider otherCollider) {
		boolean hasCollided = false;
		if (collider != null) {
			if (collider.getBounds().intersects(
					otherCollider.collider.getBounds())) {
				hasCollided = true;
			}
		}
		return hasCollided;
	}
}
