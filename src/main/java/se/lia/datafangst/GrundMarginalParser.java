package se.lia.datafangst;

import org.apache.xmlbeans.XmlObject;

import dataImport.FormularDocument;
import dataImport.GrundOchMarginalType;

import se.lia.model.GrundOchMarginalEntity;
import se.lia.persistence.GrundOchMarginalEntityDAO;



public class GrundMarginalParser extends Parser
{
	GrundOchMarginalEntityDAO dao;
	XmlObject x;
	
	public GrundMarginalParser(XmlObject x)
	{
		dao = GrundOchMarginalEntityDAO.getInstance();
		this.x = x;
	}
	
	/**
	 * Skapar och sparar entiteter
	 * @param xml Fil med GrundOchMarginal objekt
	 */
	public void saveEntity()
	{
		GrundOchMarginalEntity e = null;
		if(x != null)
		{
			e = makeEntity();
			dao.save(e);
		}
	}
	
	
	public GrundOchMarginalEntity makeEntity()
	{
		GrundOchMarginalEntity e = null;
		GrundOchMarginalType gm = null;
		FormularDocument f = (FormularDocument) x;
		gm = f.getFormular().getGrundOchMarginal();
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
