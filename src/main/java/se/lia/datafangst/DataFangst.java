package se.lia.datafangst;


public class DataFangst {

	public static void main(String[] args) 
	{
		DataHandler e = new DataHandler();
	
		e.parseAndSaveFiles("XMLUnderlag");
		System.out.println("Reached end of program");
	}
}
