package za.ac.wits.eie.dodgegame;

import za.ac.wits.eie.dodgegame.content.ContentManager;
import za.ac.wits.eie.dodgegame.content.Texture;
import za.ac.wits.eie.dodgegame.sceneobject.Sprite;
import za.ac.wits.eie.dodgegame.sceneobject.Vector2;
import za.ac.wits.eie.dodgegame.sceneobject.colliders.ObjectCollider;

public class Player extends Sprite {
	/**
     * The player controlled character player
     */
    private Texture playerTexture;
    /**
     * Game controller variables
     */
    private Vector2 playerStartPosition = Vector2.newInstance(320, 420);
	
	public Player(){}
	
	public Player getNewInstance(Vector2 position, ContentManager content){
		Player player = new Player();
		playerTexture = new Texture(content.getContent("player"));
      	player.transform.position = playerStartPosition;
      	player.texture = playerTexture;
      	player.className = "Player";
      	player.name = "IronMan";
      	player.layerId = 5;
      	player.width = 60;
      	player.height = 60;
      	player.collider = new ObjectCollider(player);
		return player;
		
	}
	
	 @Override
	    public void onUpdate() {
		 
	 }
}
