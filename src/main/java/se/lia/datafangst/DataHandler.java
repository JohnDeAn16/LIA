package se.lia.datafangst;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import se.lia.exceptions.DataFangstException;

public class DataHandler 
{
	/**
	 * Tar xml-filer, parsar dessa till entiteter,
	 * och sparar dem i databasen.
	 * 
	 * @param dirName Namn på directory som innehåller filer
	 */
	public void parseAndSaveFiles(String dirName)
	{
		ArrayList<File> xml = FileLoader.getFiles(dirName);
		for(File f: xml)
		{
			Parser p;
			try 
			{
				p = ParserFactory.getParser(f);
				p.saveEntity();
			} 
			catch (DataFangstException e) 
			{
				Logger.getLogger("se.lia.datafangst").log(Level.INFO, e.getMessage(), e);
			}
		}
	}

}
