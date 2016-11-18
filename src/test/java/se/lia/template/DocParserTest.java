package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DocParserTest 
{

	private File f;
	DocParser dp;
	
	@Before
	public void setup()
	{
		f = new File("XMLUnderlag/GrundOchMarginal.xml");
		dp = new DocParser();
	}
	
	@Test
	public void testGetFileType()
	{
		Assert.assertEquals(FileType.GRUNDOCHMARGINAL, dp.getFileType(f));
	}


}
