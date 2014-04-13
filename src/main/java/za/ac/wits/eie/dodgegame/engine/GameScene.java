/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.wits.eie.dodgegame.engine;

/**
 *
 * @author Thierry
 */
public class GameScene {
    private static GameSceneCanvas gameSceneCanvas;
    
    public GameScene(){
        setSceneCanvas(new GameSceneCanvas());
    }

    public static GameSceneCanvas getGameSceneCanvas() {
        return gameSceneCanvas;
    }

    private void setSceneCanvas(GameSceneCanvas gameSceneCanvas) {
        GameScene.gameSceneCanvas = gameSceneCanvas;
    }
}
