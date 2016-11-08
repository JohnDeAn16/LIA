package se.lia.template;

import java.io.File;
import org.apache.xmlbeans.XmlException;
import org.example.grundMarginal.GoMDocDocument;
import org.example.grundMarginal.GoMDocDocument.GoMDoc;
import org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal;

import se.lia.model.GrundOchMarginalEntity;
import se.lia.persistence.GrundOchMarginalEntityDAO;



public class GrundMarginalParser extends ParserFactory
{
	File schema;
	GrundOchMarginalEntityDAO dao;
	
	public GrundMarginalParser()
	{
		this.schema = new File("schema/GrundMarginal.xsd");
		dao = GrundOchMarginalEntityDAO.getInstance();
	}
	
	public void buildEntity(File xml)
	{
		GrundOchMarginalEntity e = makeEntity(xml);
		dao.save(e);
		
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
	 * en array med dessa objekt om xml fil är valid, returnerar annars null.
	 * 
	 * @param xml Xml-fil som innehåller 1..n GrundOchMarginal Objekt
	 * @return 	  En array av GrundOchMarginalEntity Objekt
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
			gmDoc = null;
			GrundOchMarginal gm = gom.getGrundOchMarginal();
			e = new GrundOchMarginalEntity();
			
			long[] nfug = new long[gm.getNivaFaktorArray().length];
			long[] nfog = new long[gm.getNivaFaktorArray().length];
			
			for(int i = 0; i < nfug.length; i++)				
			{
				nfug[i] = gm.getNivaFaktorArray(i).xgetUndreGrans().getBigDecimalValue().longValue();
				nfog[i] = gm.getNivaFaktorArray(i).xgetOvreGrans().getBigDecimalValue().longValue();
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
