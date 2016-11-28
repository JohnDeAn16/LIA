package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import se.lia.datafangst.AldersInverkanParser;
import se.lia.datafangst.ParserFactory;
import se.lia.model.AldersInverkanEntity;

public class AldersInverkanParserTest {

	private AldersInverkanParser p;
	private AldersInverkanEntity e;
	private File f;
	
	@Before
	public void setUp() throws Exception 
	{
		f = new File("XMLUnderlag/AldersInverkan.xml");
		p = (AldersInverkanParser)ParserFactory.getParser(f);
		e = p.makeEntity();
	}
	
	@Test
	public void testMakeEntity()
	{
		Assert.assertEquals(2001, e.getFastighetsTaxeringsAr());
	}
	
	@Test
	public void testSaveEntity()
	{
		p.saveEntity();
	}



}
