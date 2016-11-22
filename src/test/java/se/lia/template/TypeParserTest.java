package se.lia.template;


import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import se.lia.datafangst.FileType;
import se.lia.datafangst.TypeParser;


public class TypeParserTest 
{

	XmlObject x;
	
	@Before
	public void setup() throws XmlException, IOException
	{
		File f = new File("XMLUnderlag/GrundOchMarginal.xml");
		x = XmlObject.Factory.parse(f);
	}
	
	@Test
	public void testGetFileType()
	{
		Assert.assertEquals(FileType.GRUNDOCHMARGINAL, TypeParser.getFileType(x));
	}


}
