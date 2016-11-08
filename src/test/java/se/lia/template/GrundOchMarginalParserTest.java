package se.lia.template;


import java.io.File;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import se.lia.model.GrundOchMarginalEntity;
import se.lia.persistence.DBManager;

public class GrundOchMarginalParserTest 
{
	/*private GrundMarginalParser grundmarginalparser;
	
	@Before
	public void setup()
	{
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM PrimitiveGrundOchMarginalEntity e").executeUpdate();
		em.getTransaction().commit();
		grundmarginalparser = new GrundMarginalParser();
	}
	
	@Test
	public void testValidation()
	{
		GrundOchMarginalEntity[] iEntity, vEntity;
		iEntity = grundmarginalparser.makeEntity(new File("XMLUnderlag/GrundMarginalInvalid.xml"));
		vEntity = grundmarginalparser.makeEntity(new File("XMLUnderlag/GrundMarginal.xml"));
		
		Assert.assertTrue(iEntity == null);
		Assert.assertTrue(vEntity != null);
	}
	
	@Test
	public void testPrimitiveEntity()
	{
		GrundOchMarginalEntity[] e = grundmarginalparser.makeEntity(new File("XMLUnderlag/GrundMarginal.xml"));
		PrimitiveGrundOchMarginalEntity p = grundmarginalparser.buildEntity(e[0]);
		
		Assert.assertEquals(e[0].getFta().getIntValue(), p.getFastighetsTaxeringsAr());
		Assert.assertEquals(e[0].getNf()[0].getUndreGrans().doubleValue(), p.getNivaFaktorUndreGrans()[0], 0.01);
		Assert.assertEquals(e[0].getId(), p.getId());
		Assert.assertEquals(e[0].getSp()[0].getOvreGrans(), p.getStandardPoangOvreGrans()[0]);
	}*/


}
