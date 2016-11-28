package se.lia.datafangst;

import java.util.logging.Level;
import java.util.logging.Logger;

import se.lia.exceptions.DataImportException;
import se.lia.exceptions.ReturnValue;

public class DataFangst {

	public static void main(String[] args) 
	{
		DataHandler dh = new DataHandler();
	
		for (String s : args) 
		{
			try 
			{
				ReturnValue r = dh.parseAndSaveFiles(s);
				System.out.println(r.toString());
			} 
			catch (DataImportException e) 
			{
				Logger.getLogger("se.lia.datafangst").log(Level.SEVERE, "Exception", e);
			}
		}

	}
}
