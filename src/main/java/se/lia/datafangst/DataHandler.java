package se.lia.datafangst;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import se.lia.exceptions.DataImportException;
import se.lia.exceptions.ExceptionCode;
import se.lia.exceptions.ReturnValue;

public class DataHandler 
{
	/**
	 * Tar xml-filer, parsar dessa till entiteter,
	 * och sparar dem i databasen.
	 * 
	 * @param dirName Namn på directory som innehåller filer
	 * @throws DataImportException 
	 */
	public ReturnValue parseAndSaveFiles(String dirName) throws DataImportException
	{
		File dir = new File(dirName);
		ReturnValue r = new ReturnValue();
		if(!dir.isDirectory())
		{
			throw new DataImportException(ExceptionCode.INVALID_DIRECTORY, dirName);
		}
		
		int success = 0;
		int fail = 0;
		
		ArrayList<File> xml = FileLoader.getFiles(dir);
		for(File f: xml)
		{
			Parser p;
			try 
			{
				p = ParserFactory.getParser(f);
				p.saveEntity();
				success++;
				r.addSuccesFile(f.getName());
			} 
			catch (DataImportException e) 
			{
				Logger.getLogger("se.lia.datafangst").log(Level.INFO, "Exception", e);
				fail++;
				r.addFailFile(f.getName());
			}
		}
		r.setSuccessNr(success);
		r.setFailNr(fail);
		return r;
	}

}
