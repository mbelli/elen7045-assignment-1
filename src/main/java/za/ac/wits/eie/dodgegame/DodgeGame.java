package za.ac.wits.eie.dodgegame;

import java.awt.Dimension;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import za.ac.wits.eie.dodgegame.graphics.Game;
import za.ac.wits.eie.dodgegame.input.GameInputKey;
import za.ac.wits.eie.dodgegame.sceneobject.SceneObject;
import za.ac.wits.eie.dodgegame.sceneobject.Sprite;
import za.ac.wits.eie.dodgegame.sceneobject.Vector2;
import za.ac.wits.eie.dodgegame.timer.GameTimer;
import za.ac.wits.eie.dodgegame.timer.GameTimedEvent;

/**
 * DodgeGame is a simple game where a player is spawned in the game world
 * raining drops, the game objective is to avoid raindrop from hitting the player as
 * long as possible
 *
 * @author Thierry Mbah
 * @since 10 April 2014
 * @version 1.0
 *
 */
public class DodgeGame extends Game {

    private Dimension windowSize = new Dimension(640, 480);
    
    /**
     * The player controlled character player
     */
    private Sprite player;
    /**
     * Game controller variables
     */
    private int moveSpeed = 3;
    private int noOfRaindrops = 2;
    GameTimer raindropTimer = new GameTimer();
    
    @Override
    public void initialise() {
        graphics.graphicWindowSize = windowSize;
        content.directory = "content/bomb";
        gameTitle = "The Dodge Game";
    }

    @Override
    public void onStart() {
    	
        // Create player character
    	Player player1 = new Player();
    	player = player1.getNewInstance(Vector2.newInstance(320, 420), content);
        sceneGraph.addSceneObject(player);

        // Spawn a rain sprite at every 3 seconds after 1 minute delay
        raindropTimer.scheduleAtFixedRate(1500, 1500, new GameTimedEvent() {
            public void run() {
                for (int i = 0; i <= noOfRaindrops; i++) {
                    Raindrop raindrop = Raindrop.newInstance(Vector2.newInstance(getRandomNo(610), -getRandomNo(200)), content);
                    sceneGraph.addSceneObject(raindrop);
                }
            }
        });
    }


    @Override
    public void onUpdate() {
    	
     // Move player character
        if (GameInputKey.keyPressed.keyCode == GameInputKey.LEFT.keyCode) {
        	player.transform.position.x = player.transform.position.x + -(moveSpeed);
            if (player.transform.position.x < -26) {
            	player.transform.position.x = 640;
            }
        }

        if (GameInputKey.keyPressed.keyCode == GameInputKey.RIGHT.keyCode) {
        	player.transform.position.x = player.transform.position.x + moveSpeed;
            if (player.transform.position.x > 480) {
            	player.transform.position.x = -26;
            }
        }
        
        // Check collision between player and raindrop
        List<SceneObject> sceneRaindrops = sceneGraph.getListOfSceneObjectsByClass("Raindrop");
        for (SceneObject raindrop : sceneRaindrops) {
            Raindrop currentRaindrop = (Raindrop) raindrop;
            if (player.collider.isHit(currentRaindrop.collider)) {
                setGamePlaying(false);
            	break;
            }
        }
        if(isGamePlaying() == false) {

         int result = JOptionPane.showConfirmDialog(null, "Game Over. Start a new Game?", "The Dodge Game", JOptionPane.YES_NO_OPTION);
		 if(result == 0)
		 {
			 new DodgeGame().runGame();
		 }
		 if(result == 1) {
			 System.exit(0);
		 }
          
       }
    }
    
    /**
     * Generate random number
     *
     * @param maxInt
     * @return
     */
    private double getRandomNo(int maxInt) {
        Random generator = new Random();
        double randomInt = generator.nextInt(maxInt);
        return randomInt;
    }
    
    /**
     * Game main method
     *
     * @param args
     */
    public static void main(String[] args) {
        new DodgeGame().runGame();
    }

}
