package za.ac.wits.eie.dodgegame;

import static org.junit.Assert.*;

import org.junit.Test;

import za.ac.wits.eie.dodgegame.content.ContentManager;

public class ContentManagerTest {

	@Test
	  public void load() {
		  ContentManager content = new ContentManager();
		  content.directory = "content";
		  content.load();
		  assertTrue( content.content.size() > 1);
		  System.out.println(content.content.size());
	  }
}
