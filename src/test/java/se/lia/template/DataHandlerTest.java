package se.lia.template;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import se.lia.datafangst.DataHandler;
import se.lia.exceptions.DataImportException;
import se.lia.exceptions.ReturnValue;

public class DataHandlerTest
{
	DataHandler dh;

	@Before
	public void setUp() throws Exception 
	{
		dh = new DataHandler();
	}
	
	@Test
	public void testValidDirectory()
	{
		try
		{
			dh.parseAndSaveFiles("Invalid");
		}
		catch(DataImportException e)
		{
			Assert.assertEquals(3, e.getErrorCode());
		}
	}
	
	
	@Test
	public void testRunDataHandler()
	{
		try
		{
			ReturnValue r = dh.parseAndSaveFiles("XMLUnderlag");
			Assert.assertEquals(3, r.getSuccessNr());
			Assert.assertEquals(2, r.getFailNr());
			
		}
		catch(DataImportException e)
		{
			
		}
	}
	


}
