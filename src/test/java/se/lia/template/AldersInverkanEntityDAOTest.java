package se.lia.template;


import java.io.File;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import se.lia.datafangst.AldersInverkanParser;
import se.lia.datafangst.ParserFactory;
import se.lia.model.AldersInverkanEntity;
import se.lia.persistence.AldersInverkanEntityDAO;
import se.lia.persistence.DBManager;

public class AldersInverkanEntityDAOTest {

	private AldersInverkanEntityDAO dao;
	private AldersInverkanEntity e;
	AldersInverkanParser p;
	
	@Before
	public void setUp() throws Exception 
	{
		dao = AldersInverkanEntityDAO.getInstance();
		p = (AldersInverkanParser)ParserFactory.getParser(new File("XMLUnderlag/AldersInverkan.xml"));
		e = p.makeEntity();
		
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM AldersInverkanEntity e").executeUpdate();
		em.getTransaction().commit();
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
		AldersInverkanEntity eM = dao.getById(e.getId());
		Assert.assertEquals(2002, eM.getFastighetsTaxeringsAr());
	}
	
	@Test
	public void testRead()
	{
		dao.save(e);
		AldersInverkanEntity eR = dao.getById(e.getId());
		Assert.assertEquals(e.getFastighetsTaxeringsAr(), eR.getFastighetsTaxeringsAr());
		Assert.assertEquals(e.getReduktionsFaktor(), eR.getReduktionsFaktor());
		Assert.assertArrayEquals(e.getAldersInverkanProcent(), eR.getAldersInverkanProcent());
		Assert.assertArrayEquals(e.getStandardPoangOvreGrans(), eR.getStandardPoangOvreGrans());
		Assert.assertArrayEquals(e.getStandardPoangUndreGrans(), eR.getStandardPoangUndreGrans());
		Assert.assertArrayEquals(e.getVardeArOvreGrans(), eR.getVardeArOvreGrans());
		Assert.assertArrayEquals(e.getVardeArUndreGrans(), eR.getVardeArUndreGrans());
		Assert.assertEquals(e.toString(), eR.toString());
	}



}
