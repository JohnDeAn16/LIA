package se.lia.template;

import java.io.File;

import org.apache.xmlbeans.XmlException;
import dataImport.FormularDocument;
import dataImport.GrundOchMarginalType;

import se.lia.model.GrundOchMarginalEntity;
import se.lia.persistence.GrundOchMarginalEntityDAO;



public class GrundMarginalParser extends Parser
{
	GrundOchMarginalEntityDAO dao;
	
	public GrundMarginalParser()
	{
		dao = GrundOchMarginalEntityDAO.getInstance();
	}
	
	/**
	 * Skapar och sparar entiteter
	 * @param xml Fil med GrundOchMarginal objekt
	 */
	public void parse(File f)
	{
		GrundOchMarginalEntity e = null;
		if(validate(f))
		{
			e = makeEntity(f);
		}
		if(e != null)
		{
			dao.save(e);
		}
	}
	
	private GrundOchMarginalType parseFile(File xml)
	{
		GrundOchMarginalType gmDoc = null;
		String s = readFileToString(xml);
		try
		{
			gmDoc = FormularDocument.Factory.parse(s).getFormular().getGrundOchMarginal();
		}
		catch(XmlException e)
		{
			e.printStackTrace();
		}
		return gmDoc;
	}
	
	
	/**
	 * Parsar en xml-fil med GrundOchMarginal objekt och returnerar
	 * en Entity om filen är valid, returnerar annars null
	 * 
	 * @param xml Xml-fil som innehåller 1 GrundOchMarginal Objekt
	 * @return 	  Ett GrundOchMarginalEntity Objekt
	 */
	public GrundOchMarginalEntity makeEntity(File xml)
	{
		GrundOchMarginalEntity e = null;
		GrundOchMarginalType gm = null;
		gm = this.parseFile(xml);
		if(gm != null)
		{
			e = new GrundOchMarginalEntity();
			
			double[] nfug = new double[gm.getNivaFaktorArray().length];
			double[] nfog = new double[gm.getNivaFaktorArray().length];
			
			for(int i = 0; i < nfug.length; i++)				
			{
				nfug[i] = gm.getNivaFaktorArray(i).xgetUndreGrans().getBigDecimalValue().doubleValue();
				nfog[i] = gm.getNivaFaktorArray(i).xgetOvreGrans().getBigDecimalValue().doubleValue();
			}
			
			int[] spug = new int[gm.getStandardPoangArray().length];
			int[] spog = new int[gm.getStandardPoangArray().length];
			
			for(int i = 0; i < spug.length; i++)
			{
				spug[i] = gm.getStandardPoangArray(i).xgetUndreGrans().getIntValue();
				spog[i] = gm.getStandardPoangArray(i).xgetOvreGrans().getIntValue();
			}
			
			int[] vyug = new int[gm.getVardeYtaArray().length];
			int[] vyog = new int[gm.getVardeYtaArray().length];
			
			for(int i = 0; i < vyug.length; i++)
			{
				vyug[i] = gm.getVardeYtaArray(i).xgetUndreGrans().getIntValue();
				vyog[i] = gm.getVardeYtaArray(i).xgetOvreGrans().getIntValue();
			}
			
			e.setFastighetsTaxeringsAr(gm.xgetFastighetsTaxeringsAr().getIntValue());
			e.setNivaFaktorUndreGrans(nfug);
			e.setNivaFaktorOvreGrans(nfog);
			e.setStandardPoangUndreGrans(spug);
			e.setStandardPoangOvreGrans(spog);
			e.setVardeYtaUndreGrans(vyug);
			e.setVardeYtaOvreGrans(vyog);
			e.setGrundVarde(gm.getVarde().xgetGrundVarde().getIntValue());
			e.setMarginalVarde(gm.getVarde().xgetMarginalVarde().getIntValue());
		}
		return e;
	}
	

}
