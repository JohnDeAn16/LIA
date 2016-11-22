package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import se.lia.datafangst.Parser;
import se.lia.exceptions.DataFangstException;


public class ParserTest 
{
	private File valid, invalid, text;
	
	@Before
	public void setUp()
	{
		valid = new File("XMLUnderlag/GrundOchMarginal.xml");
		invalid = new File("XMLUnderlag/GrundOchMarginalInvalid.xml");
		text = new File("XMLUnderlag/Hello.txt");
	}
	
	@Test
	public void testValid() throws DataFangstException
	{
		Assert.assertNotNull(Parser.getValidXmlObject(valid));
	}
	
	@Test
	public void testInvalid()
	{
		try
		{
			Parser.getValidXmlObject(invalid);
		}
		catch(DataFangstException e)
		{
			Assert.assertEquals(2, e.getErrorCode());
		}
	}
	
	@Test
	public void testInvalidFileType()
	{
		try
		{
			Parser.getValidXmlObject(text);
		}
		catch(DataFangstException e)
		{
			Assert.assertEquals(1, e.getErrorCode());
			Assert.assertNotEquals(2,  e.getErrorCode());
		}
	}
}
