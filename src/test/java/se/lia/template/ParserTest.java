package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ParserTest 
{
	private Parser p;
	private File valid, invalid;
	
	@Before
	public void setUp()
	{
		p = new GrundMarginalParser();
		valid = new File("XMLUnderlag/GrundOchMarginal.xml");
		invalid = new File("XMLUnderlag/GrundOchMarginalInvalid.xml");
	}

	@Test
	public void validTest() 
	{
		Assert.assertTrue(p.validate(valid));
	}
	
	@Test
	public void invalidTest()
	{
		Assert.assertFalse(p.validate(invalid));
	}
}
