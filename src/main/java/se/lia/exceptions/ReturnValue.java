package se.lia.exceptions;

import java.util.ArrayList;

public class ReturnValue 
{
	int successNr, failNr;
	ArrayList<String> sFiles, fFiles;
	
	public ReturnValue()
	{
		sFiles = new ArrayList<String>();
		fFiles = new ArrayList<String>();
		this.successNr = 0;
		this.failNr = 0;
	}

	public int getSuccessNr() {
		return successNr;
	}

	public void setSuccessNr(int successNr) {
		this.successNr = successNr;
	}

	public int getFailNr() {
		return failNr;
	}

	public void setFailNr(int failNr) {
		this.failNr = failNr;
	}
	
	public void addSuccesFile(String name)
	{
		this.sFiles.add(name);
	}
	public void addFailFile(String name)
	{
		this.fFiles.add(name);
	}
	
	public String toString()
	{
		return this.successNr + " filer parsade: " + this.sFiles.toString() + "\n"
				+ this.failNr + " filer misslyckade: " + this.fFiles.toString(); 
	}
}
