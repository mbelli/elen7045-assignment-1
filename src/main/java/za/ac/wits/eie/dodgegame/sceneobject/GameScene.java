package za.ac.wits.eie.dodgegame.sceneobject;

import java.util.ArrayList;
import java.util.List;

import za.ac.wits.eie.dodgegame.graphics.GraphicsDeviceCanvas;


/**
 * The main game scene graph, contains and allows object to interact with all loaded SceneObjects in a game.
 * Keeps track of all sceneObjects
 * 
 * @author Thierry Mbelli
 * @since 18 April 2014
 * @version 1.0
 *
 */
public class GameScene {
	
	private GraphicsDeviceCanvas graphicsDevice;
	
	public GameScene(GraphicsDeviceCanvas graphicsDevice){
		this.graphicsDevice = graphicsDevice;
	}
	
	/**
	 * Find all scene objects and call their no update method
	 */
	public void onUpdate() {
		for(SceneObject object : graphicsDevice.listOfSceneObjects){
			object.onUpdate();
		}
	}

	public void addSceneObject(SceneObject sceneObject) {
		if(sceneObject != null)
			graphicsDevice.listOfSceneObjects.add(sceneObject);
	}

	public void destroySceneObject(SceneObject sceneObject) {
		if(sceneObject != null)
			graphicsDevice.listOfSceneObjects.remove(sceneObject);
	}

	public SceneObject getSceneObjectByName(String name) {
		SceneObject foundSceneObject = null;
		 for(SceneObject currSceneObject : graphicsDevice.listOfSceneObjects){
			 if(currSceneObject.name.equals(name)){
				 foundSceneObject = currSceneObject;
				 break;
			 }
		 }
		return foundSceneObject;
	}

	public SceneObject getSceneObjectByClass(String className) {
		SceneObject foundSceneObject = null;
		 for(SceneObject currSceneObject : graphicsDevice.listOfSceneObjects){
			 if(currSceneObject.className.equals(className)){
				 foundSceneObject = currSceneObject;
				 break;
			 }
		 }
		return foundSceneObject;
	}

	public List<SceneObject> getListOfSceneObjectsByClass(String className) {
		List<SceneObject> results = new ArrayList<SceneObject>();
		for(SceneObject currSceneObject : graphicsDevice.listOfSceneObjects){
			 if(currSceneObject.className.equals(className)){
				 results.add(currSceneObject);
			 }
		 }
		return results;
	}

	public List<SceneObject> getListOfSceneObjectsByName(String name) {
		List<SceneObject> results = new ArrayList<SceneObject>();
		for(SceneObject currSceneObject : graphicsDevice.listOfSceneObjects){
			 if(currSceneObject.name.equals(name)){
				 results.add(currSceneObject);
			 }
		 }
		return results;
	}

	public List<SceneObject> getListOfSceneObjectsByLayerId(int layerId) {
		List<SceneObject> results = new ArrayList<SceneObject>();
		for(SceneObject currSceneObject : graphicsDevice.listOfSceneObjects){
			 if(currSceneObject.layerId == layerId){
				 results.add(currSceneObject);
			 }
		 }
		return results;
	}
	
	public int getNoOfSceneObjects(){
		int size = 0;
		if(graphicsDevice.listOfSceneObjects != null)
			size = graphicsDevice.listOfSceneObjects.size();
		return size;
	}
	
	public List<SceneObject> getAllSceneObjects() {
		return graphicsDevice.listOfSceneObjects;
	}
}
