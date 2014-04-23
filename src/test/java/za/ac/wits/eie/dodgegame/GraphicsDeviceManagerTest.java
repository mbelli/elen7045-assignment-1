package za.ac.wits.eie.dodgegame;

import static org.junit.Assert.*;

import java.awt.Dimension;

import org.junit.Test; 

import za.ac.wits.eie.dodgegame.graphics.GraphicsDeviceManager;

public class GraphicsDeviceManagerTest {
	
	@Test
	public void createDisplay() {
		GraphicsDeviceManager graphicsDevice = new GraphicsDeviceManager();
		graphicsDevice.createDisplay();
		assertEquals(graphicsDevice.graphicWindowSize, new Dimension(900, 530));
	}
}
