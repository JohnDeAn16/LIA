package se.lia.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class ParserFactory implements IParser 
{
	public void buildEntity(File xml)
	{
		DocParser docParser = new DocParser(xml);
		ArrayList<String> fileNames = null;
		
		for(FileType t: FileType.values())
		{
			switch(t)
			{
			case GRUNDOCHMARGINAL:
				fileNames = docParser.getTypeFileNames(t.name());
				GrundMarginalParser gmParser = new GrundMarginalParser();
				for(String s: fileNames)
				{
					gmParser.buildEntity(new File("XMLUnderlag/" + s));
				}
				break;
			case ALDERSINVERKAN:
				break;
			}
		}
	}
	
	/**
	 * Validerar xml fil mot schema
	 * @param xml Xml fil som skall valideras
	 * @param xsd Schema den skall valideras mot
	 * @return Returnerar sant om filerna validerar, annars falskt
	 */
	public static boolean validate(File xml, File xsd)
	{
		try 
		{
			FileInputStream fXsd = new FileInputStream(xsd);
			FileInputStream fXml = new FileInputStream(xml);
			
			SchemaFactory factory = 
					SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new StreamSource(fXsd));
			Validator v = schema.newValidator();
			v.validate(new StreamSource(fXml));
			return true;
		}
		catch (Exception e) 
		{
			return false;
		}
	}
	
	/**
	 * Läser in en fil och sparar den i en string
	 * @param xml Xml fil som skall läsas in
	 * @return Returnerar en string med filens innehåll
	 */
	public static String readFileToString(File xml)
	{
		String s = "";
		
		try 
		{
			InputStreamReader reader = new InputStreamReader(new FileInputStream(xml));
			BufferedReader r = new BufferedReader(reader);
			String str;
			
			while((str = r.readLine()) != null)
			{
				s += str;
			}
			r.close();
			s.trim();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return s;
	}

}
