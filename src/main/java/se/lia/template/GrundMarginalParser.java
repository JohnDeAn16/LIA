package se.lia.template;

import java.io.File;
import org.apache.xmlbeans.XmlException;
import org.example.grundMarginal.GoMDocDocument;
import org.example.grundMarginal.GoMDocDocument.GoMDoc;
import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal;

import se.lia.model.GrundOchMarginalEntity;
import se.lia.model.PrimitiveGrundOchMarginalEntity;



public class GrundMarginalParser 
{
	GoMDocDocument gmDoc;
	File schema;
	
	public GrundMarginalParser()
	{
		this.schema = new File("schema/GrundMarginal.xsd");
	}
	
	private void parseFile(File xml)
	{
		String s = ParseTools.readFileToString(xml);
		try
		{
			gmDoc = GoMDocDocument.Factory.parse(s);
		}
		catch(XmlException e)
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Validerar och parsar en xml-fil med GrundOchMarginal objekt och returnerar
	 * en array med dessa objekt om xml fil är valid, returnerar annars null.
	 * 
	 * @param xml Xml-fil som innehåller 1..n GrundOchMarginal Objekt
	 * @return 	  En array av GrundOchMarginalEntity Objekt
	 */
	public GrundOchMarginalEntity[] makeEntity(File xml)
	{
		GrundOchMarginalEntity[] e = null;
		if(ParseTools.validate(xml, schema))
		{
			this.parseFile(xml);
		}
		if(gmDoc != null)
		{
			GoMDoc gom = gmDoc.getGoMDoc();
			//refaktorisera sen
			gmDoc = null;
			GrundOchMarginal[] gm = gom.getGrundOchMarginalArray();
			e = new GrundOchMarginalEntity[gm.length];
			
			for(int i = 0; i < gm.length; i++)
			{
				e[i] = new GrundOchMarginalEntity();
				e[i].setFta(gm[i].xgetFastighetsTaxeringsAr());
				e[i].setNf(gm[i].getNivaFaktorArray());
				e[i].setSp(gm[i].getStandardPoangArray());
				e[i].setVy(gm[i].getVardeYtaArray());
				e[i].setV(gm[i].getVarde());
			}
		}
		return e;
	}
	
	//Endast för att testa, skrota senare
	public PrimitiveGrundOchMarginalEntity buildEntity(GrundOchMarginalEntity e)
	{
		PrimitiveGrundOchMarginalEntity p = new PrimitiveGrundOchMarginalEntity();
		
		double[] nfug = new double[e.getNf().length];
		double[] nfog = new double[e.getNf().length];
		
		for(int i = 0; i < e.getNf().length; i++)
		{
			nfug[i] = e.getNf()[i].xgetUndreGrans().getBigDecimalValue().doubleValue();
			nfog[i] = e.getNf()[i].xgetOvreGrans().getBigDecimalValue().doubleValue();
		}
		
		int[] spug = new int[e.getSp().length];
		int[] spog = new int[e.getSp().length];
		
		for(int i = 0; i < e.getSp().length; i++)
		{
			spug[i] = e.getSp()[i].getUndreGrans();
			spog[i] = e.getSp()[i].getOvreGrans();
		}
		
		int[] vyug = new int[e.getVy().length];
		int[] vyog = new int[e.getVy().length];
		
		for(int i = 0; i < e.getVy().length; i++)
		{
			vyug[i] = e.getVy()[i].getUndreGrans();
			vyog[i] = e.getVy()[i].getOvreGrans();
		}
		
		p.setFastighetsTaxeringsAr(e.getFta().getIntValue());
		p.setNivaFaktorUndreGrans(nfug);
		p.setNivaFaktorOvreGrans(nfog);
		p.setStandardPoangUndreGrans(spug);
		p.setStandardPoangOvreGrans(spog);
		p.setVardeYtaUndreGrans(vyug);
		p.setVardeYtaOvreGrans(vyog);
		p.setGrundVarde(e.getV().getGrundVarde());
		p.setMarginalVarde(e.getV().getMarginalVarde());
		
		return p;
	}

}
