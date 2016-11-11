package se.lia.template;

import java.io.File;
import java.util.ArrayList;

public class EntityBuilder 
{
	/**
	 * Tar xml-fil som pekar ut filnamn till underlag och parsar dessa till entiteter
	 * och sparar dem i databasen.
	 * @param xml Xml-fil innehållande filnamn till underlags filer.
	 */
	public void buildEntity(File xml)
	{
		DocParser docParser = new DocParser(xml);
		ArrayList<String> fileNames = null;
		
		for(FileType t: FileType.values())
		{
			fileNames = docParser.getTypeFileNames(t.name());
			Parser parser = ParserFactory.getParser(t);
			parser.parse(fileNames);
		}
	}

}
