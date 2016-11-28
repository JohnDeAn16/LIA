package se.lia.template;

import java.io.File;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import se.lia.persistence.DBManager;
import se.lia.persistence.GrundOchMarginalEntityDAO;
import se.lia.datafangst.GrundMarginalParser;
import se.lia.datafangst.ParserFactory;
import se.lia.exceptions.DataImportException;
import se.lia.model.GrundOchMarginalEntity;

public class GrundOchMarginalEntityDAOTest 
{
	private GrundOchMarginalEntityDAO dao;
	private GrundOchMarginalEntity e;
	private GrundOchMarginalEntity eMulti;
	GrundMarginalParser g;
	private double[] testMultiDouble;
	
	@Before
	public void setup() throws DataImportException
	{
		dao = GrundOchMarginalEntityDAO.getInstance();
		
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM GrundOchMarginalEntity e").executeUpdate();
		em.getTransaction().commit();
		
		g = (GrundMarginalParser)ParserFactory.getParser(new File("XMLUnderlag/GrundOchMarginal.xml"));
		e = g.makeEntity();
		
		g = (GrundMarginalParser)ParserFactory.getParser(new File("XMLUnderlag/GrundOchMarginalMulti.xml"));
		eMulti = g.makeEntity();
		testMultiDouble = new double[] {2.2, 3.3};

	}
	
	
	@Test
	public void testSave()
	{
		dao.save(e);
		Assert.assertNotNull(e.getId());
	}
	
	@Test
	public void testMerge()
	{
		dao.save(e);
		
		e.setFastighetsTaxeringsAr(2002);
		dao.save(e);
		GrundOchMarginalEntity mE = dao.getById(e.getId());
		Assert.assertEquals(2002, mE.getFastighetsTaxeringsAr());
		
	}
	
	@Test
	public void testRead()
	{
		dao.save(e);
		GrundOchMarginalEntity ent = dao.getById(e.getId());
		Assert.assertNotNull(ent);
		Assert.assertArrayEquals(e.getStandardPoangOvreGrans(), ent.getStandardPoangOvreGrans());
		Assert.assertArrayEquals(e.getStandardPoangUndreGrans(), ent.getStandardPoangUndreGrans());
		Assert.assertArrayEquals(e.getNivaFaktorOvreGrans(), ent.getNivaFaktorOvreGrans(), 0.01);
		Assert.assertArrayEquals(e.getNivaFaktorUndreGrans(), ent.getNivaFaktorUndreGrans(), 0.01);
		Assert.assertArrayEquals(e.getVardeYtaOvreGrans(), ent.getVardeYtaOvreGrans());
		Assert.assertArrayEquals(e.getVardeYtaUndreGrans(), ent.getVardeYtaUndreGrans());
		Assert.assertEquals(e.getGrundVarde(), ent.getGrundVarde());
		Assert.assertEquals(e.getMarginalVarde(), ent.getMarginalVarde());
		Assert.assertEquals(e.getFastighetsTaxeringsAr(), ent.getFastighetsTaxeringsAr());
		Assert.assertEquals(e.toString(), ent.toString());
	}
	
	@Test
	public void testMultiValueEntity()
	{
		dao.save(eMulti);
		GrundOchMarginalEntity ent = dao.getById(eMulti.getId());
		Assert.assertNotNull(eMulti.getId());
		
		Assert.assertArrayEquals(testMultiDouble, ent.getNivaFaktorUndreGrans(), 0.01);
		Assert.assertEquals(2002, ent.getFastighetsTaxeringsAr());
		
	}
	
}
