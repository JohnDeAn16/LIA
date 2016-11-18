package se.lia.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlValidationError;

public abstract class Parser
{
	
	
	/**
	 * Validerar xml fil mot schema
	 * @param f Xml fil som skall valideras
	 * @return Returnerar sant om filerna validerar, annars falskt
	 */
	public boolean validate(File f)
	{
		boolean valid = true;
		XmlOptions opts = new XmlOptions();
		ArrayList<XmlValidationError> valErrors = new ArrayList<XmlValidationError>();
		opts.setErrorListener(valErrors);
		
		try 
		{
			XmlObject x = XmlObject.Factory.parse(f);
			if(!x.validate(opts))
			{
				valid = false;
				System.out.println(valErrors);
			}
		} 
		catch (XmlException | IOException e) 
		{
			e.printStackTrace();
		}
		return valid;
	}
	/*public boolean validate(File xml, File xsd)
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
	}*/
	
	/**
	 * Läser in en fil och sparar den i en string
	 * @param xml Xml fil som skall läsas in
	 * @return Returnerar en string med filens innehåll
	 */
	public String readFileToString(File xml)
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


	public void parse(File f) 
	{
		// TODO Auto-generated method stub
		
	}


}
