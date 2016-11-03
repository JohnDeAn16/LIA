package se.lia.persistence;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import se.lia.model.PrimitiveGrundOchMarginalEntity;

public class PrimitiveGrundOchMarginalEntityDAO 
{
	private static PrimitiveGrundOchMarginalEntityDAO  instance;
	private EntityManager em;
	
	private PrimitiveGrundOchMarginalEntityDAO()
	{
		super();
		this.em = DBManager.getEntityManager();
	}
	
	public synchronized static PrimitiveGrundOchMarginalEntityDAO getInstance()
	{
		if(instance == null)
		{
			instance = new PrimitiveGrundOchMarginalEntityDAO();
		}
		return instance;
	}
	
	public PrimitiveGrundOchMarginalEntity getById(Long id)
	{
		Query q = em.createQuery("SELECT t FROM PrimitiveGrundOchMarginalEntity t WHERE t.id = :id");
		q.setParameter("id", id);
		return (PrimitiveGrundOchMarginalEntity) q.getSingleResult();
	}
	
	public PrimitiveGrundOchMarginalEntity save(PrimitiveGrundOchMarginalEntity e)
	{
		em.getTransaction().begin();
		if(e.getId() != null)
		{
			return em.merge(e);
		}
		else
		{
			em.persist(e);
		}
		em.getTransaction().commit();
		return e;
	}
	
	
}
