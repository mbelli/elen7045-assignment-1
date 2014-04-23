package za.ac.wits.eie.dodgegame.graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * The main graphics device class, initializes the Graphics2D object which
 * provide more sophisticated control over geometry, coordinate transformations,
 * color management, and text layout.
 * 
 * It provides the game rendering process, which can be broken down into four
 * phases that are controlled by the Graphics2D rendering attributes
 * 
 * @author Thierry Mbelli
 * @since 21 April 2014
 * @version 1.0
 * 
 */
public class GraphicsDeviceManager {

	private GraphicsDeviceCanvas graphicsDeviceCanvas;
	public Dimension graphicWindowSize;
	private JFrame graphicWindow;

	/**
	 * default graphics device constructor
	 */
	public GraphicsDeviceManager() {}
	
	public void initialise(String title){
		graphicWindow = new JFrame(title);
		graphicsDeviceCanvas = new GraphicsDeviceCanvas();
		graphicWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graphicWindow.setSize(graphicWindowSize);
		graphicWindow.setResizable(false);
		graphicWindow.setLocationRelativeTo(null);
	}
	
	public void repaintCanvas() {
		graphicsDeviceCanvas.repaint();
	}
	
	public GraphicsDeviceCanvas getGraphicsDeviceCanvas() {
		return graphicsDeviceCanvas;
	}

	/**
	 * show graphics canvas
	 */
	public void createDisplay(){
		if(graphicWindow != null){
			graphicWindow.add(graphicsDeviceCanvas, BorderLayout.CENTER);
			graphicWindow.setVisible(true);
		}
	}
	
	/**
	 * show graphics canvas
	 */
	public void destroyDisplay(){
		if(graphicWindow != null){
			graphicWindow.add(graphicsDeviceCanvas, BorderLayout.CENTER);
			graphicWindow.setVisible(false);
		}
	}
}