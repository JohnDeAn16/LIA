package se.lia.template;

import java.io.File;
import java.util.ArrayList;

import org.apache.xmlbeans.XmlException;
import org.example.grundMarginal.GoMDocDocument;
import org.example.grundMarginal.GoMDocDocument.GoMDoc;
import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal;

import se.lia.model.GrundOchMarginalEntity;
import se.lia.persistence.GrundOchMarginalEntityDAO;



public class GrundMarginalParser extends Parser
{
	File schema;
	GrundOchMarginalEntityDAO dao;
	
	public GrundMarginalParser()
	{
		this.schema = new File("schema/GrundMarginal.xsd");
		dao = GrundOchMarginalEntityDAO.getInstance();
	}
	
	/**
	 * Skapar och sparar entiteter
	 * @param xml Filnamn till alla filer  med GrundOchMarginal objekt
	 */
	public void parse(ArrayList<String> fileNames)
	{
		for(String s: fileNames)
		{
			File f = new File("XMLUnderlag/" + s);
			GrundOchMarginalEntity e = makeEntity(f);
			if(e != null)
			{
				dao.save(e);
			}
		}
	}
	
	private GoMDocDocument parseFile(File xml)
	{
		GoMDocDocument gmDoc = null;
		String s = readFileToString(xml);
		try
		{
			gmDoc = GoMDocDocument.Factory.parse(s);
		}
		catch(XmlException e)
		{
			e.printStackTrace();
		}
		return gmDoc;
	}
	
	
	/**
	 * Validerar och parsar en xml-fil med GrundOchMarginal objekt och returnerar
	 * en Entity om filen är valid, returnerar annars null
	 * 
	 * @param xml Xml-fil som innehåller 1 GrundOchMarginal Objekt
	 * @return 	  Ett GrundOchMarginalEntity Objekt
	 */
	public GrundOchMarginalEntity makeEntity(File xml)
	{
		GrundOchMarginalEntity e = null;
		GoMDocDocument gmDoc = null;
		if(validate(xml, schema))
		{
			gmDoc = this.parseFile(xml);
		}
		if(gmDoc != null)
		{
			GoMDoc gom = gmDoc.getGoMDoc();
			GrundOchMarginal gm = gom.getGrundOchMarginal();
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
