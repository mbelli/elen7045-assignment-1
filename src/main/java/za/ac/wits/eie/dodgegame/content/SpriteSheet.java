package za.ac.wits.eie.dodgegame.content;

import java.awt.image.BufferedImage;


/**
 * A texture object that supports loading sprite sheet images
 * 
 * @author Thierry Mbelli
 * @since 10 April 2014
 * @version 1.0
 *
 */
public class SpriteSheet extends Texture{
	
	public BufferedImage [] sprites;
	public int noOfFrames;
	private int columns;
	private int height;
	private int width;
	private int rows;
	
	public SpriteSheet(Content content,int noOfFrames, int rows, int columns, int width, int height) {
		super(content);
		this.noOfFrames = noOfFrames;
		this.columns = columns;
		this.height = height;
		this.width = width;
		this.rows = rows;
		createSprites();
	}
	
	public void createSprites() {
		sprites = new BufferedImage [noOfFrames]; 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sprites[(i * columns) + j] = image.getSubimage(j * width, i* height, width, height);
			}
		}
	}
}
