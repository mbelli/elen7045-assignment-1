package za.ac.wits.eie.dodgegame;

import za.ac.wits.eie.dodgegame.content.ContentManager;
import za.ac.wits.eie.dodgegame.content.Texture;
import za.ac.wits.eie.dodgegame.sceneobject.Sprite;
import za.ac.wits.eie.dodgegame.sceneobject.Vector2;
import za.ac.wits.eie.dodgegame.sceneobject.colliders.ObjectCollider;

/**
 * This is the raindrop object
 *
 * @author Thierry Mbah
 * @since 10 April 2014
 * @version 1.0
 *
 */

public class Raindrop extends Sprite {
	
	private int raindropFallSpeed = 4;
	
	public Raindrop(){}
	
	public static Raindrop newInstance(Vector2 position, ContentManager content){
		Raindrop raindrop = new Raindrop();
		raindrop.transform.position = position;
		raindrop.texture = new Texture(content.getContent("raindrop"));
		raindrop.className = "Raindrop";
		raindrop.name = "raindrop";
		raindrop.layerId = 5;
		raindrop.width = 40;
		raindrop.height = 40;
		raindrop.collider = new ObjectCollider(raindrop);
		return raindrop;
	}
	
        @Override
	public void onUpdate(){
		transform.position.y = transform.position.y + raindropFallSpeed;
	}
}
