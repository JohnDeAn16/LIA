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
	private GrundOchMarginalEntity[] eArr;
	private GrundOchMarginalEntity e;
	
	@Before
	public void setup()
	{
		dao = GrundOchMarginalEntityDAO.getInstance();
		
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM GrundOchMarginalEntity e").executeUpdate();
		em.getTransaction().commit();
		
		GrundMarginalParser g = new GrundMarginalParser();
		eArr = g.makeEntity(new File("schema/GrundMarginal.xml"));
		e = eArr[0];
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
	
	@Test
	public void testValidation()
	{
		GrundMarginalParser gp = new GrundMarginalParser();
		
		GrundOchMarginalEntity[] iEntity, vEntity;
		iEntity = gp.makeEntity(new File("schema/GrundMarginalInvalid.xml"));
		vEntity = gp.makeEntity(new File("schema/GrundMarginal.xml"));
		
		Assert.assertTrue(iEntity == null);
		Assert.assertTrue(vEntity != null);
	}
	
	
	

}
