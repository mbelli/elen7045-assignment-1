package za.ac.wits.eie.dodgegame.graphics;

import za.ac.wits.eie.dodgegame.content.ContentManager;
import za.ac.wits.eie.dodgegame.sceneobject.GameScene;

/**
 * Game the abstract game type, it initializes game graphics, content manager,
 * game timer and input devices
 * 
 * Game also provide the game loop from the run game method
 * 
 * @author Thierry Mbelli
 * @since 12 April 2014
 * @version 1.0
 */
public abstract class Game implements IGame {

	private static final int FRAME_UPDATE_RATE = 30; 
	protected GraphicsDeviceManager graphics;
	protected boolean gamePlaying = true;
	protected ContentManager content;
	protected GameScene sceneGraph;
	protected String gameTitle;
	

	public Game() {
		graphics = new GraphicsDeviceManager();
		content = new ContentManager();
	}

	/**
	 * initialize game graphics settings, load all provided game content to
	 * memory and initialize input devices
	 */
	private void initializeGame() {
		this.initialise();
		this.loadContent();
		graphics.initialise(gameTitle);
	}

	public void loadContent() {
		if (content != null)
			content.load();
	}

	/**
	 * destroy loaded devices and clears all game content from the memory
	 */
	public void endGame() {
		graphics.destroyDisplay();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see za.ac.wits.eie.dodgegame.graphics.IGame#runGame()
	 */
	public void runGame() {
		initializeGame();
		graphics.createDisplay();
		sceneGraph = new GameScene(graphics.getGraphicsDeviceCanvas());
		onStart();
		Thread gameThread = new Thread() {
			public void run() {
				while (gamePlaying) {
					onUpdate();
					sceneGraph.onUpdate();
					graphics.repaintCanvas();
					try {
						Thread.sleep(1000 / FRAME_UPDATE_RATE);
					} catch (InterruptedException ex) {}
				}
				endGame();
			}
		};
		gameThread.start(); // Invoke GaemThread.run()
	}
	
	public boolean isGamePlaying() {
		return gamePlaying;
	}
	
	public void setGamePlaying(boolean gamePlaying) {
		this.gamePlaying = gamePlaying;
	}
}
