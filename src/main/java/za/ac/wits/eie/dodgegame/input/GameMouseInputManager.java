/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.wits.eie.dodgegame.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import za.ac.wits.eie.dodgegame.sceneobject.Vector2;
/**
 *
 * @author Thierry Mbelli
 */
public class GameMouseInputManager implements MouseListener {
    
    private static GameMouseInputManager manager = null;
    private int mouseCode = 0;

    protected GameMouseInputManager() {
      GameInputKey.mouseButtonPressed = GameInputKey.newInstance(mouseCode);
      GameInputKey.mousePosition = Vector2.ZERO;
    }

    /**
     * Get input manager singleton instance
     *
     * @return
     */
    public static GameMouseInputManager getInstance() {
        if (manager == null) {
            manager = new GameMouseInputManager();
        }
        return manager;
    }
    /**
     * Reset clicked button to null key and reset key press flag to false
     */
    private void reset() {
        GameInputKey.mouseButtonPressed = GameInputKey.newInstance(mouseCode);
        GameInputKey.mousePosition = Vector2.ZERO;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        GameInputKey.mouseButtonPressed = GameInputKey.newInstance(e.getButton());
        GameInputKey.mousePosition = Vector2.newInstance(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
     
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        reset();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }
}
