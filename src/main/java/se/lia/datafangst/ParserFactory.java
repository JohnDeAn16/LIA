package se.lia.datafangst;

import java.io.File;

import org.apache.xmlbeans.XmlObject;

import se.lia.exceptions.DataImportException;

public class ParserFactory 
{
	public static Parser getParser(File f) throws DataImportException 
	{
		XmlObject x = Parser.getValidXmlObject(f);

		FileType t = TypeParser.getFileType(x);

		switch (t) 
		{
		case GRUNDOCHMARGINAL:
			return new GrundMarginalParser(x);
		case ALDERSINVERKAN:
			return new AldersInverkanParser(x);
		default:
			return null;
		}
	}

}
