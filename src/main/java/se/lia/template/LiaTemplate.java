package se.lia.template;

import java.io.File;
import java.util.ArrayList;

public class LiaTemplate {

	public static void main(String[] args) 
	{
		ArrayList<File> f = new ArrayList<File>();
		f.add(new File("XMLUnderlag/GrundOchMarginal.xml"));
		f.add(new File("XMLUnderlag/AldersInverkan.xml"));
		f.add(new File("XMLUnderlag/GrundOchMarginalMulti.xml"));
		f.add(new File("XMLUnderlag/GrundOchMarginalInvalid.xml"));
		EntityBuilder e = new EntityBuilder();
	
		e.buildEntity(f);
	}
}
