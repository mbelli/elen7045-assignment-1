/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.wits.eie.dodgegame.engine;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Thierry
 */
public class GameEngine {
    
    private String title;
    private Dimension windowSize;
    private JFrame window;
    private GameScene gameScene;
    
    public GameEngine(String title, Dimension windowSize) {
        this.title = title;
        this.windowSize = windowSize;
        initGame();
    }
    
    private void initGame() {
        window = new JFrame(title);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(windowSize);
	window.setResizable(false);
	window.setLocationRelativeTo(null);
    }
    
    protected void setGameScene(GameScene gameScene) {
        this.gameScene = gameScene;
    }
    
    public void runGame(){
        if(gameScene != null){
            window.add(gameScene.getGameSceneCanvas(), BorderLayout.CENTER);
            window.setVisible(true);
        }
    }
}
