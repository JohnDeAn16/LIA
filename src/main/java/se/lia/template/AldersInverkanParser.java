package se.lia.template;

import java.io.File;

import org.apache.xmlbeans.XmlException;

import dataImport.AldersInverkanType;
import dataImport.FormularDocument;
import se.lia.model.AldersInverkanEntity;
import se.lia.persistence.AldersInverkanEntityDAO;

public class AldersInverkanParser extends Parser
{
	AldersInverkanEntityDAO dao;
	
	
	public AldersInverkanParser()
	{
		dao = AldersInverkanEntityDAO.getInstance();
	}
	
	public void parse(File f)
	{
		AldersInverkanEntity e = null;
		if(validate(f))
		{
			e = makeEntity(f);
		}
		if(e != null)
		{
			dao.save(e);
		}
	}
	
	private AldersInverkanType parseFile(File xml)
	{
		AldersInverkanType aiDoc = null;
		String s = readFileToString(xml);
		try
		{
			aiDoc = FormularDocument.Factory.parse(s).getFormular().getAldersInverkan();
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
		AldersInverkanType ai = null;
		ai = this.parseFile(xml);
		if(ai != null)
		{
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
