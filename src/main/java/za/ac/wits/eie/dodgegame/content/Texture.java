package za.ac.wits.eie.dodgegame.content;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Texture2D, a game content representing an image loaded from file system
 * 
 * @author Thierry Mbelli
 * @since 17 April 2014
 * @version 1.0
 * 
 */
public class Texture extends GameContent {
	
	public BufferedImage image;

	public Texture(Content content) {
		super(content);
	}

	/* (non-Javadoc)
	 * @see za.ac.wits.eie.dodgegame.graphics.GameContent#buildContent(za.ac.wits.eie.dodgegame.graphics.Content)
	 */
	public void buildContent(Content content) {
		if (content != null) {
			if (content.content != null) {
				try {
					this.name = content.getName();
					setImage(ImageIO.read(content.getContent()));
				} catch (IOException e) {
				}
			}
		}
	}

	private void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public String toString(){
		return this.name;
	}

}
