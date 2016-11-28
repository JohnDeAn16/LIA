package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import se.lia.datafangst.AldersInverkanParser;
import se.lia.datafangst.GrundMarginalParser;
import se.lia.datafangst.Parser;
import se.lia.datafangst.ParserFactory;
import se.lia.exceptions.DataImportException;

public class ParserFactoryTest 
{
	@Test
	public void testGetFactory() throws DataImportException
	{
		Parser parser = ParserFactory.getParser(new File("XMLUnderlag/AldersInverkan.xml"));
		Assert.assertTrue(parser instanceof AldersInverkanParser);
		Assert.assertFalse(parser instanceof GrundMarginalParser);
	}
	
	@Test
	public void testInvalidFile()
	{
		Parser parser = null;
		try 
		{
			parser = ParserFactory.getParser(new File("XMLUnderlag/Hello.txt"));
		} 
		catch (DataImportException e) 
		{
			Assert.assertNull(parser);
		}
	}

}
