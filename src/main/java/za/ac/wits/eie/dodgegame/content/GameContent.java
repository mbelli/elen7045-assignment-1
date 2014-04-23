package za.ac.wits.eie.dodgegame.content;

/**
 * GameContent, represent a game resource loaded from file system 
 * 
 * @author Thierry Mbelli
 * @since 16 April 2014
 * @version 1.0
 */
public abstract class GameContent {

	protected String name;
	
	public GameContent(Content content){
		buildContent(content);
	}

	public abstract void buildContent(Content content);
}
