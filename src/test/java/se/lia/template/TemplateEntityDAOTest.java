package se.lia.template;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import se.lia.model.TemplateEntity;
import se.lia.persistence.DBManager;
import se.lia.persistence.TemplateEntityDAO;

public class TemplateEntityDAOTest {
	
	private TemplateEntityDAO dao;

	/**
	 * Truncate the table before testing
	 */
	@Before
	public void setUp(){
		dao = TemplateEntityDAO.getInstance();
		
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM TemplateEntity e").executeUpdate();
		em.getTransaction().commit();
		
	}
	
	@Test
	public void testSave(){
		
		TemplateEntity entity = new TemplateEntity();
		entity.setDescription("test");
		entity.setValue("value");
		dao.save(entity);
		Assert.assertTrue(entity.getId() != null);
		
	}
	
	@Test
	public void testRead(){
		TemplateEntity entity = new TemplateEntity();
		entity.setDescription("First test");
		entity.setValue("first value");
		dao.save(entity);
		
		TemplateEntity ent = dao.getById(entity.getId());
		Assert.assertTrue(ent != null);
		Assert.assertEquals(entity.getDescription(), ent.getDescription());
		Assert.assertEquals(entity.getValue(), ent.getValue());
	}

}
