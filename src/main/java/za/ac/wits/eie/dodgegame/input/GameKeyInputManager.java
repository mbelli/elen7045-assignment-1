package za.ac.wits.eie.dodgegame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Game Keyboard Input manager, provides implementation for key listener, which allows
 * the main game canvas to receive keyboard key events
 *
 * @author Thierry Mbelli
 * @since 19 April 2014
 * @version 1.0
 *
 */
public class GameKeyInputManager implements KeyListener {

    private static GameKeyInputManager manager = null;
    private boolean keyPressed = false;
    protected int keyCode = -1;

    protected GameKeyInputManager() {
        GameInputKey.keyPressed = GameInputKey.newInstance(keyCode);
        this.reset();
    }

    /**
     * Get input manager singleton instance
     *
     * @return
     */
    public static GameKeyInputManager getInstance() {
        if (manager == null) {
            manager = new GameKeyInputManager();
        }
        return manager;
    }

    /**
     * Reset selected key to null key and reset key press flag to false
     */
    private void reset() {
        GameInputKey.keyPressed = GameInputKey.newInstance(keyCode);
        keyPressed = false;
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (!keyPressed) {
            GameInputKey.keyPressed = GameInputKey.newInstance(ke.getKeyCode());
            keyPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyCode() == GameInputKey.keyPressed.keyCode) {
            reset();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}
