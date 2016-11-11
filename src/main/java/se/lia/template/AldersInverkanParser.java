package se.lia.template;

import java.io.File;
import java.util.ArrayList;

import org.apache.xmlbeans.XmlException;
import org.example.underlag.AldersinverkanRootDocument;
import org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot;

import se.lia.model.AldersInverkanEntity;
import se.lia.persistence.AldersInverkanEntityDAO;

public class AldersInverkanParser extends Parser
{
	File schema;
	AldersInverkanEntityDAO dao;
	
	public AldersInverkanParser()
	{
		this.schema = new File("schema/AldersInverkan.xsd");
		dao = AldersInverkanEntityDAO.getInstance();
	}
	
	public void parse(ArrayList<String> fileNames)
	{
		for(String s: fileNames)
		{
			File f = new File("XMLUnderlag/" + s);
			AldersInverkanEntity e = makeEntity(f);
			if(e != null)
			{
				dao.save(e);
			}
		}
	}
	
	private AldersinverkanRootDocument parseFile(File xml)
	{
		AldersinverkanRootDocument aiDoc = null;
		String s = readFileToString(xml);
		try
		{
			aiDoc = AldersinverkanRootDocument.Factory.parse(s);
		}
		catch(XmlException e)
		{
			e.printStackTrace();
		}
		return aiDoc;
	}
	
	public AldersInverkanEntity makeEntity(File xml)
	{
		AldersInverkanEntity e = null;
		AldersinverkanRootDocument aiDoc = null;
		if(validate(xml, schema))
		{
			aiDoc = this.parseFile(xml);
		}
		if(aiDoc != null)
		{
			AldersinverkanRoot ai = aiDoc.getAldersinverkanRoot();
			e = new AldersInverkanEntity();
			
			int[] aip = new int[ai.getAldersinverkanArray().length];
			
			for(int i = 0; i < aip.length; i++)
			{
				aip[i] = ai.getAldersinverkanArray(i).xgetProcent().getIntValue();
			}
			
			int[] vaug = new int[ai.getVardearArray().length];
			int[] vaog = new int[ai.getVardearArray().length];
			
			for(int i = 0; i < vaug.length; i++)
			{
				vaug[i] = ai.getVardearArray(i).xgetUndregrans().getIntValue();
				vaog[i] = ai.getVardearArray(i).xgetOvregrans().getIntValue();
			}
			
			int[] spug = new int[ai.getStandardpoangArray().length];
			int[] spog = new int[ai.getStandardpoangArray().length];
			
			for(int i = 0; i < spug.length; i++)
			{
				spug[i] = ai.getStandardpoangArray(i).xgetUndregrans().getIntValue();
				spog[i] = ai.getStandardpoangArray(i).xgetOvregrans().getIntValue();
			}
			
			e.setFastighetsTaxeringsAr(ai.xgetFastighetstaxeringsar().getIntValue());
			e.setAldersInverkanProcent(aip);
			e.setVardeArUndreGrans(vaug);
			e.setVardeArOvreGrans(vaog);
			e.setStandardPoangUndreGrans(spug);
			e.setStandardPoangOvreGrans(spog);
			e.setReduktionsFaktor(ai.getReduktionsfaktor().getFaktor().longValue());
		}
		
		
		return e;
	}

}
