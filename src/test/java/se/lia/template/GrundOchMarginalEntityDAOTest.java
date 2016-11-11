package se.lia.template;

import java.io.File;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import se.lia.persistence.DBManager;
import se.lia.persistence.GrundOchMarginalEntityDAO;
import se.lia.model.GrundOchMarginalEntity;

public class GrundOchMarginalEntityDAOTest 
{
	private GrundOchMarginalEntityDAO dao;
	private GrundOchMarginalEntity e;
	private GrundOchMarginalEntity eMulti;
	private double[] testMultiDouble;
	
	@Before
	public void setup()
	{
		dao = GrundOchMarginalEntityDAO.getInstance();
		
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM GrundOchMarginalEntity e").executeUpdate();
		em.getTransaction().commit();
		
		GrundMarginalParser g = new GrundMarginalParser();
		e = g.makeEntity(new File("XMLUnderlag/GrundMarginal.xml"));
		eMulti = g.makeEntity(new File("XMLUnderlag/GrundMarginalMultiValues.xml"));
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
