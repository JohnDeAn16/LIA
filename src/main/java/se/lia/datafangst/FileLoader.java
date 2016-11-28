package se.lia.datafangst;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileLoader 
{
	public static ArrayList<File> getFiles(File dir)
	{
		ArrayList<File> files = new ArrayList<File>(Arrays.asList(dir.listFiles()));
		return files;
	}
}
