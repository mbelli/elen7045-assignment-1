/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.wits.eie.dodgegame.scene;

import za.ac.wits.eie.dodgegame.engine.GameScene;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import za.ac.wits.eie.dodgegame.constants.IDodgeGameConstants;
/**
 *
 * @author Thierry
 */
public class GamePlayingScene extends GameScene{
    private Timer timer = new Timer();
    private Random randomGenerator;
    //private Raindrop raindropInstance;
    private int bound = 100;
	
    public GamePlayingScene(){
        //this.addSceneObject(new Player());
	generateRaindrops();
    }
	
    private void generateRaindrops() {
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                createRaindrops();
            }
	}, 0, 1000);
//        if(raindropInstance != null){
//            addSceneObject(raindropInstance);
//        }
    }
	
    private void createRaindrops() {
//        raindropInstance = new Raindrop();
//        raindropInstance.setPosition(new Vector2d(getRandomXPos(),-getRandomYPos()));
//	addSceneObject(raindropInstance);
    }
	
    private int getRandomXPos() {
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(IDodgeGameConstants.GAME_WIN_SIZE.width - bound);
        return randomInt;
    }
	
    private int getRandomYPos() {
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(bound);
	return randomInt;
    }
}
