package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lia.model.GrundOchMarginalEntity;


public class GrundOchMarginalParserTest 
{
	private GrundMarginalParser grundmarginalparser;
	private File xml;
	private double[] testDouble;
	
	@Before
	public void setup()
	{
		testDouble = new double[] {1.1};
		xml = new File("XMLUnderlag/GrundOchMarginal.xml");
		grundmarginalparser = new GrundMarginalParser();
	}
	
	@Test
	public void testEntity()
	{
		GrundOchMarginalEntity e = grundmarginalparser.makeEntity(xml);
		Assert.assertEquals(2001, e.getFastighetsTaxeringsAr());
		Assert.assertArrayEquals(testDouble, e.getNivaFaktorUndreGrans(), 0.01);
	}
	
	@Test
	public void testReadFile()
	{
		Assert.assertNotNull(grundmarginalparser.readFileToString(xml));
	}
	
	


}
