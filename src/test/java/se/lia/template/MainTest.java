package se.lia.template;


import org.junit.Before;
import org.junit.Test;

import se.lia.datafangst.DataFangst;

public class MainTest {

	String[] args = new String[2];
	@Before
	public void setUp() throws Exception 
	{
		args[0] = "Invalid";
		args[1] = "XMLUnderlag";
	}
	
	@Test
	public void testMain()
	{
		DataFangst.main(args);
	}



}
