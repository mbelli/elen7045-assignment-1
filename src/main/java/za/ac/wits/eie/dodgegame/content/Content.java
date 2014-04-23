package za.ac.wits.eie.dodgegame.content;

import java.io.File;

/**
 * Game content represent all recognized game contents like sounds, images, fonts ..etc
 * 
 * @author Thierry Mbelli
 * @since 14 April 2014
 * @version 1.0
 * 
 */
public class Content {

	public String name;
	public File content;
	public String path;
	public String extension;

	/**
	 * default content constructor
	 */
	public Content() {}
	
	/**
	 * Construct new content object
	 * 
	 * @param name
	 * @param url
	 * @param path
	 * @param extension
	 */
	public Content(String name, File content , String path, String extension) {
		this.extension = extension;
		this.path = path;
		this.name = name;
		this.content = content;
	}
	
	public static Content newContent(String name, File content, String path, String extension) {
		Content gameContent = new Content(name, content, path, extension);
		return gameContent;
	}
	
	/**
	 * get content file extension
	 * @param content
	 * @return
	 */
	public static String getContentExtension(String content) {
		String extension = "unkown";
		if(content != null){
			int lastIndex = content.lastIndexOf('.');
			extension = content.substring(lastIndex + 1);
		}
		return extension;
	}
	
	/**
	 * get content file name
	 * @param content
	 * @return
	 */
	public static String getContentName(String content) {
		String contentName = "unkown";
		if(content != null){
			int endIndex = content.lastIndexOf('.');
			int beginIndex = 0;
			contentName = content.substring(beginIndex, endIndex);
		}
		return contentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public File getContent() {
		return content;
	}

	public void setContent(File content) {
		this.content = content;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public String toString(){
		return this.getName();
	}
}