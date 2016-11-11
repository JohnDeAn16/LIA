package se.lia.template;

import java.io.File;

public class LiaTemplate {

	public static void main(String[] args) 
	{
		EntityBuilder e = new EntityBuilder();
		e.buildEntity(new File("XMLUnderlag/Doc.xml"));
	}
}
