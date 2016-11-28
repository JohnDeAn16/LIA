package se.lia.exceptions;

public class DataImportException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private int errorCode;
	private ExceptionCode c;
	
	public DataImportException(ExceptionCode c, String message)
	{
		this.message = message;
		this.errorCode = c.getId();
		this.c = c;
	}

	
	@Override
	public String getMessage()
	{
		String err = c.toString() + ": " + c.getMsg() + ": " + message;
		return err;
	}
	
	public int getErrorCode()
	{
		return this.errorCode;
	}
	
	

}
