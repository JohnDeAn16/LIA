package se.lia.template;


import java.io.File;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DocParserTest 
{
	private DocParser doc;
	
	@Before
	public void setup()
	{
		doc = new DocParser(new File("XMLUnderlag/Doc.xml"));
	}
	
	@Test
	public void testGetFiles()
	{
		ArrayList<String> arrList = doc.getTypeFileNames("GrundOchMarginal");
		Assert.assertEquals("GrundMarginal.xml", arrList.get(0));
		Assert.assertEquals("GrundMarginalInvalid.xml", arrList.get(1));
		Assert.assertTrue(arrList.size() == 2);
	}

}
