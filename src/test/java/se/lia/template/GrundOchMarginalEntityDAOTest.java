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
import se.lia.exceptions.DataFangstException;
import se.lia.model.GrundOchMarginalEntity;

public class GrundOchMarginalEntityDAOTest 
{
	private GrundOchMarginalEntityDAO dao;
	private GrundOchMarginalEntity e;
	private GrundOchMarginalEntity eMulti;
	GrundMarginalParser g;
	private double[] testMultiDouble;
	
	@Before
	public void setup() throws DataFangstException
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
		Assert.assertTrue(e.getId() != null);
	}
	
	@Test
	public void testRead()
	{
		dao.save(e);
		GrundOchMarginalEntity ent = dao.getById(e.getId());
		Assert.assertTrue(ent != null);
		Assert.assertArrayEquals(e.getStandardPoangOvreGrans(), ent.getStandardPoangOvreGrans());
		Assert.assertEquals(2001, ent.getFastighetsTaxeringsAr());
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
