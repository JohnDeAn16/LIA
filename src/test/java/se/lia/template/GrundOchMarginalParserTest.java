package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import se.lia.datafangst.GrundMarginalParser;
import se.lia.datafangst.ParserFactory;
import se.lia.exceptions.DataImportException;
import se.lia.model.GrundOchMarginalEntity;


public class GrundOchMarginalParserTest 
{
	private GrundMarginalParser grundmarginalparser;
	private File xml;
	private double[] testDouble;
	
	@Before
	public void setup() throws DataImportException
	{
		testDouble = new double[] {1.1};
		xml = new File("XMLUnderlag/GrundOchMarginal.xml");
		grundmarginalparser = (GrundMarginalParser)ParserFactory.getParser(xml);
	}
	
	@Test
	public void testEntity()
	{
		GrundOchMarginalEntity e = grundmarginalparser.makeEntity();
		Assert.assertEquals(2001, e.getFastighetsTaxeringsAr());
		Assert.assertArrayEquals(testDouble, e.getNivaFaktorUndreGrans(), 0.01);
	}
	
	@Test
	public void testSaveEntity()
	{
		grundmarginalparser.saveEntity();
	}
	
	


}
