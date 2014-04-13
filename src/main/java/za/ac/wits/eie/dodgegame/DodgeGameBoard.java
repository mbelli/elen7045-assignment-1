/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.wits.eie.dodgegame;

import za.ac.wits.eie.dodgegame.constants.IDodgeGameConstants;
import za.ac.wits.eie.dodgegame.engine.GameEngine;
import za.ac.wits.eie.dodgegame.scene.GamePlayingScene;

/**
 *
 * @author Thierry
 */
public class DodgeGameBoard extends GameEngine{
    
    public DodgeGameBoard() {
        super(IDodgeGameConstants.TITLE, IDodgeGameConstants.GAME_WIN_SIZE);
        setGameScene(new GamePlayingScene());
    }
    
    public static void main(String [] args){
        new DodgeGameBoard().runGame();
    }
}
