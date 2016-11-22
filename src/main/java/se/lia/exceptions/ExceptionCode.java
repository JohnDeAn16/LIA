package se.lia.exceptions;

public enum ExceptionCode 
{
	PARSER_ERROR(1, "Fel vid parsning av fil"),
	VALIDATION_ERROR(2, "Fel vid validering");
	
	private final int id;
	private final String msg;
	
	private ExceptionCode(int id, String msg)
	{
		this.id = id;
		this.msg = msg;
	}

	public int getId() 
	{
		return id;
	}

	public String getMsg() 
	{
		return msg;
	}

	
	
}
