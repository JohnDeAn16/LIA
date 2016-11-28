package se.lia.template;


import java.io.File;

import org.apache.xmlbeans.XmlObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import se.lia.datafangst.Parser;
import se.lia.exceptions.DataImportException;


public class ParserTest 
{
	private File valid, invalid, text;
	private XmlObject x;
	
	@Before
	public void setUp()
	{
		valid = new File("XMLUnderlag/GrundOchMarginal.xml");
		invalid = new File("XMLUnderlag/GrundOchMarginalInvalid.xml");
		text = new File("XMLUnderlag/Hello.txt");
		x = null;
	}
	
	@Test
	public void testValid() throws DataImportException
	{
		x = Parser.getValidXmlObject(valid);
		Assert.assertNotNull(x);
	}
	
	@Test
	public void testInvalid()
	{
		try
		{
			x = Parser.getValidXmlObject(invalid);
		}
		catch(DataImportException e)
		{
			Assert.assertEquals(2, e.getErrorCode());
			Assert.assertNull(x);
		}
		
	}
	
	@Test
	public void testInvalidFileType()
	{
		try
		{
			Parser.getValidXmlObject(text);
		}
		catch(DataImportException e)
		{
			Assert.assertEquals(1, e.getErrorCode());
			Assert.assertNotEquals(2,  e.getErrorCode());
		}
	}
}
