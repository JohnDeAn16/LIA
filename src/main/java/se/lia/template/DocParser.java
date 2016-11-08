package se.lia.template;

import java.io.File;
import java.util.ArrayList;

import org.apache.xmlbeans.XmlException;
import org.example.metaSchema.*;
import org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag;
import org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil;

public class DocParser extends ParserFactory
{
	private ForberedelseUnderlagDocument f;
	private File schema;
	
	/**
	 * Initialiserar klassen med ett xmlbeans-objekt från xml fil
	 * @param xml Xml-fil med data om underlagets struktur
	 */
	public DocParser(File xml)
	{
		schema = new File("schema/DocSchema.xsd");
		parseFile(xml);
		
	}
	
	private void parseFile(File xml)
	{
		if(validate(xml, schema))
		{
			String s = readFileToString(xml);
			try 
			{
				f = ForberedelseUnderlagDocument.Factory.parse(s);
			} 
			catch (XmlException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Invalid schema/xml");
		}
	}
	
	/**
	 * Ger en arraylist med namn på alla filer av typen "type"
	 * @param type Den typ av filer funktionen skall hitta (GrundOchMarginal/Åldersinverkan)
	 * @return ArrayList&lt;String&gt; med filnamn till alla filer som matchar "type"
	 */
	
	public ArrayList<String> getTypeFileNames(String type)
	{
		ArrayList<String> fileNames = new ArrayList<String>();
		
		ForberedelseUnderlag fu = f.getForberedelseUnderlag();
		Fil[] files = fu.getFiler().getFilArray();
		
		for(int i = 0; i < files.length; i++)
		{
			if(files[i].getAmne().equalsIgnoreCase(type))
			{
				fileNames.add(files[i].getStringValue());
			}
		}
		return fileNames;
	}
}
