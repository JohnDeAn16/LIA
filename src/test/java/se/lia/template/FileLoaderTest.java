package se.lia.template;

import java.io.File;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import se.lia.datafangst.FileLoader;

public class FileLoaderTest {

	
	@Test
	public void testGetFiles()
	{
		ArrayList<File> files = FileLoader.getFiles(new File("XMLUnderlag"));
		Assert.assertEquals("AldersInverkan.xml", files.get(0).getName());
		Assert.assertEquals("GrundOchMarginal.xml", files.get(1).getName());
	}


}
