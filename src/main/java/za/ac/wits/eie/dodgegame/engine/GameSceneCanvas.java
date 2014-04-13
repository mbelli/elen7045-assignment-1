/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.wits.eie.dodgegame.engine;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author Thierry
 */
public class GameSceneCanvas extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private Color defaultSceneColor = new Color(30,144,255,200);
    private Timer timer;
	
    public GameSceneCanvas(){
        setBackground(defaultSceneColor.brighter());
	setFocusable(true);
	setDoubleBuffered(true);
	timer = new Timer(5, this);
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        repaint(); 
    }
}
