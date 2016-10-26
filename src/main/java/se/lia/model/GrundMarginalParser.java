package se.lia.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.persistence.EntityManager;
import org.apache.xmlbeans.*;
import org.example.grundMarginal.GrundOchMarginalDocument;
import org.example.grundMarginal.GrundOchMarginalDocument.GrundOchMarginal;

import se.lia.persistence.DBManager;



public class GrundMarginalParser 
{
	EntityManager em;
	GrundOchMarginalDocument gmDoc;
	
	public GrundMarginalParser(File xml)
	{
		em = DBManager.getEntityManager();
		this.parseFile(xml);
	}
	
	private void parseFile(File xml)
	{
		try 
		{
			InputStreamReader reader = new InputStreamReader(new FileInputStream(xml));
			BufferedReader r = new BufferedReader(reader);
			String s = "";
			String str;
			
			while((str = r.readLine()) != null)
			{
				s += str;
			}
			r.close();
			s.trim();
			gmDoc = GrundOchMarginalDocument.Factory.parse(s);
		}
		catch (XmlException | IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public GrundOchMarginalEntity makeEntity()
	{
		GrundOchMarginal gm = gmDoc.getGrundOchMarginal();
		GrundOchMarginalEntity e = new GrundOchMarginalEntity();
		
		e.setFta(gm.xgetFastighetsTaxeringsAr());
		e.setNf(gm.getNivaFaktorArray());
		e.setSp(gm.getStandardPoangArray());
		e.setVy(gm.getVardeYtaArray());
		e.setV(gm.getVarde());
		
		return e;
	}

}
