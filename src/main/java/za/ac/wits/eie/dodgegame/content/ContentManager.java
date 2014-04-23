package za.ac.wits.eie.dodgegame.content;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * ContentManager, loads all available game content in memory for easy access during game play,
 * the content needs to be added to a directory that can be accessible during game initialization process
 * 
 * @author Thierry Mbelli
 * @since 14 April 2014
 * @version 1.0
 */
public class ContentManager {

	public String directory;
	public List<Content> content;

	/**
	 * default content manager constructor
	 */
	public ContentManager() {
		content = new ArrayList<Content>();
		directory = "Please specify content directory";
	}
	
	public Content getContent(String name){
		Content gameContent = new Content();
		for(Content currentContent : content){
			if(currentContent.getName().equals(name)){
				gameContent = currentContent;
				break;
			}
		}
		return gameContent;
	}

	/**
	 * load all content from the provided root directory
	 */
	public void load() {
		File contentDirectory = new File(directory);
		if(contentDirectory.isDirectory()){
			loadDirectoryContent(contentDirectory);
		}
	}

	/**
	 * load all content from a specific directory
	 * 
	 * @param contentDirectory
	 */
	private void loadDirectoryContent(File contentDirectory) {
		File [] files = contentDirectory.listFiles();
		for(int i = 0; i < files.length; i++){
			File currentFile = files[i]; 
			if(currentFile.isDirectory()){
				loadDirectoryContent(currentFile);
			}else{
				content.add(createContent(currentFile));
			}
		}
	}

	/**
	 * create game content from file system resources
	 * 
	 * @param currentFile
	 * @return
	 */
	private Content createContent(File currentFile) {
		Content gameContent = new Content();
		if(currentFile != null && currentFile.isFile()){
			gameContent = Content.newContent(Content.getContentName(currentFile.getName()),currentFile.getAbsoluteFile(), 
					currentFile.getPath(), Content.getContentExtension(currentFile.getName()));
		}
		return gameContent;
	}
	
	/**
	 * unload all game contents from memory
	 */
	public void unload() {
		directory = "";
		content.clear();
	}
}