package se.lia.template;

import java.io.File;
import java.util.ArrayList;

public class EntityBuilder 
{
	/**
	 * Tar xml-filer, parsar dessa till entiteter,
	 * och sparar dem i databasen.
	 * @param xml Xml-fil innehållande filnamn till underlags filer.
	 */
	public void buildEntity(ArrayList<File> xml)
	{
		DocParser docParser = new DocParser();
		
		for(File f: xml)
		{
			Parser p = ParserFactory.getParser(docParser.getFileType(f));
			p.parse(f);
		}
	}

}
