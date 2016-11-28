package se.lia.persistence;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import se.lia.model.AldersInverkanEntity;

public class AldersInverkanEntityDAO 
{
	private static AldersInverkanEntityDAO instance;
	private EntityManager em;
	
	private AldersInverkanEntityDAO()
	{
		super();
		this.em = DBManager.getEntityManager();
	}
	
	public synchronized static AldersInverkanEntityDAO getInstance()
	{
		if(instance == null)
		{
			instance = new AldersInverkanEntityDAO();
		}
		return instance;
	}
	
	public AldersInverkanEntity getById(Long id)
	{
		Query q = em.createQuery("SELECT t FROM AldersInverkanEntity t WHERE t.id = :id");
		q.setParameter("id", id);
		return (AldersInverkanEntity) q.getSingleResult();
	}
	
	public AldersInverkanEntity save(AldersInverkanEntity e)
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
