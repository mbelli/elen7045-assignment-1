package za.ac.wits.eie.dodgegame.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JPanel;

import za.ac.wits.eie.dodgegame.input.GameKeyInputManager;
import za.ac.wits.eie.dodgegame.input.GameMouseInputManager;
import za.ac.wits.eie.dodgegame.sceneobject.SceneObject;


/**
 * GraphicsDeviceCanvas, contains java graphics 2d object which draws and
 * updates content on the game window
 *
 * @author Thierry Mbelli
 * @since 20 April 2014
 * @version 1.0
 *
 */
public class GraphicsDeviceCanvas extends JPanel {

    public CopyOnWriteArrayList<SceneObject> listOfSceneObjects;
    private static final long serialVersionUID = 1L;
    private final int maxLayer = 10;
    private Graphics2D graphics;

    public GraphicsDeviceCanvas() {
        listOfSceneObjects = new CopyOnWriteArrayList<SceneObject>();
        addKeyListener(GameKeyInputManager.getInstance());
        addMouseListener(GameMouseInputManager.getInstance());
        setDoubleBuffered(true);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.graphics = (Graphics2D) g.create();
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        for (int i = 0; i <= maxLayer; i++) {
            for (SceneObject sceneObject : listOfSceneObjects) {
                if (sceneObject.layerId == i) {
                    sceneObject.draw(graphics);
                }
            }
        }
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
}
