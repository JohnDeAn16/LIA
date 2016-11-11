package se.lia.template;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lia.model.GrundOchMarginalEntity;


public class GrundOchMarginalParserTest 
{
	private GrundMarginalParser grundmarginalparser;
	private File xml, xmlMulti, xmlInvalid, xsd;
	private double[] testDouble, testMultiDouble;
	
	@Before
	public void setup()
	{
		testDouble = new double[] {1.1};
		testMultiDouble = new double[] {2.2, 3.3};
		xml = new File("XMLUnderlag/GrundMarginal.xml");
		xmlMulti = new File("XMLUnderlag/GrundMarginalMultiValues.xml");
		xsd = new File("schema/GrundMarginal.xsd");
		xmlInvalid = new File("XMLUnderlag/GrundMarginalInvalid");
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
	public void testMultiValueEntity()
	{
		GrundOchMarginalEntity e = grundmarginalparser.makeEntity(xmlMulti);
		Assert.assertEquals(2002, e.getFastighetsTaxeringsAr());
		Assert.assertArrayEquals(testMultiDouble, e.getNivaFaktorUndreGrans(), 0.01);
		Assert.assertEquals(4000, e.getGrundVarde());
	}
	
	@Test
	public void testValidate()
	{
		Assert.assertTrue(grundmarginalparser.validate(xml, xsd));
		Assert.assertFalse(grundmarginalparser.validate(xmlInvalid, xsd));
	}
	
	@Test
	public void testReadFile()
	{
		Assert.assertNotNull(grundmarginalparser.readFileToString(xml));
	}
	
	


}
