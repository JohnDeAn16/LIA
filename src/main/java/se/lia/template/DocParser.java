package se.lia.template;

import java.io.File;

import org.apache.xmlbeans.XmlException;

import dataImport.FormularDocument;
import dataImport.FormularDocument.Formular;




public class DocParser extends Parser
{
	private Formular m;
	
	public FileType getFileType(File xml)
	{
		parseFile(xml);
		return FileType.valueOf(m.getFilTyp().toString());
	}
	
	private void parseFile(File xml)
	{
		String s = readFileToString(xml);
		try
		{
			m = FormularDocument.Factory.parse(s).getFormular();
		}
		catch(XmlException e)
		{
			e.printStackTrace();
		}
	}
}
