package se.lia.template;

import java.io.File;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import se.lia.persistence.DBManager;
import se.lia.persistence.GrundOchMarginalEntityDAO;
import se.lia.model.GrundMarginalParser;
import se.lia.model.GrundOchMarginalEntity;

public class GrundOchMarginalEntityDAOTest 
{
	private GrundOchMarginalEntityDAO dao;
	private GrundOchMarginalEntity e;
	
	@Before
	public void setup()
	{
		dao = GrundOchMarginalEntityDAO.getInstance();
		
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM GrundOchMarginalEntity e").executeUpdate();
		em.getTransaction().commit();
		
		GrundMarginalParser g = new GrundMarginalParser(new File("schema/GrundMarginal.xml"));
		e = g.makeEntity();
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
		Assert.assertArrayEquals(e.getNf(), ent.getNf());
		Assert.assertEquals("2001", ent.getFta().getStringValue());
	}
	

}
