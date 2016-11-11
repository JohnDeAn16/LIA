package se.lia.template;


import org.junit.Assert;
import org.junit.Test;

public class ParserFactoryTest 
{
	@Test
	public void testGetFactory()
	{
		Parser parser = ParserFactory.getParser(FileType.ALDERSINVERKAN);
		Assert.assertTrue(parser instanceof AldersInverkanParser);
		Assert.assertFalse(parser instanceof GrundMarginalParser);
	}

}
