package se.lia.template;


public class ParserFactory 
{
	public static Parser getParser(FileType t)
	{
		switch(t)
		{
		case GRUNDOCHMARGINAL:
			return new GrundMarginalParser();
		case ALDERSINVERKAN:
			return new AldersInverkanParser();
		default:
			return null;
		}
		
	}

}
