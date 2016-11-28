package se.lia.datafangst;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlValidationError;

import se.lia.exceptions.DataImportException;
import se.lia.exceptions.ExceptionCode;

public abstract class Parser
{
	
	/**
	 * Validerar och returnerar ett xml object från fil
	 * @param f File med xml data
	 * @return x XmlObject 
	 * @throws DataImportException
	 */
	public static XmlObject getValidXmlObject(File f) throws DataImportException
	{
		XmlObject x = null;
	
		try 
		{
			x = XmlObject.Factory.parse(f);
			if(!validate(x))
			{
				x = null;
			}
		} 
		catch (XmlException | IOException e) 
		{
			throw new DataImportException(ExceptionCode.PARSER_ERROR, f.getName());
		}
		return x;
	}
	
	/**
	 * Validerar xml fil mot schema
	 * @param x Xml objekt som skall valideras
	 * @return Returnerar sant om filerna validerar, annars falskt
	 * @throws DataImportException 
	 */
	public static boolean validate(XmlObject x) throws DataImportException
	{
		boolean valid = true;
		XmlOptions opts = new XmlOptions();
		ArrayList<XmlValidationError> valErrors = new ArrayList<XmlValidationError>();
		opts.setErrorListener(valErrors);
		
		if(!x.validate(opts))
		{
			valid = false;
			throw new DataImportException(ExceptionCode.VALIDATION_ERROR, valErrors.toString());
			
		}
		return valid;
	}



	public abstract void saveEntity();


}
