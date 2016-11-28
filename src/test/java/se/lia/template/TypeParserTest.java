package se.lia.template;


import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.junit.Assert;

import junit.framework.TestCase;
import se.lia.datafangst.DataHandler;
import se.lia.datafangst.FileType;
import se.lia.datafangst.TypeParser;
import se.lia.exceptions.DataImportException;


public class TypeParserTest  extends TestCase
{

	XmlObject x;
	
	@Override
	public void setUp() throws XmlException, IOException
	{
		File f = new File("XMLUnderlag/GrundOchMarginal.xml");
		x = XmlObject.Factory.parse(f);
	}
	

	


	public void testGetFileType()
	{
		Assert.assertEquals(FileType.GRUNDOCHMARGINAL, TypeParser.getFileType(x));
	}
	public void testLia() throws DataImportException{
		DataHandler dh = new DataHandler();
		dh.parseAndSaveFiles("XMLUnderlag");
	}


}
