package se.lia.persistence;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import se.lia.model.GrundOchMarginalEntity;

public class GrundOchMarginalEntityDAO 
{
	private static GrundOchMarginalEntityDAO instance;
	private EntityManager em;
	
	private GrundOchMarginalEntityDAO()
	{
		super();
		this.em = DBManager.getEntityManager();
	}
	
	public synchronized static GrundOchMarginalEntityDAO getInstance()
	{
		if(instance == null)
		{
			instance = new GrundOchMarginalEntityDAO();
		}
		return instance;
	}
	
	public GrundOchMarginalEntity getById(Long id)
	{
		Query q = em.createQuery("SELECT t FROM GrundOchMarginalEntity t WHERE t.id = :id");
		q.setParameter("id", id);
		return (GrundOchMarginalEntity) q.getSingleResult();
	}
	
	public GrundOchMarginalEntity save(GrundOchMarginalEntity e)
	{
		em.getTransaction().begin();
		if(e.getId() != null)
		{
			em.merge(e);
		}
		else
		{
			em.persist(e);
		}
		em.getTransaction().commit();
		return e;
	}
}
