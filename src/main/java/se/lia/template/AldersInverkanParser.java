package se.lia.template;

import java.io.File;

import org.apache.xmlbeans.XmlException;
import org.example.underlag.AldersinverkanRootDocument;

public class AldersInverkanParser extends ParserFactory
{
	AldersinverkanRootDocument aiDoc;
	File schema;
	
	public AldersInverkanParser()
	{
		this.schema = new File("schema/AldersInverkan.xsd");
	}
	
	private void parseFile(File xml)
	{
		String s = readFileToString(xml);
		try
		{
			aiDoc = AldersinverkanRootDocument.Factory.parse(s);
		}
		catch(XmlException e)
		{
			e.printStackTrace();
		}
	}

}
