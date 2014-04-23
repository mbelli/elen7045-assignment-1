package za.ac.wits.eie.dodgegame.sceneobject;

import java.awt.Graphics2D;

import za.ac.wits.eie.dodgegame.content.Texture;


/**
 * Sprite, 
 * 
 * @author Thierry Mbelli
 * @since 15 April 2014
 * @version 1.0
 *
 */
public class Sprite extends SceneObject {
	
	public double alpha;
	public Texture texture;
	
	@Override
	public void onUpdate() {}
	
	@Override
	public void draw(Graphics2D graphics) {
		if(texture != null){
			graphics.drawImage(texture.image, (int)transform.position.x, (int)transform.position.y, width, height, null);
			if(collider != null){
				collider.updateCollider(this);
			}
		}
	}
}
