package za.ac.wits.eie.dodgegame.sceneobject.colliders;

import java.awt.Rectangle;

import za.ac.wits.eie.dodgegame.sceneobject.SceneObject;
import za.ac.wits.eie.dodgegame.sceneobject.Transform;


/**
 * ObjectCollider, a collider that uses a Rectangle shape as the collider box
 * 
 * @author Thierry Mbelli
 * @since 22 April 2014
 * @version 1.0
 * 
 */
public class ObjectCollider extends Collider {

	/**
	 * Constructor
	 * 
	 * @param sceneObject
	 */
	public ObjectCollider(SceneObject sceneObject) {
		super(sceneObject);
	}

	@Override
	protected void createCollider() {
		if (sceneObject != null) {
			Transform transform = sceneObject.transform;
			collider = new Rectangle((int) transform.position.x,
					(int) transform.position.y, sceneObject.width,sceneObject.height);
		}
	}
}
